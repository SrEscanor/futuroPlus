package com.example.futuroplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var buttonCadastrar = findViewById<Button>(R.id.button_cadastrar)
        buttonCadastrar.setOnClickListener {
            var intent = Intent(this,activity_cadastro::class.java)
            startActivity(intent)
        }
        var buttonLogar = findViewById<Button>(R.id.button_logar)
        buttonLogar.setOnClickListener {
            var intent = Intent(this, activity_login::class.java)
            startActivity(intent)
        }
    }
}