package com.example.unidad2_ejercicio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener {
            val nombre = "${etNombre.text} ${etApellido.text}"
            val intent = Intent(applicationContext, ActividadSaludar::class.java)
            intent.putExtra("Nombre", nombre)
            startActivity(intent)
        }
    }
}