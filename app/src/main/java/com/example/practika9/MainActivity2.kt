package com.example.practika9

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.practika9.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var plus2: Button
    private lateinit var minus2: Button
    private lateinit var mulyt: Button
    private lateinit var devide: Button
    private lateinit var answers: TextView
    @SuppressLint("CutPasteId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        minus2=findViewById(R.id.minus1)
        mulyt=findViewById(R.id.multiply)
        plus2=findViewById(R.id.pluss)
        devide=findViewById(R.id.devide)
        answers=findViewById(R.id.answer)
        val num1=intent.getStringExtra("num1")
        val num2=intent.getStringExtra("num2")
        val numConvert1:Int= num1!!.toInt()
        val numConvert2:Int= num2!!.toInt()
        var result:Float
        plus2.setOnClickListener {
            result= (numConvert1+numConvert2).toFloat()
            answers.text= result.toString()
        }
        minus2.setOnClickListener {
            result= (numConvert1-numConvert2).toFloat()
            answers.text= result.toString()
        }
        mulyt.setOnClickListener {
            result= (numConvert1*numConvert2).toFloat()
            answers.text= result.toString()
        }
        devide.setOnClickListener {
            result= (numConvert1/numConvert2).toFloat()
            answers.text= result.toString()
        }
    }
}
