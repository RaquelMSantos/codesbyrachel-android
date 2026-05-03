package com.codesbyrachel.aula01_ciclodevida

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var orderCounter = 0
    private var lastOrderName = ""
    private val TAG = "CICLO_DE_VIDA"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: Fazendo a reserva e preparando a mesa")

        val tvQuantity = findViewById<TextView>(R.id.tv_quantity)
        val tvLastOrder = findViewById<TextView>(R.id.tv_last_order)
        val etLastOrderName = findViewById<EditText>(R.id.et_last_order_name)
        val btnAdd = findViewById<Button>(R.id.btn_add)

        if (savedInstanceState != null) {
            orderCounter = savedInstanceState.getInt("order", 0)
            lastOrderName = savedInstanceState.getString("last_order", "")

            tvQuantity.text = "$orderCounter"
            tvLastOrder.text = "Último pedido: $lastOrderName"

            Log.d(TAG, "Garçom leu o bloquinho! Pedido: $lastOrderName | Total: $orderCounter")
        } else {
            Log.d(TAG, "Primeira vez! Sem anotações")
        }

        btnAdd.setOnClickListener {
            val orderName = etLastOrderName.text.toString()

            if (orderName.isNotEmpty()) {
                orderCounter++
                lastOrderName = orderName

                tvQuantity.text = "$orderCounter"
                tvLastOrder.text = "Último pedido: $lastOrderName"

                etLastOrderName.text.clear()
                Log.d(TAG, "Novo pedido: $lastOrderName! Total: $orderCounter")
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("order", orderCounter)
        outState.putString("last_order", lastOrderName)
        Log.d(
            TAG,
            "Garçom anotou no bloquinho! $orderCounter pedidos e o último foi $lastOrderName"
        )
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: Você chega no restaurante e ve a mesa de longe")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: Você senta e faz o pedido")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: Uma interrupção (atender o telefone)")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: Levantando da mesa e indo ao banheiro")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: Pedindo a conta e indo embora")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: volta do banheiro")
    }
}
