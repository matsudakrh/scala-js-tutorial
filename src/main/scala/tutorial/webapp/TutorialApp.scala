package tutorial.webapp
import org.scalajs.dom
import org.scalajs.dom.document

import scala.scalajs.js.annotation.JSExportTopLevel

object TutorialApp {
  def main(args: Array[String]): Unit = {
    appendPar(document.body, "Hello, world!")
    document.addEventListener("DOMContentLoaded", { (e: dom.Event) => {
      setupUi()
    }})
}

  def handleClick(e: dom.MouseEvent) = {
    addClickedMessage()
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }

  def addClickedMessage(): Unit = {
    appendPar(document.body, "you clicked the butoon")
  }

  def setupUi(): Unit = {
    val button = document.createElement("button")
    button.textContent = "Click me!"
    button.addEventListener("click", handleClick)
    document.body.appendChild(button)
  }
}
