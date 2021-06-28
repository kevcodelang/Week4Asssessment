package com.example.week4asssessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    private lateinit var launchButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        launchButton = findViewById(R.id.launchButton)

        launchButton.setOnClickListener() {
            launchPage()
        }
    }

    private fun launchPage() {
        var intent: Intent = Intent(this, LaunchActivity::class.java)
        startActivity(intent)
    }

}