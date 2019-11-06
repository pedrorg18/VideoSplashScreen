package com.pedroroig.videosplashscreen.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pedroroig.videosplashscreen.MainActivity
import com.pedroroig.videosplashscreen.R


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

    }


    private fun goToMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}
