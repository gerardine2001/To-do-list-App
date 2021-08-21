package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class Checkbox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox)
        var toDay=findViewById<CheckBox>(R.id.etCheck)
        var toMorrow=findViewById<CheckBox>(R.id.etcheckBox2)
        var nextWeek=findViewById<CheckBox>(R.id.etCheckBox3)
        var back=findViewById<Button>(R.id.btnBack)
        var cal=findViewById<Button>(R.id.etCalendar)
        back.setOnClickListener {
            var display=Intent(baseContext,MainActivity::class.java)
            startActivity(display)

        }
        cal.setOnClickListener {
            var calendar = Intent(baseContext, calendar::class.java)
            startActivity(calendar)
        }

                                    




    }

}