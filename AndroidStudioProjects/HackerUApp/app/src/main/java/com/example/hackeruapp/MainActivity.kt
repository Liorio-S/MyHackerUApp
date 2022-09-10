package com.example.hackeruapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun handleClick(view: View){
        val textView: TextView = findViewById(R.id.hello_text)
        textView.text = "Hello ${getName()}"
    }

    fun getName(): String {
     return findViewById<EditText>(R.id.text_editor).text.toString()
    }
}