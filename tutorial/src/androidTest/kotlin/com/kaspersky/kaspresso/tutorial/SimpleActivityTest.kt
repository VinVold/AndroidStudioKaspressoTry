package com.kaspersky.kaspresso.tutorial

import androidx.test.ext.junit.rules.activityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import com.kaspersky.kaspresso.tutorial.screens.MainScreen
import org.junit.Rule
import org.junit.Test
import com.kaspersky.kaspresso.tutorial.MainActivity
import com.kaspersky.kaspresso.tutorial.screens.SimpleActivityScreen
import com.kaspersky.kaspresso.tutorial.screens.SimpleActivityScreen.changeTitleButton
import com.kaspersky.kaspresso.tutorial.screens.SimpleActivityScreen.inputText
import com.kaspersky.kaspresso.tutorial.screens.SimpleActivityScreen.simpleTitle

class SimpleActivityTest: TestCase() {
    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun Test() {

        MainScreen{
            simpleACtivityButton{
                isVisible()
                isClickable()
                click()
            }
        }
        SimpleActivityScreen {
            simpleTitle.isVisible()
            changeTitleButton.isClickable()
            simpleTitle.hasText("Default title")
            inputText.replaceText("new title")
            changeTitleButton.click()
            simpleTitle.hasText("new title")

        }
    }
}
