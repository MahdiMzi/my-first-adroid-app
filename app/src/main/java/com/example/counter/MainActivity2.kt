package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var num : TextView = findViewById(R.id.counter_show)
        var plusbutton : Button = findViewById(R.id.btnPlus)
        var minusbutton : Button = findViewById(R.id.btnMinus)
        var resetbutton : Button = findViewById(R.id.btnReset)

        var counter : Int = 0

        plusbutton.setOnClickListener {
            num.setText ( " " + ++counter )
        }

        minusbutton.setOnClickListener {
            num.setText ( " " + --counter )
        }

        resetbutton.setOnClickListener {
            counter = 0
            num.setText ( " " + counter  )
        }




    }
}