package com.aispeech.kotlin_mvp_demo.mvp

/**
 * @创建者    luhaisheng
 * @创建时间  2020/2/5 22:25
 * @描述      ${TOO}
 */
open class BaseMvpPresenterImpl<V:BaseMvpView>:BaseMvpPresenter<V> {

    protected var mView:V? = null

    override fun attachView(view: V) {
       mView = view;
    }

    override fun detchView() {
        mView = null
    }
}