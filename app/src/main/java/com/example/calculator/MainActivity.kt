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
    var ResultOperation: Double = 0.0;
    lateinit var numRes: TextView
    lateinit var numRes2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numRes = findViewById(R.id.numRes)
        numRes2 = findViewById(R.id.numRes2)
        val btnRemove: Button = findViewById(R.id.BtnRemove)
        val btnResolve: Button = findViewById(R.id.btnEnter)
    }

    fun AccionButton(view: View){
        var numSalida: String = numRes2.text.toString()

        when(view.id){
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
            R.id.btnPoint -> numRes2.setText(numSalida + ".")
        }
    }

    fun AccionOperation(view: View){
        ResultOperation = numRes2.text.toString().toDouble()

        var num2_text: String = numRes2.text.toString()

        numRes2.setText("")

        when(view.id){
            R.id.btnAdd -> {
                numRes.setText(num2_text + "+")
                oper = 1
            }
            R.id.btnSus -> {
                numRes.setText(num2_text + "-")
                oper = 2
            }
            R.id.btnMul -> {
                numRes.setText(num2_text + "*")
                oper = 3
            }
            R.id.btnDiv -> {
                numRes.setText(num2_text + "/")
                oper = 4
            }

        }
    }


//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

}