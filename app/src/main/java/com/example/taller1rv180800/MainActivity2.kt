package com.example.taller1rv180800

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var edtNombre : EditText
    lateinit var edtSalario : EditText
    lateinit var btncalcular : Button
    lateinit var txtResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        edtNombre = findViewById(R.id.edtNombre)
        edtSalario = findViewById(R.id.edtSalario)
        btncalcular = findViewById(R.id.btncalcular)
        txtResultado = findViewById(R.id.txtResultado)

        btncalcular.setOnClickListener(View.OnClickListener {
            val nom = Integer.parseInt(edtNombre.text.toString())
            val salario = Integer.parseInt(edtSalario.text.toString())
            txtResultado.setText("Su salario neto es: " + calculo(salario))
        })
    }
    fun calculo(sal: Int) : Int{
        var costo = 60
        return sal-costo
    }
}