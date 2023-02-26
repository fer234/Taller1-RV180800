package com.example.taller1rv180800

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    lateinit var edtNumero1 : EditText
    lateinit var edtNumero2 : EditText
    lateinit var btnSumar : Button
    lateinit var btnRestar : Button
    lateinit var btnmul : Button
    lateinit var btndividir : Button
    lateinit var txtResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        edtNumero1 = findViewById(R.id.edtNumero1)
        edtNumero2 = findViewById(R.id.edtNumero2)
        btnSumar = findViewById(R.id.btnSumar)
        btnRestar = findViewById(R.id.btnRestar)
        btnmul = findViewById(R.id.btnmul)
        btndividir = findViewById(R.id.btndividir)
        txtResultado = findViewById(R.id.txtResultado)

        btnSumar.setOnClickListener(View.OnClickListener {
            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())
            txtResultado.setText("La suma es: " + sumar(num1, num2))
        })
        btnRestar.setOnClickListener(View.OnClickListener {
            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())
            txtResultado.setText("La resta es: " + restar(num1, num2))
        })
        btnmul.setOnClickListener(View.OnClickListener {
            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())
            txtResultado.setText("El producto es: " + mult(num1, num2))
        })
        btndividir.setOnClickListener(View.OnClickListener {
            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())
            txtResultado.setText("La division es: " + dividir(num1, num2))
        })
    }
    fun sumar(numero1: Int, numero2: Int) : Int{
        return numero1 + numero2
    }
    fun restar(numero1: Int, numero2: Int) : Int{
        return numero1 - numero2
    }
    fun mult(numero1: Int, numero2: Int) : Int{
        return numero1 * numero2
    }
    fun dividir(numero1: Int, numero2: Int) : Int{
        return numero1 / numero2
    }
}