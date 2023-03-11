package com.example.activitys

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityMesaje : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView((R.layout.activity_mesaje))

        val messageField = findViewById<TextView>(R.id.textMesage)

        var iBundle: Bundle? = this.intent.extras

        if(iBundle != null){
            messageField.text="Hello ${iBundle.getString("Name")} Welcome"
        }
        val btnBye: Button=findViewById(R.id.btnBye)
        btnBye.setOnClickListener{onClick()}
    }


}