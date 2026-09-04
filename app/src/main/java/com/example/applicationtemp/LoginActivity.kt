package com.example.applicationtemp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        display(msg = "onCreate method is called.")
    }

    override fun onStart() {
        super.onStart()
        display(msg = "onStart method is called.")
    }

    override fun onPause() {
        display(msg = "onPause method is called.")
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
        display(msg = "onResume method is called.")
    }

    fun display(msg: String) {
        Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    companion object {
        private const val TAG = "LoginActivity"
    }
}
