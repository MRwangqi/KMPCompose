package com.codelang.common.platform

import androidx.compose.ui.platform.LocalContext


actual fun getString(key: String): String {
    val context = LocalContext.current
    val resID: Int = context.resources.getIdentifier(key, "string", context.packageName)
    return context.resources.getString(resID)
}