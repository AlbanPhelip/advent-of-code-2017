package fr.xebia.adventofcode

import fr.xebia.adventofcode.first.FirstDecember
import fr.xebia.adventofcode.second.SecondDecember

object AdventOfCode {

  def main(args: Array[String]): Unit = {
    if(args.length < 1) {
      println("Missing parameter. Usage : <day>")
      sys.exit(1)
    }

    val day: String = args.head

    day match {
      case "1" => FirstDecember.computeInput()
      case "2" => SecondDecember.computeInput()
      case _ => println(s"Error, argument $day is invalid. It must be a number between 1 and 2")
    }
  }


}
