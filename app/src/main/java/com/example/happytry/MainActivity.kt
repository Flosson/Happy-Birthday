package com.example.happytry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val happyTry:Button=findViewById(R.id.button)
        happyTry.setOnClickListener {
            val toast=Toast.makeText(this,"Live Longer To Blow Thousand Candles",Toast.LENGTH_LONG)
            toast.show()
        }
    }
}