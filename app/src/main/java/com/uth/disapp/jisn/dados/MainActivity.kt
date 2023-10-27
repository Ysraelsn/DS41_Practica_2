package com.uth.disapp.jisn.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var resultado: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnThrow)
        val numdados = findViewById<EditText>(R.id.NumDice)
        val numlados = findViewById<EditText>(R.id.NumSides)
        val resultado = findViewById<TextView>(R.id.Result)

        button.setOnClickListener {
            dado
        }


    }

}