package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(){
    lateinit var delete_button : Button
    lateinit var div_button : Button
    lateinit var percent_button : Button
    var first_value = 0.0
    var second_value = 0.0
    var operation = ""
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState   )
        setContentView(R.layout.activity_main)
        result = findViewById(R.id.result)
        delete_button = findViewById(R.id.delete)
        delete_button.setOnClickListener{
            result.text = ""
        }
        div_button = findViewById(R.id.division)
        div_button.setOnClickListener{
            first_value = result.text.toString().toDouble()
            operation = "÷"
            result.text = ""
        }
        percent_button = findViewById(R.id.percent)
        percent_button.setOnClickListener{
            first_value = result.text.toString().toDouble()
            operation = "%"
            result.text = (first_value / 100).toString()
        }
    }
    fun writeText(text: CharSequence?) {
        val sb = StringBuilder()
        sb.append(result.text).append(text)
        result.text = sb.toString()
    }
}
