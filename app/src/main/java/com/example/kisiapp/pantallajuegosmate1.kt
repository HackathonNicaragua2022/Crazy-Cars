package com.example.kisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pantallajuegosmate1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantallajuegosmate1)


        val nivel1= findViewById<Button>(R.id.nivel1)
        nivel1.setOnClickListener {
            val intent = Intent(this, pantallajuegosmate2::class.java)
            startActivity(intent)
        }
    }

}