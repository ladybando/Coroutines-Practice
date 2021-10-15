package com.caren.coroutinesexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.caren.coroutinesexercise.databinding.ActivityMainBinding
import kotlinx.coroutines.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var counter: Button
    private lateinit var timer: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var num = 0
        counter = binding.buttonCounter
        timer = binding.buttonTimer
        textView = binding.textView

        counter.setOnClickListener {
            num++
            textView.text = num.toString()
            Log.i("MainActivity", "CLicked counter")
        }

        timer.setOnClickListener {
            // Start 5 second timer
            GlobalScope.launch{
            Log.i("MainActivity", "Start 5 second timer")
            delay(5000)
            Log.i("MainActivity", "5 second timer ended")
            }
        }

    }
}