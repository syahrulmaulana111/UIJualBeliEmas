package com.example.uijualbeliemas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickButton: Button = findViewById(R.id.btnLogin)
        val etNama: EditText = findViewById(R.id.etEmail)
        val etUsername: EditText = findViewById(R.id.etPassword)

        clickButton.setOnClickListener{
            val nama = etNama.text.toString()
            val username = etUsername.text.toString()
            if(nama == "user" && username == "123") {
                intent = Intent(this, HalamanDua::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Masukkan username & password dengan benar", Toast.LENGTH_SHORT).show()
            }
        }
    }
}