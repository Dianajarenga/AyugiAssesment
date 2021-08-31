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
        var etNum2=findViewById<TextView>(R.id.etNu2)
        var btnAdd=findViewById<Button>(R.id.btnAdd)
        var btnSub=findViewById<Button>(R.id.btnSub)
        var btnMultiplication=findViewById<Button>(R.id.btnmult)
        var btnDivision=findViewById<Button>(R.id.btnDiv)
        var btnSubmit=findViewById<Button>(R.id.btnSubmit)


    }
}