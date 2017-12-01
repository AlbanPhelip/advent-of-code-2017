package fr.xebia.adventofcode.first

import org.scalatest.{FlatSpec, Matchers}

class FirstDecemberTest extends FlatSpec with Matchers {

  "The instantiation of FirstDecember" should "raise an Exception when the input is not only digits" in {
    an [IllegalArgumentException] should be thrownBy FirstDecember("1x23")
  }

  "computeFirstPart" should "correctly compute the given example" in {
    FirstDecember("1122").computeFirstPart()shouldBe 3
    FirstDecember("1111").computeFirstPart()shouldBe 4
    FirstDecember("1234").computeFirstPart()shouldBe 0
    FirstDecember("91212129").computeFirstPart()shouldBe 9
  }

  "computeSecondPart" should "correctly compute the given example" in {
    FirstDecember("1212").computeSecondPart() shouldBe 6
    FirstDecember("1221").computeSecondPart() shouldBe 0
    FirstDecember("123425").computeSecondPart() shouldBe 4
    FirstDecember("123123").computeSecondPart() shouldBe 12
    FirstDecember("12131415").computeSecondPart() shouldBe 4
  }

  it should "raise an Exception when the input is valid but has an odd number of digits" in {
    an [IllegalArgumentException] should be thrownBy FirstDecember("123").computeSecondPart()
  }

}
