package com.kaspersky.kaspresso.tutorial.screens

import com.kaspersky.kaspresso.screens.KScreen
import com.kaspersky.kaspresso.tutorial.R
import io.github.kakaocup.kakao.text.KButton

object MainScreen: KScreen<MainScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val simpleACtivityButton = KButton { withId(R.id.simple_activity_btn)}
}
