package com.example.countingappusingmvvm

class CounterRepository {
    private val counter = CounterModel(0)
    fun getCounter() = counter


    fun incrementCounter() {
        counter.count++
    }

    fun decrementCounter() {
        counter.count--
    }


}


data class CounterModel(var count: Int)