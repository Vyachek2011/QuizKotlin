package com.example.quizkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.activity.OnBackPressedDispatcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var TimeBackPressed: Long = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    fun OnOpenGameLevelsActivity(view: View)
    {
        val IntentGameLevels = Intent(this, GameLevels::class.java);
        //MyIntent.putExtra(GameLevels.TOTAL_THIRD, 123)
        startActivity(IntentGameLevels);
        finish();
    }

    override fun onBackPressed(): Unit  {
        var BackToast = Toast.makeText(baseContext, "Надмите еще раз, чтобы выйти", Toast.LENGTH_SHORT);

        if ((TimeBackPressed + 5000) > System.currentTimeMillis()) {
            BackToast.cancel();
            super.onBackPressed();
        }
        else {
            BackToast.show();
        }

        TimeBackPressed = System.currentTimeMillis();
    }

}