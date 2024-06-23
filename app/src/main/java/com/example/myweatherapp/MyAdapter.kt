package com.example.myweatherapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.myweatherapp.MyAdapter.MyViewHolder

class MyAdapter(val context:Activity, var arrayList : Array<String>):
    RecyclerView.Adapter<MyViewHolder>() {
    class MyViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var name = itemView.findViewById<TextView>(R.id.city)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.custom_items, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text = arrayList[position]

    }
}