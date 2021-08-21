package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var add = findViewById<TextView>(R.id.ettask)
        var addButton = findViewById<TextView>(R.id.btnAdd)
        var result = findViewById<TextView>(R.id.et1)
        var result2 = findViewById<TextView>(R.id.et2)
        var result3 = findViewById<TextView>(R.id.et3)
        var result4 = findViewById<TextView>(R.id.et4)
        var result5 = findViewById<TextView>(R.id.et5)
        var next=findViewById<Button>(R.id.etNext)
        next.setOnClickListener{
            var display = Intent(baseContext,Checkbox::class.java)
            startActivity(display)
        }
        addButton.setOnClickListener {
            result.setText(add.text.toString())
            addButton.setOnClickListener {
                result2.setText(add.text.toString())
                addButton.setOnClickListener {
                    result3.setText(add.text.toString())
                    addButton.setOnClickListener {
                        result4.setText(add.text.toString())
                        addButton.setOnClickListener {
                            result5.setText(add.text.toString())


                        }
                    }
                }
            }
        }
    }
}






