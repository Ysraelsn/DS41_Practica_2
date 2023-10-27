package com.uth.disapp.jisn.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.content.Intent
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_layout)

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity((intent))
            finish()
        },2000)
    }


}