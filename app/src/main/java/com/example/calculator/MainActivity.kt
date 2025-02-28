package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
//    operador - suma = 1 - resta = 2 - multiplicacion = 3 - division = 4
    var oper: Int = 0
    var numberPreview: Double = 0.0;
    var ResultOpertaion: Double = 0.0
    var contador = 0
    lateinit var numRes: TextView
    lateinit var numRes2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numRes = findViewById(R.id.numRes)
        numRes2 = findViewById(R.id.numRes2)
        val btnRemove: Button = findViewById(R.id.BtnRemove)
        val btnResolve: Button = findViewById(R.id.btnEnter)
        val btnAddition: Button = findViewById(R.id.btnAdd)
        val btnSustraction: Button = findViewById(R.id.btnSus)
        val btnMultiplication: Button = findViewById(R.id.btnMul)
        val btnDivider: Button = findViewById(R.id.btnDiv)

        btnResolve.setOnClickListener{
            var numberResult: Double = numRes2.text.toString().toDouble()

            when(oper){
                1 -> ResultOpertaion = numberPreview + numberResult
                2 -> ResultOpertaion = numberPreview - numberResult
                3 -> ResultOpertaion = numberPreview * numberResult
                4 -> ResultOpertaion = numberPreview / numberResult
            }

            numRes2.setText(ResultOpertaion.toString())
            numRes.setText("")
            contador = 0
        }

        btnRemove.setOnClickListener{
            numRes.setText("")
            numRes2.setText("")
            numberPreview = 0.0
            oper = 0
            contador = 0
        }

    }

    fun AccionButton(view: View){
        var numSalida: String = numRes2.text.toString()

            when (view.id) {
                R.id.btn0 -> numRes2.setText(numSalida + "0")
                R.id.btn1 -> numRes2.setText(numSalida + "1")
                R.id.btn2 -> numRes2.setText(numSalida + "2")
                R.id.btn3 -> numRes2.setText(numSalida + "3")
                R.id.btn4 -> numRes2.setText(numSalida + "4")
                R.id.btn5 -> numRes2.setText(numSalida + "5")
                R.id.btn6 -> numRes2.setText(numSalida + "6")
                R.id.btn7 -> numRes2.setText(numSalida + "7")
                R.id.btn8 -> numRes2.setText(numSalida + "8")
                R.id.btn9 -> numRes2.setText(numSalida + "9")
                R.id.btnPoint -> {
                    if (contador < 1) {
                        numRes2.setText(numSalida + ".")
                        contador++
                    }
                }
            }

    }

    fun AccionOperation(view: View){
        numberPreview = numRes2.text.toString().toDouble()

        var num2_text: String = numRes2.text.toString()


        numRes2.setText("")

        when(view.id){
            R.id.btnAdd -> {
                numRes.setText(num2_text + "+")
                oper = 1
                contador = 0
            }
            R.id.btnSus -> {
                numRes.setText(num2_text + "-")
                oper = 2
                contador = 0
            }
            R.id.btnMul -> {
                numRes.setText(num2_text + "*")
                oper = 3
                contador = 0
            }
            R.id.btnDiv -> {
                numRes.setText(num2_text + "/")
                oper = 4
                contador = 0
            }

        }
    }
}