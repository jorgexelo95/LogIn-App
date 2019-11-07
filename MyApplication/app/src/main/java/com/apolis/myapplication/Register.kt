package com.apolis.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {
    override fun onStart() {
        super.onStart()
        Log.d("Jay", "Register activity start")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Jay", "Register activity pause")

    }

    override fun onResume() {
        super.onResume()
        Log.d("Jay", "Register activity resumed")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Jay", "Register activity stop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Jay", "Register activity restart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Jay", "Register activity destroyed")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Jay", "Register activity created")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        button_register.setOnClickListener {
            var email = editText_registerEmail.text.toString()
            var password = editText_registerPassword.text.toString()
            val welcome = Intent(this, HomePageActivity::class.java)
            welcome.putExtra("EMAIL", email)
            welcome.putExtra("PASSWORD", password)

            Toast.makeText(this, "Thanks for registering!!!", Toast.LENGTH_LONG).show()
            startActivity(welcome)
        }
        button_alreadyHaveAcc.setOnClickListener {
            val login: Intent = Intent(this, Login::class.java)
            startActivity(login)
        }


    }
}
