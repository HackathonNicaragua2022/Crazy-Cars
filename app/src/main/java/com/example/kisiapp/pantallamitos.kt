package com.example.kisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class pantallamitos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantallamitos)


        val camila = findViewById<Button>(R.id.camila)
        camila.setOnClickListener {
            val camila = Intent(this, pantallanegracamila::class.java)
            startActivity(camila)
        }
    }
}