package com.larramendi.dado

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image: ImageView = findViewById(R.id.imageView)
        val button: Button = findViewById(R.id.button)
        val text: TextView = findViewById(R.id.textView2)

        button.setOnClickListener {
            val value = (1..6).random()
            text.text = "Resultdo: ${value}"
        }
    }
}