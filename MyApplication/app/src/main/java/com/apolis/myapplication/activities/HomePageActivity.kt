package com.apolis.myapplication.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.apolis.myapplication.R
import com.apolis.myapplication.fragments.Homepage2Fragment
import com.apolis.myapplication.fragments.HomepageFragment
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePageActivity : AppCompatActivity() {
    override fun onStart() {
        super.onStart()
        Log.d("Jay", "Login succcesful  start")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Jay", "Login succesful page pause")

    }

    override fun onResume() {
        super.onResume()
        Log.d("Jay", "Login succesful page resumed")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Jay", "Login successful activity stop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Jay", "Login successful restart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Jay", "Login successful destroyed")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Jay", "Login successful create")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)



        login_page_emailText.text = intent.getStringExtra("EMAIL")
        login_page_passwordText.text = intent.getStringExtra("PASSWORD")

        var fragOne = supportFragmentManager
        var fragOneTransaction =
            fragOne.beginTransaction().add(fragment_homepage.id, HomepageFragment())
                .commit()
        button_homepage_switch_fragment.setOnClickListener {
            var fragOne = supportFragmentManager
            var fragOneTransaction =
                fragOne.beginTransaction().replace(fragment_homepage.id, Homepage2Fragment())
                    .commit()
        }


    }
}
