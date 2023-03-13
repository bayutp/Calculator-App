package com.example.calculatorapp

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.example.calculatorapp.ui.theme.CalculatorAppTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class CalculatorAppTest{
    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUp(){
        composeTestRule.setContent {
            CalculatorAppTheme {
                CalculatorApp()
            }
        }
    }

    @Test
    fun calculate_area_rec_correct(){
        composeTestRule.onNodeWithText("Masukkan Panjang", ignoreCase = true).performTextInput("3")
        composeTestRule.onNodeWithText("Masukkan Lebar", ignoreCase = true).performTextInput("4")
        composeTestRule.onNodeWithText("Hitung!", ignoreCase = true).performClick()
        composeTestRule.onNodeWithText("Hasil: 12.0", ignoreCase = true).assertExists()
    }
}