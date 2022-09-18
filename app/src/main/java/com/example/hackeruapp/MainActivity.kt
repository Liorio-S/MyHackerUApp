package com.example.hackeruapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val personList = mutableListOf<Person>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonClick()

    }

        fun buttonClick(){
            val button = findViewById<Button>(R.id.lucky_button)
            button.setOnClickListener{
                createRecycler()

            }
        }

        fun  createRecycler(){
            val recycler = findViewById<RecyclerView>(R.id.recycle)
            addToList()
            val adapter = MyAdapter(personList)
            recycler.adapter = adapter
        }

        fun addToList(){
            val nameText = findViewById<EditText>(R.id.name)
            val ageText = findViewById<EditText>(R.id.age)
            personList.add(Person(nameText.text.toString(), ageText.text.toString().toInt() ))
            println(personList)


        }


}