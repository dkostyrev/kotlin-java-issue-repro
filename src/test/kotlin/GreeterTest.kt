package com.dkostyrev

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GreeterTest {

  @Test
  fun test() {
    val actualConstant = Constants::class.java.getDeclaredField("NAME").get(Constants::class.java) as String

    Assertions.assertEquals("Hello $actualConstant!", Greeter().greet())
  }
}
