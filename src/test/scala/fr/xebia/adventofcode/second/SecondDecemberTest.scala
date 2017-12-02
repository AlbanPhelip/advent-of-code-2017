package fr.xebia.adventofcode.second

import org.scalatest.{FlatSpec, Matchers}

class SecondDecemberTest extends FlatSpec with Matchers {

  "SecondDecember.computeFirstPart" should "return the correct result of the example" in {
    // Given
    val input = Array(
      "5 1 9 5",
      "7 5 3",
      "2 4 6 8")

    // When
    val result = SecondDecember(input).computeFirstPart()

    // Then
    result shouldBe 18
  }

  "isDivisible" should "return true when two number are divisible" in {
    SecondDecember.isDivisible(12)(4) shouldBe true
  }

  it should "return flase when two number are not divisible" in {
    SecondDecember.isDivisible(4)(12) shouldBe false
    SecondDecember.isDivisible(7)(3) shouldBe false
  }

  "SecondDecember.computeSecondPart" should "return the correct result of the example" in {
    // Given
    val input = Array(
      "5 9 2 8",
      "9 4 7 3",
      "3 8 6 5")

    // When
    val result = SecondDecember(input).computeSecondPart()

    // Then
    result shouldBe 9
  }

}
