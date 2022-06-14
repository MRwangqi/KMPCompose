package com.codelang.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }
    val platformName = getPlatformName()

    Column {
        Image(
            painter = getLogo(),
            contentDescription = "image",
            contentScale = ContentScale.Fit
        )
        Image(
            painter = getDrawableImage("ic_launcher",ImageFormat.PNG),
            contentDescription = "image",
            contentScale = ContentScale.Fit
        )
        Text(getString("app_name"))
    }

}
