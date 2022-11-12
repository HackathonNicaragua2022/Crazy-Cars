package com.example.kisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class pantalla2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)

        val rompe_cabezas=findViewById<ImageView>(R.id.rompe_cabezas)
        rompe_cabezas.setOnClickListener {
            val intent = Intent(this, pantalla3::class.java)
            startActivity(intent)
        }

        val cuentos=findViewById<ImageView>(R.id.cuentos)
        cuentos.setOnClickListener {
            val intent = Intent(this, pantallacuento::class.java)
            startActivity(intent)
        }

        val juegosmatematicos=findViewById<ImageView>(R.id.juegosmatematicos)
        juegosmatematicos.setOnClickListener {
            val intent = Intent(this, pantallajuegosmate1::class.java)
            startActivity(intent)
        }
    }
    }
