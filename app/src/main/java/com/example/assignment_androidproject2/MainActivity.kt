package com.example.assignment_androidproject2

//1. Create Two activity Main and Home.
//2. In Main you need to design a signup page and send the data by intent. (profile image, username, name, email, age, address will be taken from user)
//3. In Home you need show data by intent which is send by Main.

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}