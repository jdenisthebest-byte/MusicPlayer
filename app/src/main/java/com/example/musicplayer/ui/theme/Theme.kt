package com.example.musicplayer.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColors = darkColorScheme(
    primary = Color(0xFF9C7BFF),
    secondary = Color(0xFF7E57C2),
    background = Color(0xFF090A10),
    surface = Color(0xFF10131A),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White
)

private val LightColors = lightColorScheme(
    primary = Color(0xFF9C7BFF),
    secondary = Color(0xFF7E57C2),
    background = Color(0xFFF4F5F9),
    surface = Color(0xFFFFFFFF),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.Black,
    onSurface = Color.Black
)

@Composable
fun MusicPlayerTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors
    androidx.compose.material3.MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}
