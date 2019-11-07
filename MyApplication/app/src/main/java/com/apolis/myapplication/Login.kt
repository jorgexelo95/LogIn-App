package com.apolis.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onStart() {
        super.onStart()
        Log.d("Jay", "Login activity start")
    }
    override fun onPause() {
        super.onPause()
        Log.d("Jay", "Login activity pause")

    }
    override fun onResume() {
        super.onResume()
        Log.d("Jay", "Login activity resumed")

    }
    override fun onStop() {
        super.onStop()
        Log.d("Jay", "Login activity stop")

    }
    override fun onRestart() {
        super.onRestart()
        Log.d("Jay", "Login activity restart")

    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("Jay", "Login activity destroyed")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Jay", "Login activity created")

        setContentView(R.layout.activity_login)

        button_newUser.setOnClickListener {
            val newUser: Intent = Intent(this, Register::class.java)
            startActivity(newUser)
        }

        button_login.setOnClickListener{
            var user = login_email.text.toString()
            var pass = login_pass.text.toString()
            if(user == "test@gmail.com" && pass == "123456"){
                Toast.makeText(this,"SUCCESS", Toast.LENGTH_LONG ).show()
                var intent: Intent = Intent(this, HomePageActivity::class.java)
                intent.putExtra("EMAIL", user)
                intent.putExtra("PASSWORD", pass)
                startActivity(intent)
            }
            else Toast.makeText(this, "FAILED", Toast.LENGTH_LONG).show()

        }
    }
}
