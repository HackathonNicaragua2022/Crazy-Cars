package com.example.kisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class pantallacuento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantallacuento)

        val mitos1 = findViewById<ImageView>(R.id.mitos1)
        mitos1.setOnClickListener {
            val mitos1 = Intent(this, pantallamitos::class.java)
            startActivity(mitos1)
        }
    }
}
