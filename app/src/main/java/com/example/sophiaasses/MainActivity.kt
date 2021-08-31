package com.example.sophiaasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var etNum1=findViewById<TextView>(R.id.etNum1)
        val etNum2=findViewById<TextView>(R.id.etNu2)
        val btnAdd=findViewById<Button>(R.id.btnAdd)
        val btnSub=findViewById<Button>(R.id.btnSub)
        val btnMultiplication=findViewById<Button>(R.id.btnmult)
        val btnDivision=findViewById<Button>(R.id.btnDiv)

    }
}