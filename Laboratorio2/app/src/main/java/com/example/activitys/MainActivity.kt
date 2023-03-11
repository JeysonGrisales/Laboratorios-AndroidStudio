package com.example.activitys

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import  android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var texto : EditText? = null
    var resultText: EditText? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: bundle?){
        super.onCreate(savedInstanceState)
        setContentView((R.layout.activity_main))

        texto = findViewById((R.id.namePerson))
        resultText = findViewById(R.id.resulText)

        val boton: Button= findViewById(R.id.BtnNext)
        boton.setOnClickListener{onClick(1)}

        val botonTwo: Button= findViewById(R.id.BtnNextTwo)
        botonTwo.setOnClickListener{onClick(2)}
    }

    private fun onClick(boton: int){
        when(boton){
            1 -> {
                var name: String = texto!!.text.toString()
                resultText!!.text = "Welcome $name"
                Toast.makeText(this, "Welcome $name", Toast.LENGTH_LONG).show()
            }
            2 -> {
                val intent = Intent(this, ActivityMesaje::class.java)
                val iBundle: Bundle= Bundle()

                iBundle.putString("Name", texto!!.text.toString())
                intent.putExtras(iBundle)

                startActivity(intent)
            }
        }
    }
}