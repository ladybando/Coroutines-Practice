package com.caren.coroutinesexercise

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.caren.coroutinesexercise.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var counter: Button
    private lateinit var timer: Button
    private lateinit var textView: TextView

    private val viewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        counter = binding.buttonCounter
        timer = binding.buttonTimer
        textView = binding.textView

        counter.setOnClickListener {
            viewModel.increaseScore()
            textView.text = viewModel.counter.toString()
            Log.i("MainActivity", "Clicked counter")
        }

        timer.setOnClickListener {
            // Start 5 second timer
            viewModel.startTimer()
        }

    }
}