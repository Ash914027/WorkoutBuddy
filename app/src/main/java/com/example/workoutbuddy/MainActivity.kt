package com.example.workoutbuddy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val getstarted: Button = findViewById(R.id.getstarted)
        val getstarted2: Button = findViewById(R.id.getstarted2)
        val before18: ImageView = findViewById(R.id.before18)
        val after18: ImageView = findViewById(R.id.after18)
        before18.setOnClickListener {
            val intent = Intent(this, secondActivity::class.java)
                    startActivity(intent)

        }
        after18.setOnClickListener {
            val intent = Intent(this, secondActivity2::class.java)
            startActivity(intent)

        }
        getstarted.setOnClickListener {
            val intent =Intent(this, secondActivity::class.java)
            startActivity(intent)

        }
        getstarted2.setOnClickListener {
            val intent = Intent(this, secondActivity2::class.java)
            startActivity(intent)
        }

    }

}