package com.caren.coroutinesexercise

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CounterViewModel : ViewModel() {
   private var _counter = 0
    val counter get() = _counter

    fun increaseScore(): Int {
        return _counter++
    }

    fun startTimer() {
        viewModelScope.launch(Dispatchers.Default) {
            Log.i("MainActivity", "Start 5 second timer")
            delay(5000)
            Log.i("MainActivity", "5 second timer ended")
        }
    }


}