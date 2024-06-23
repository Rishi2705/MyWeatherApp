package com.example.myweatherapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.myweatherapp.databinding.ActivityCitiesBinding

class CitiesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCitiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCitiesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recycle.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
        val city_name = arrayOf("Lucknow","Delhi","Kanpur","Ghaziabad","Banaras","Noida","Bengaluru","Dispur",
            "Chennai","Mumbai","Surat","Raipur","Bhopal","Pune")
        binding.recycle.adapter = MyAdapter(this,city_name)
    }
}