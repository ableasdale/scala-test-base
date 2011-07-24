package samples

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec

@RunWith(classOf[JUnitRunner])
class SampleTest extends Spec with ShouldMatchers {
  describe("Demo") {
    it("should run") {
      1 + 1 should be(2)
    }
  }
}