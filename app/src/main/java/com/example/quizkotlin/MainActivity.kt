package com.example.quizkotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var TimeBackPressed: Long = 0;
    //var tt : Toast=Toast(this);

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

    override fun onBackPressed(){

        val BackToast = Toast.makeText(baseContext, "Надмите еще раз, чтобы выйти", Toast.LENGTH_SHORT);

        if ((TimeBackPressed + 2000) > System.currentTimeMillis()) {
            BackToast.cancel();
            super.onBackPressed();
            return;
        }
        else {
            BackToast.show();
        }

        TimeBackPressed = System.currentTimeMillis();
    }

}