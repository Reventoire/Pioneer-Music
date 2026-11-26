package com.music.bitchord.ui.player

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Composable
internal fun PlayerFrame(
    modifier: Modifier,
    chrome: Boolean,
    softened: Boolean = false,
    overlays: @Composable () -> Unit,
    content: @Composable () -> Unit,
) {
    Box(modifier.fillMaxSize()) {
        Box(Modifier.fillMaxSize()) {
            CompositionLocalProvider(
                LocalPlayerChrome provides chrome,
                LocalChromeSoftened provides softened,
                content = content,
            )
        }
        overlays()
    }
}

@Composable
fun Modifier.playerMenuSurface(shape: Shape): Modifier =
    clip(shape)
        .background(Color.Black)
        .border(1.dp, Color(0xFF48484A), shape)

@Composable
fun Modifier.playerBarSurface(shape: Shape): Modifier = playerMenuSurface(shape)
