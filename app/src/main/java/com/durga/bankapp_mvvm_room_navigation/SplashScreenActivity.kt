package com.durga.bankapp_mvvm_room_navigation

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashScreenActivity : AppCompatActivity() {

    private  val splashDelay: Long = 2000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        },splashDelay)

        //Assin:
//1 st scren SplashScreenActivity
//in the splash sceen i need one image view - bank logo
// tv - on bottom of screen with app veersion

//RegistrationActivity
// 1 tv - welcome to my bank - 30sp
// 1 iv - your image
// 1 et - email
// 1 et - password
//1 et - ph number
// 1 seekbar - age (1 to 60)
// Check box with 3 options  - 10, 12, btech
// radio gropp - 2 opt - male and female

// button - Register!  -
// if i click the button what ever i selected it should print in textview


    }
}