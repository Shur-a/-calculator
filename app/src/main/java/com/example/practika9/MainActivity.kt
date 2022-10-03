package com.example.practika9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.practika9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.Continue.setOnClickListener{
            val intent= Intent(this,MainActivity2::class.java)
            val num1= binding.number1.text.toString()
            val num2= binding.number2.text.toString()
            intent.putExtra("num1",num1)
            intent.putExtra("num2",num2)
            startActivity(intent)
        }



    }


}