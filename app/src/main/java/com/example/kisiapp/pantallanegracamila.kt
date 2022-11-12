package com.example.kisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class pantallanegracamila : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantallanegracamila)


        val siguiente = findViewById<ImageView>(R.id.siguiente)
        siguiente.setOnClickListener {
            val siguiente = Intent(this, pantallanegracamila2::class.java)
            startActivity(siguiente)
        }
    }
}