package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(){
    //this is an example of the variables that you will use
    lateinit var nbr_one_button : Button
    lateinit var add_button : Button
    lateinit var equal_button : Button
    var first_value = 0.0
    var second_value = 0.0
    var operation = ""
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState   )
        setContentView(R.layout.activity_main)
        result = findViewById(R.id.result)
        nbr_one_button = findViewById(R.id.one)  //this the methode how to link the button with a value
        nbr_one_button.setOnClickListener{
            writeText(nbr_one_button.text)
        }
        add_button = findViewById(R.id.add)
        add_button.setOnClickListener{
            //you can modify here the condition of the value
            first_value = result.text.toString().toDouble()
            operation = "+"
            result.text = ""
        }
        equal_button = findViewById(R.id.equal)
        equal_button.setOnClickListener{
            //you can write here the conditions to obtain the results
        }
    }
    fun writeText(text: CharSequence?) {
        //i gave you this function to use it with buttons for example if you click on button 7 two times it will show 77
        val sb = StringBuilder()
        sb.append(result.text).append(text)
        result.text = sb.toString()
    }
}
