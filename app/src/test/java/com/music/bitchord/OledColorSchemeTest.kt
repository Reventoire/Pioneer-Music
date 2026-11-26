package com.music.bitchord

import androidx.compose.ui.graphics.Color
import com.music.bitchord.ui.theme.OledDarkColors
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class OledColorSchemeTest {
    @Test
    fun darkSurfacesAreOpaqueBlack() {
        val surfaces = listOf(
            OledDarkColors.background,
            OledDarkColors.surface,
            OledDarkColors.surfaceVariant,
            OledDarkColors.surfaceBright,
            OledDarkColors.surfaceDim,
            OledDarkColors.surfaceContainer,
            OledDarkColors.surfaceContainerHigh,
            OledDarkColors.surfaceContainerHighest,
            OledDarkColors.surfaceContainerLow,
            OledDarkColors.surfaceContainerLowest,
        )

        surfaces.forEach { color ->
            assertEquals(Color.Black, color)
            assertTrue(color.alpha == 1f)
        }
    }

    @Test
    fun darkForegroundsRemainHighContrast() {
        assertEquals(Color.White, OledDarkColors.onBackground)
        assertEquals(Color.White, OledDarkColors.onSurface)
        assertTrue(OledDarkColors.onSurfaceVariant.alpha == 1f)
        assertEquals(Color.White, OledDarkColors.primary)
    }
}
