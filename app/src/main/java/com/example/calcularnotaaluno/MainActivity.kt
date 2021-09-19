package com.example.calcularnotaaluno

import android.graphics.Color
import android.graphics.Color.GREEN
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoCalcular :Button = btnCalcular
        val txtResultado :TextView = txtResultado

        botaoCalcular.setOnClickListener{
            val txtNota1 :Int = Integer.parseInt(txtNota1.text.toString())
            val txtNota2 :Int = Integer.parseInt(txtNota2.text.toString())
            val media :Int = (txtNota1 + txtNota2) / 2
            val txtFaltas :Int = Integer.parseInt(txtFaltas.text.toString())

            if (media >= 6 && txtFaltas <=10){
                txtResultado.setText("Aluno foi Aprovado" + "\n" + "Nota Final: " + media + "\n" + "faltas " + txtFaltas )
                txtResultado.setTextColor(Color.GREEN)

            }else{
                txtResultado.setText("Aluno foi Reprovado" + "\n" + "Nota Final: " + media + "\n" + "faltas " + txtFaltas )
                txtResultado.setTextColor(Color.RED)
            }

        }

    }
}