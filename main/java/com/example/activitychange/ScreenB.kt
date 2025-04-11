package com.example.activitychange

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ScreenB : AppCompatActivity() {
    private  lateinit var txtRes : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen_b)
        txtRes = findViewById(R.id.txtRes)
        var data = intent.getStringExtra("Data")
        txtRes.text = data.toString()

    }
}