package com.alicja.mvp.contract

interface ContractInterface {

    interface View {
        fun initView()
        fun updateViewData()
    }

    interface Presenter {
        fun incrementValue()
        fun decrementValue()
        fun resetValue()
        fun getCounter() : String
    }

    interface Model {
        fun getCounter() : Int
        fun incrementCounter()
        fun decrementCounter()
        fun resetCounter()
    }

}