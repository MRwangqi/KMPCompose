package com.codelang.common

import java.util.*


actual fun getString(key: String): String {
    val locale = Locale.CHINESE //Locale.getDefault();//获取地区:默认 　　
    val basename = "i18n.language"
    val bundle = ResourceBundle.getBundle(basename, locale)
    return bundle.getString(key)
}