package tutorial.webapp

import utest._

import scala.scalajs.js

import org.scalajs.dom
import org.scalajs.dom.document
import org.scalajs.dom.ext._

class TutorialTest extends TestSuite {
  TutorialApp.setupUi()

  def tests = Tests {
    test("HelloWorld") {
      assert(document.querySelectorAll("p").count(_.textContent == "Hello World") == 1)
    }
  }
}
