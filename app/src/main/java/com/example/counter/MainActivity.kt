package com.example.counter


import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numberOfTouchButton = 1

        //show count of active activity counter

        var show : TextView = findViewById(R.id.showNumberActiveCounter)

        //create recyclerview

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()


        //navigation to activity 2

        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {

            show.setText ( "you have " + numberOfTouchButton + " active counter" )

            //create recyclerview with click button

            data.add(ItemsViewModel("Counter Title " + numberOfTouchButton))
            val adapter = CustomAdapter(data)
            recyclerView.adapter = adapter

            numberOfTouchButton++

            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }




    }

    //create sharedprefrences file
    /*fun onSave(view: View) {
        val pref = getPreferences(Context.MODE_PRIVATE)
        val editor = pref.edit()

        //save counter
        editor.putInt(" ", counter.text.toString().toInt())

        editor.commit()

        val toast = Toast.makeText(applicationContext,"saved",Toast.LENGTH_LONG)
        toast.setGravity(Gravity.TOP,0,140)
        toast.show()

    }*/
}