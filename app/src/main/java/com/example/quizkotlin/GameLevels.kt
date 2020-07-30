package com.example.quizkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity

class GameLevels : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gamelevels)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    fun OnOpenMainActivity(view: View){

        val IntentMainActivity = Intent(this, MainActivity::class.java);
        startActivity(IntentMainActivity);
        finish();
    }


    override fun  onBackPressed(): Unit {
        val IntentMainActivity = Intent(this, MainActivity::class.java);
        startActivity(IntentMainActivity);
        finish();
    }

}