package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var etButton = findViewById<Button>(R.id.etButtonLbl)
        var etWeak = findViewById<TextView>(R.id.etWeakLbl)
        var etCompleter = findViewById<TextView>(R.id.etComlpLbl)
        var etCreate = findViewById<TextView>(R.id.etCretLbl)
        var etCre = findViewById<TextView>(R.id.etCretLbl)
        var etHave = findViewById<TextView>(R.id.etHaveLbl)
        var etUpdate = findViewById<TextView>(R.id.etUpdateLbl)
        var etclear = findViewById<Button>(R.id.etClear)
    }
}