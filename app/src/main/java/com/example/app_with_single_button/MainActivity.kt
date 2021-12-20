package com.example.app_with_single_button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tvName: TextView
    lateinit var edName: EditText
    lateinit var btnClick: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connctView()
        btnClick.setOnClickListener {
            tvName.text = edName.text.toString()
        }

    }

    private fun connctView(){
        tvName = findViewById(R.id.tvResult)
        edName = findViewById(R.id.etName)
        btnClick = findViewById(R.id.updateBtn)
    }


}