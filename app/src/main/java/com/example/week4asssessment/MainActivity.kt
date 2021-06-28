package com.example.week4asssessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var usernameInput: EditText
    private lateinit var emailAddressInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var confirmPasswordInput: EditText
    private lateinit var signupButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameInput = findViewById(R.id.usernameInput)
        emailAddressInput = findViewById(R.id.emailAddressInput)
        passwordInput = findViewById(R.id.passwordInput)
        confirmPasswordInput = findViewById(R.id.confirmPasswordInput)
        signupButton = findViewById(R.id.signupButton)

        signupButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val email = emailAddressInput.text.toString()
            val password = passwordInput.text.toString()
            val passwordAgain = confirmPasswordInput.text.toString()
            signUp(username, email, password, passwordAgain)
        }
    }

    fun signUp(username: String,email: String,password: String,passwordAgain: String) {
        if (isValidInput(username, email, password, passwordAgain)) {
            val intent: Intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("username", username)
            startActivity(intent)
        } else {
            Toast.makeText(applicationContext, "Not successfull please check and try again", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isValidInput(
        username: String,
        email: String,
        password: String,
        passwordAgain: String
    ): Boolean {
        if (username != "" && email != "" && password != "" && password == passwordAgain) return true
        return false

    }
}

