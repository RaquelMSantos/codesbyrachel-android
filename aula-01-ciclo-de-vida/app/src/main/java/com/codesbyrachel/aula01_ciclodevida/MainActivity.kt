package com.codesbyrachel.aula01_ciclodevida

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var orderCounter = 0
    private val TAG = "CICLO_DE_VIDA"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: Fazendo a reserva e preparando a mesa")

        val tvQuantity = findViewById<TextView>(R.id.tv_quantity)
        val btnAdd = findViewById<Button>(R.id.btn_add)

        if (savedInstanceState != null) {
            orderCounter = savedInstanceState.getInt("order", 0)
            tvQuantity.text = "$orderCounter"
            Log.d(TAG, "Garçom leu o bloquinho! Pedidos recuperados: $orderCounter")
        } else {
            Log.d(TAG, "Primeira vez! Sem anotações")
        }

        btnAdd.setOnClickListener {
            orderCounter++
            tvQuantity.text = "$orderCounter"
            Log.d(TAG, "Novo pedido! Total: $orderCounter")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("order", orderCounter)
        Log.d(TAG, "Garçom anotou no bloquinho! $orderCounter pedidos")
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
