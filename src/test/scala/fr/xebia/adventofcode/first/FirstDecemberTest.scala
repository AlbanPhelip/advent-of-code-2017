package fr.xebia.adventofcode.first

import org.scalatest.{FlatSpec, Matchers}

class FirstDecemberTest extends FlatSpec with Matchers {

  "FirstDecember.compute" should "correctly compute the given example" in {
    FirstDecember().compute("1122")shouldBe 3
    FirstDecember().compute("1111")shouldBe 4
    FirstDecember().compute("1234")shouldBe 0
    FirstDecember().compute("91212129")shouldBe 9
  }

  it should "raise an Exception when the input is not only numbers" in {
    an [IllegalArgumentException] should be thrownBy FirstDecember().compute("1x23")
  }



}
