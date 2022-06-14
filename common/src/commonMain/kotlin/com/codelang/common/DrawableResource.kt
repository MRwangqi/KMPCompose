package com.codelang.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter

@Composable
expect fun getDrawableImage(imageName:String,imageFormat:ImageFormat): Painter

@Composable
expect fun getLogo(): Painter


enum class ImageFormat{
    PNG,
    JPEG
}