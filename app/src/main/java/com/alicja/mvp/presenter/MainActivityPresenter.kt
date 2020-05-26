package com.alicja.mvp.presenter
import com.alicja.mvp.contract.ContractInterface
import com.alicja.mvp.model.MainActivityModel

class MainActivityPresenter (_view : ContractInterface.View) : ContractInterface.Presenter{
    private var view: ContractInterface.View = _view
    private val model : MainActivityModel = MainActivityModel()

    init{
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun decrementValue() {
        model.decrementCounter()
        view.updateViewData()
    }

    override fun resetValue() {
        model.resetCounter()
        view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()
}