package com.aispeech.kotlin_mvp_demo.mvp

import android.content.Context
import android.support.annotation.StringRes

/**
 * @创建者    luhaisheng
 * @创建时间  2020/2/5 21:41
 * @描述      ${TOO}
 */
interface BaseMvpView {

    fun getContext(): Context

    fun showError(error:String)

    fun showError(@StringRes stringResId:Int)

    fun showMessag(@StringRes srtResId: Int)

    fun showMessage(message: String)
}