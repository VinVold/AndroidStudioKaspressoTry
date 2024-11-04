package com.kaspersky.kaspresso.tutorial

import com.kaspersky.kaspresso.internal.exceptions.AdbServerException
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Assert
import org.junit.Test

class AdbTest : TestCase() {

    @Test
    fun test() {

        val command = "undefined_command"
//        try {
//            adbServer.performAdb(command)
//        } catch (e: AdbServerException) {
//            Assert.assertTrue("unknown command $command" in e.message)
//        }
        val result = adbServer.performCmd("adb devices")
        Assert.assertTrue("emulator" in result.first())



    }
}
