package com.example.violation

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.example.workoutbuddy.MainActivity
import com.example.workoutbuddy.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.mlkit.common.sdkinternal.SharedPrefManager


class loginactivity : AppCompatActivity() {

    private lateinit var sharedPrefManager: SharedPrefManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)



        val etUsername = findViewById<TextInputEditText>(R.id.etUserUsername)
        val etEmail = findViewById<TextInputEditText>(R.id.etUserEmail)
        val etPassword = findViewById<TextInputEditText>(R.id.etUserPassword)
        val btnLogin = findViewById<MaterialButton>(R.id.btnUserLogin)


        btnLogin.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()
            if(email=="ashish@gmail"||password=="ashish"){
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }


        }


    }




}
