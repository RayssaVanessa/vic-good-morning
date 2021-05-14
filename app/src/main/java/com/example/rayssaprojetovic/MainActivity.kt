package com.example.rayssaprojetovic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var meuNome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       meuNome = findViewById(R.id.titulo)
        Mensagem()
    }

 fun Mensagem(){
     meuNome.text = "Bom dia, Rayssa!"
   }
 }







