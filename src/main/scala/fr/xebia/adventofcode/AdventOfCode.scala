package fr.xebia.adventofcode

import fr.xebia.adventofcode.first.FirstDecember

import scala.util.{Failure, Success, Try}

object AdventOfCode {

  def main(args: Array[String]): Unit = {
    if(args.length < 1) {
      println("Missing parameter. Usage : <day>")
      sys.exit(1)
    }

    val day: Int = Try(args.head.toInt) match {
      case Success(d) => d
      case Failure(_) =>
        println(s"Error, ${args.head} is not valid. The day passed as parameter must be a number")
        sys.exit(1)
    }

    day match {
      case 1 => FirstDecember.computeInput()
      case _ => println(s"Error, day number $day is not supported. Only the first December id supported")
    }
  }


}
