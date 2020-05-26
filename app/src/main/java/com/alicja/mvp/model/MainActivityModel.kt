package com.alicja.mvp.model

import com.alicja.mvp.contract.ContractInterface

class MainActivityModel  : ContractInterface.Model{
    private var counter = 0

    override fun getCounter() = counter

    override fun incrementCounter() {
        counter++
    }

    override fun decrementCounter() {
        counter--
    }

    override fun resetCounter() {
        counter = 0
    }

}