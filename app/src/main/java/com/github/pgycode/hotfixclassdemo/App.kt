package com.github.pgycode.hotfixclassdemo

import android.app.Application
import android.content.Context

/**
 *作者：胥晓杰
 *邮箱：xuxiaojie@youzan.com
 */
class App: Application() {

    /**
     * 这里是一个application除了构造开始的地方，早于onCreate()
     */
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        ApkReloader.load(base)
    }
}