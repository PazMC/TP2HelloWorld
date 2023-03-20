package com.example.tp2helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var editTextUser: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextUser = findViewById(R.id.etUser)
        button = findViewById(R.id.toastButton)

        button.setOnClickListener {
            val text = editTextUser.text
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}
