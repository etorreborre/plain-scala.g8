package $organization$

import org.specs2.mutable._

class CalculatorSpec extends Specification {

  "The calculator" should {
    "add numbers" in {
      (new Calculator).add(1, 1) must_== 2
    }
  }
}