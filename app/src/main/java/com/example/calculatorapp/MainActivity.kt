package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var display_result:TextView
    lateinit var first_edit:EditText
    lateinit var seccond_edit:EditText
    lateinit var btn_add:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        first_edit=findViewById(R.id.editText1)
        seccond_edit=findViewById(R.id.edtnum2)
        btn_add=findViewById(R.id.btnadd)

        btn_add.setOnClickListener {
            var num1 = first_edit.text.toString().trim()
            var num2 = seccond_edit.text.toString().trim()

            var first_num=num1.toDouble()
            var second_num=num2.toDouble()

            var result = first_num + second_num

            var finalresult = result.toString()

            Toast.makeText(this, finalresult, Toast.LENGTH_SHORT).show()
        }
    }
}