package com.example.finalpbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Register_page : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        var reg_name = findViewById(R.id.reg_name) as EditText
        var reg_email = findViewById(R.id.reg_email) as EditText
        var reg_password = findViewById(R.id.reg_password) as EditText
        var conf_password = findViewById(R.id.conf_password) as EditText
        var btn_register = findViewById(R.id.btn_register) as Button


        // set on-click listener
        btn_register.setOnClickListener {
            val name = reg_name.text.toString();
            val user_name = reg_email.text.toString();
            val password = reg_password.text.toString();
            val confirm_password = conf_password.text.toString();

            checkError(reg_name);
            checkError(reg_email);
            checkPassword(reg_password, conf_password);
        }


    }

    fun checkError (view:EditText){
        if (view.text.toString() == ""){
            view.setError("Field harus diisi")
        }

    }

    fun checkPassword (password:EditText, conf_pass: EditText){
        if (password.text.toString() == "") {
            password.setError("Password harus diisi")
        }else if (conf_pass.text.toString() == "") {
            conf_pass.setError("Password harus diisi")
        } else {
            if (password.text.toString() == conf_pass.text.toString()) {
                val intent = Intent(this, Dashboard::class.java)
                startActivity(intent)
                finish()
                Toast.makeText(this@Register_page, "Berhasil Membuat Akun", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this@Register_page, "Password tidak sesuai!", Toast.LENGTH_LONG).show()
            }
        }
    }
}