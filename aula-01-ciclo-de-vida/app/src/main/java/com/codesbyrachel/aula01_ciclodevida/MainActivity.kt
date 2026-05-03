package com.codesbyrachel.aula01_ciclodevida

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var orderCounter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tvQuantity = findViewById<TextView>(R.id.tv_quantity)
        val btnAdd = findViewById<Button>(R.id.btn_add)

        btnAdd.setOnClickListener {
            orderCounter++
            tvQuantity.text = "$orderCounter"
        }
    }
}

