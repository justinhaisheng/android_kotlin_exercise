package com.aispeech.kotlin_mvp_demo.mvp

/**
 * @创建者    luhaisheng
 * @创建时间  2020/2/5 21:53
 * @描述      ${TOO}
 */
interface BaseMvpPresenter<in V:BaseMvpView> {

    fun attachView(view:V)

    fun detchView()

}