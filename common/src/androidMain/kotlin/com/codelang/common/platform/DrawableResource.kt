package com.codelang.common.platform

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import com.codelang.common.R

@Composable
actual fun getDrawableImage(imageName:String,imageFormat: ImageFormat): Painter {
    val context = LocalContext.current
    val resID: Int = context.resources.getIdentifier(imageName, "drawable", context.packageName)
    return painterResource(resID)
}

@Composable
actual fun getLogo(): Painter {
    return painterResource(R.drawable.ic_launcher)
}