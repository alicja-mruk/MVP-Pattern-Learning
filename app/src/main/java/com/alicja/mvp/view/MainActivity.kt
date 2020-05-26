package com.alicja.mvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alicja.mvp.R
import com.alicja.mvp.contract.ContractInterface
import com.alicja.mvp.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ContractInterface.View {

    private var presenter : MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenter(this)
        initView()
    }

    override fun initView() {
        counterTextView.text = presenter?.getCounter()
        incrementCounterBtn.setOnClickListener{presenter?.incrementValue()}
        decrementCounterButton.setOnClickListener{presenter?.decrementValue()}
        resetCounterBtn.setOnClickListener { presenter?.resetValue() }
    }

    override fun updateViewData() {
        counterTextView.text = presenter?.getCounter()
    }
}
