package com.example.workoutbuddy

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Splashscreen : AppCompatActivity() {
    private lateinit var up: Animation
    private lateinit var down: Animation
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splashscreen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        imageView = findViewById(R.id.imageView)
        up = AnimationUtils.loadAnimation(this, R.anim.up)
        down = AnimationUtils.loadAnimation(this, R.anim.down)
        textView = findViewById(R.id.textView)

        Handler(Looper.getMainLooper()).postDelayed({
            textView.startAnimation(up)
            imageView.startAnimation(down)
            // Start the next activity after the animation
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Optional: Finish the splash screen activity
        }, 2000) // Delay for 2 seconds (adjust as needed)
    }
}