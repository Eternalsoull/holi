package com.example.navegacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navegacion.databinding.ActivityPantalla3Binding

class Pantalla3 : AppCompatActivity() {
    lateinit var binding: ActivityPantalla3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantalla3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var intent = intent
        binding.txtCarro.setText(intent.getStringExtra("Carro"))
        binding.txtColor.setText(intent.getStringExtra("Color"))
        binding.txtValor.setText(intent.getIntExtra("Valor", 0).toString())
    }
}