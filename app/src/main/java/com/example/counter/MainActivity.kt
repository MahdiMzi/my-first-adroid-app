package com.example.counter


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()

        for (i in 1..5) {
            data.add(ItemsViewModel("Item " + i))
        }

        val adapter = CustomAdapter(data)

        recyclerView.adapter = adapter

        //navigation to activity 2

        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            //Toast.makeText("this", Toast.LENGTH_SHORT).show()

            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }


    }
}