package com.example.finalpbm


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class Login_page : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)


        var eg_email = findViewById(R.id.ed_email) as EditText
        var eg_password = findViewById(R.id.ed_password) as EditText
        var btn_signin = findViewById(R.id.btn_signin) as Button


        // set on-click listener
        btn_signin.setOnClickListener {
            val user_name = eg_email.text.toString();
            val password = eg_password.text.toString();

            if (user_name == "tugas@pbm.com" || password == "pbm") {
                val intent = Intent(this, Dashboard::class.java)
                startActivity(intent)
                finish()
                Toast.makeText(this@Login_page, "Berhasil Login", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this@Login_page, "Email atau Password salah!", Toast.LENGTH_LONG).show()
            }
        }
    }
}