package com.example.appavaliacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTeste: Button = findViewById(R.id.btnTeste)
        btnTeste.setOnClickListener { teste() }
    }
    private fun teste(){
        val num01: EditText = findViewById(R.id.num01)
        val num02: EditText = findViewById(R.id.num02)

        if(num01.text.isNotEmpty() && num02.text.isNotEmpty()){
            if(Integer.parseInt(num01.text.toString()) > Integer.parseInt(num02.text.toString())) {
                Toast.makeText(this, "O Primeiro Número é Maior", Toast.LENGTH_SHORT).show()
            }else if(Integer.parseInt(num01.text.toString()) == Integer.parseInt(num02.text.toString())) {
                Toast.makeText(this, "Os Números São Iguais", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "O Segundo Número é Maior", Toast.LENGTH_SHORT).show()
            }
        }
    }
}