package com.codelang.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

@Composable
actual fun getDrawableImage(imageName: String, imageFormat: ImageFormat): Painter {
    return painterResource("$imageName.${imageFormat.name}")
}

@Composable
actual fun getLogo(): Painter {
    return painterResource("ic_launcher.png")
}