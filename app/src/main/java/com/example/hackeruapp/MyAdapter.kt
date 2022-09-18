package com.example.hackeruapp

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val personList: MutableList<Person>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView
        val deleteImage: ImageView
        init {
            textView = view.findViewById(R.id.name)
            deleteImage = view.findViewById(R.id.deleteImg)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = personList[position].name
        holder.deleteImage.setOnClickListener{
            deleteItem(position)
        }
    }

        fun deleteItem(position: Int){
            personList.removeAt(position)
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int {
        return personList.size
    }


}