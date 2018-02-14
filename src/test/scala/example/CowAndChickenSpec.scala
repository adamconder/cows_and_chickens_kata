package example

import org.scalatest._

class CowAndChickenSpec extends WordSpec with Matchers {
  "CowAndChickenCalculator" when {

    "0 heads and 0 legs" should {

      "return 0 cows and 0 chickens" in {
        CowAndChicken.calculate(heads = 0, legs = 0) shouldBe (0, 0)
      }
    }

    "given an amount of heads and legs" should {

      "return 1 chicken and 0 cows, when given 1 head and 2 legs" in {
        CowAndChicken.calculate(heads = 1, legs = 2) shouldBe (1, 0)
      }

      "return 0 chickens and 1 cow when given 1 head and 4 legs" in {
        CowAndChicken.calculate(heads = 1, legs = 4) shouldBe (0, 1)
      }

    }
  }
}
