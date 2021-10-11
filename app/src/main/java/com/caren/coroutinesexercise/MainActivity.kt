package com.caren.coroutinesexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            // Start 5 second timer
            Log.i("MainActivity", "Start 5 second timer")
            Thread.sleep(5000)
            Log.i("MainActivity", "5 second timer ended")
        }
    }
}