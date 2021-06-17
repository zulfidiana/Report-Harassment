package com.example.finalpbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         var btn_login = findViewById<Button>(R.id.btn_login) as Button
         var btn_register = findViewById<Button>(R.id.btn_register) as Button

        // when user tap on the button
        btn_login.setOnClickListener{

            val intent = Intent (this, Login_page::class.java)
            startActivity(intent)

        }

        btn_register.setOnClickListener{

            val intent = Intent (this, Register_page::class.java)
            startActivity(intent)

        }

    }
}