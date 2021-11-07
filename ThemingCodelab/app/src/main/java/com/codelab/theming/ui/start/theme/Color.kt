package com.codelab.theming.ui.start.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val RedA200 = Color(0xffff616f)
val RedA400 = Color(0xffff1744)
val RedA700 = Color(0xffc4001d)

private val LightColors = lightColors(
    primary = RedA200,
    primaryVariant = RedA700,
    onPrimary = Color.White,
    secondary = RedA200,
    secondaryVariant = RedA700,
    onSecondary = Color.White,
    error = RedA400
)

fun JetnewsTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = LightColors,
        content = content
    )
}
