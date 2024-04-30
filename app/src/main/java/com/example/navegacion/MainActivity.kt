package com.example.navegacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.navegacion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnScreenOne.setOnClickListener(this)
        binding.btnScreenTwo.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btnScreenOne -> {
                val intent = Intent(this, Pantalla2::class.java)
                val txtCampoNombre = binding.txtCampoNombre
                intent.putExtra("Nombre", txtCampoNombre.text.toString())
                intent.putExtra("Edad", 23)
                intent.putExtra("Apellido", "Bermudez")
                startActivity(intent)
            }
            R.id.btnScreenTwo -> {
                val intent = Intent(this, Pantalla3::class.java)
                val txtCampoNombreCarro = binding.txtCampoCarro
                intent.putExtra("Carro", txtCampoNombreCarro.text.toString())
                intent.putExtra("Color", "Rojo")
                intent.putExtra("Valor", 150000000)

                startActivity(intent)
            }
        }
    }
}