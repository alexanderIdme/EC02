package com.example.evaluacion02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMap = findViewById<View>(R.id.buttonMap)
        val buttonCamera = findViewById<View>(R.id.buttonCamera)

        buttonMap.setOnClickListener {
            startActivity(Intent(this, MapaActivity::class.java))
            finish()
        }

        buttonCamera.setOnClickListener {
            startActivity(Intent(this, CamaraActivity::class.java))
            finish()

        }
    }
}