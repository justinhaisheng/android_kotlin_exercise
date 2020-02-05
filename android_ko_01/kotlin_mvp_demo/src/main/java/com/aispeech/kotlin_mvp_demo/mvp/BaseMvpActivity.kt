package com.aispeech.kotlin_mvp_demo.mvp

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * @创建者    luhaisheng
 * @创建时间  2020/2/5 22:47
 * @描述      ${TOO}
 */
abstract class BaseMvpActivity<in V:BaseMvpView,P:BaseMvpPresenter<V>>
    : AppCompatActivity(), BaseMvpView{

    protected abstract var mPresenter:P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter.attachView(this as V)
    }

    override fun getContext(): Context =  this ;

    override fun showError(error: String) {
        Toast.makeText(this, error, Snackbar.LENGTH_LONG).show()
    }

}