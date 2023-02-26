package com.example.taller1rv180800

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edtNombre : EditText
    lateinit var edtNota1 : EditText
    lateinit var edtNota2 : EditText
    lateinit var edtNota3 : EditText
    lateinit var edtNota4 : EditText
    lateinit var edtNota5 : EditText
    lateinit var btnprom : Button
    lateinit var txtResultado : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNombre = findViewById(R.id.edtNombre)
        edtNota1 = findViewById(R.id.edtNota1)
        edtNota2 = findViewById(R.id.edtNota2)
        edtNota3 = findViewById(R.id.edtNota3)
        edtNota4 = findViewById(R.id.edtNota4)
        edtNota5 = findViewById(R.id.edtNota5)
        btnprom = findViewById(R.id.btnprom)
        txtResultado = findViewById(R.id.txtResultado)

        btnprom.setOnClickListener(View.OnClickListener {
            val not1 = Integer.parseInt(edtNota1.text.toString())
            val not2 = Integer.parseInt(edtNota2.text.toString())
            val not3 = Integer.parseInt(edtNota3.text.toString())
            val not4 = Integer.parseInt(edtNota4.text.toString())
            val not5 = Integer.parseInt(edtNota5.text.toString())
            txtResultado.setText("El promedio es: " + prom(not1, not2, not3, not4, not5))
        })
    }
    fun prom(n1: Int, n2: Int, n3: Int, n4: Int, n5: Int) : Int{
        val sumaf = n1+n2+n3+n4+n5
        return sumaf / 5
    }
}