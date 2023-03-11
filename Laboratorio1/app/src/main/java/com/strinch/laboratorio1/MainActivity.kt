package com.strinch.laboratorio1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton


class MainActivity : AppCompatActivity() {
    var name: EditText? = null
    var age: EditText? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageButton>(R.id.imageButton)
        var imageButtonState: Boolean = false
        var estadoImage: String = ""

        name = findViewById(R.id.namePerson)
        age = findViewById(R.id.agePerson)

        image.setOnClickListener {
            imageButtonState = !imageButtonState
            if (imageButtonState) {
                estadoImage="True Image"
            } else {
                estadoImage="False Image"
            }
        }
        val btnCalculater: Button=findViewById(R.id.btnSend)
        btnCalculater.setOnClickListener({goCalculate(estadoImage)})
    }

    private fun goCalculate(estadoImage: String){
        var text: String = ""
        var nameTwo: String = name!!.text.toString()
        var ageTwo: Int = age!!.text.toString().toInt()

        val checkBoxOne = findViewById<CheckBox>(R.id.checkBoxOne)
        val checkBoxTwo = findViewById<CheckBox>(R.id.checkBoxTwo)
        val radioButtonOne = findViewById<RadioButton>(R.id.radioButtonOne)
        val radioButtonTwo = findViewById<RadioButton>(R.id.radioButtonTwo)
        val toggleButton = findViewById<ToggleButton>(R.id.toggleButton)
        val switch1 = findViewById<Switch>(R.id.switch1)


        if(checkBoxOne.isChecked){
            text+="Check 1 seleccionado\n"
        }
        if(checkBoxTwo.isChecked){
            text+="Check 2 seleccionado\n"
        }
        if(radioButtonOne.isChecked){
            text+="Radio 1 seleccionado\n"
        }
        if(radioButtonTwo.isChecked){
            text+="Radio 2 seleccionado\n"
        }
        if(toggleButton.isChecked){
            text+="ToggleButton seleccionado\n"
        }
        if(switch1.isChecked){
            text+="Switch seleccionado\n"
        }

        text+="${nameTwo}\n"
        text+="${ageTwo}\n"
        text+="${estadoImage}\n"

        Toast.makeText(this, "${text}", Toast.LENGTH_LONG).show()
    }
}
