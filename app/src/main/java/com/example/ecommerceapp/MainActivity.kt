package com.example.ecommerceapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val coroutineScope = CoroutineScope(Dispatchers.Main)
    private val delayMilliSeconds : Long= 4000

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        coroutineScope.launch{
            delay(delayMilliSeconds)
            startActivity(Intent(this@MainActivity, LoginActivity::class.java))
            finish()
        }


    }
}
