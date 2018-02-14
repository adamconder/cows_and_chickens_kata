package example

object CowAndChicken {

  def calculate(heads : Int, legs : Int) = {
    (0,0)
  }

  /**
    * heads = b + c // total beefs + chickens
    * legs = 4b + 2c // 4 lots of beef and 2 lots of chicken = total number of legs
    * We can then determine that:
    * 2h (2 lots) = 2b (2 lots of beef) + 2c (2 lots of chicken)
    * This also applies to Xh = Xb + Xc
    *
    * We can determine 1 cow is
    * legs - 2heads / 2 = b (single cow)
    *
    * if b is a whole number, therefore we can check if we get a valid number of chickens
    */

}
