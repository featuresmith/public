package app

import lib.Lib

object App:
  def main(args: Array[String]): Unit =
    Lib.welcome()
    println("Hello, world!")