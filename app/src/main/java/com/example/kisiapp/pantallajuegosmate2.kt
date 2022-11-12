package com.example.kisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class pantallajuegosmate2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantallajuegosmate2)

        val volver = findViewById<TextView>(R.id.volver)
            volver.setOnClickListener {
            val intent = Intent(this, pantalla2::class.java)
            startActivity(intent)
        }
    }
}