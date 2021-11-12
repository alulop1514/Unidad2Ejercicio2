package com.example.unidad2_ejercicio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_actividad_saludar.*
import kotlinx.android.synthetic.main.activity_main.*


class ActividadSaludar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_saludar)

        tv1.text = "Hola ${intent.getStringExtra("Nombre")}, encantado"
    }
}