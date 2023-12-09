package com.example.countingappusingmvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel() {
    private var repository = CounterRepository()
    private val _count = mutableStateOf(repository.getCounter().count)

    val count: MutableState<Int> = _count

    fun incrementCount() {
        repository.incrementCounter()
        _count.value = repository.getCounter().count
    }

    fun decrementCount() {
        repository.decrementCounter()
        _count.value = repository.getCounter().count
    }
}