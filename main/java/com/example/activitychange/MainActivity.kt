  package com.example.activitychange

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnChange: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnChange = findViewById(R.id.btnChange)

//        btnChange.setOnClickListener {
//val intent = Intent(this, ScreenB::class.java)
//                startActivity(intent)
//        }

        btnChange.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Change Activity")
            builder.setMessage("Do you want to change screen?")
            builder.setPositiveButton("Yes"){dialog, which ->
                val intent = Intent(this, ScreenB::class.java)
                intent.putExtra("Data", "Hi I'm kotlin from another screen")
                startActivity(intent)

            }
            builder.setNegativeButton("No"){dialog, which->
                dialog.dismiss()
            }
            val dialog:AlertDialog = builder.create()
            dialog.show()
        }



    }
}