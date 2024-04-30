package com.example.navegacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navegacion.databinding.ActivityPantalla2Binding

class Pantalla2 : AppCompatActivity() {
    lateinit var binding: ActivityPantalla2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantalla2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var intent = intent
        binding.txtNombre.setText(intent.getStringExtra("Nombre"))
        binding.txtApellido.setText(intent.getStringExtra("Apellido"))
        binding.txtEdad.setText(intent.getIntExtra("Edad", 0).toString())
    }
}