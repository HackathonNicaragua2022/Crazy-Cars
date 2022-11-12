package com.example.kisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       val inicio = findViewById<Button>(R.id.inicio)
        inicio.setOnClickListener {
            val inicio = Intent(this, pantalla2::class.java)
            startActivity(inicio)
        }

        val crearcuenta = findViewById<Button>(R.id.crearcuenta)
        crearcuenta.setOnClickListener {
            val intent = Intent(this, pantallacuenta::class.java)
            startActivity(intent)
        }
    }
}
