package $organization$

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class StubTest extends Spec with ShouldMatchers {

  describe("A calculator") {
    it("should add numbers") {
      (new Calculator).add(1, 1) should equal(2)
    }
  }
}
