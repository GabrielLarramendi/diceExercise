package com.larramendi.dado

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
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
        var x = 0

        button.setOnClickListener {
            val value = (1..6).random()
            text.text = "Resultdo: ${value}"

            when(value) {
                1 -> image.setImageResource(R.drawable.dice1)
                2 -> image.setImageResource(R.drawable.dice2)
                3 -> image.setImageResource(R.drawable.dice3)
                4 -> image.setImageResource(R.drawable.dice4)
                5 -> image.setImageResource(R.drawable.dice5)
                6 -> image.setImageResource(R.drawable.dice6)


            }
            if (value == x) {
                Toast.makeText(this, "Número repetido", Toast.LENGTH_SHORT).show()
            }
            x = value
        }
    }
}