package com.studio.conversordemedidaskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //carregar componentes
        val btnComprimento = findViewById<ImageButton>(R.id.btnComprimento)
        val btnDados = findViewById<ImageButton>(R.id.btnDados)
        val btnTemperatura = findViewById<ImageButton>(R.id.btnTemperatura)
        val btnPeso = findViewById<ImageButton>(R.id.btnPeso)

        btnComprimento.setOnClickListener {
            val intent = Intent(this, ConversorComprimento::class.java)
            startActivity(intent)
        }

        btnDados.setOnClickListener {
            val intent = Intent (this, ConversorDados::class.java)
            startActivity(intent)
        }

        btnTemperatura.setOnClickListener {
            val intent = Intent(this, ConversorTemperatura::class.java)
            startActivity(intent)
        }

        btnPeso.setOnClickListener {
            val intent = Intent(this, ConversorPeso::class.java)
            startActivity(intent)
        }


    }
}
