/*
 * P07.scala
 * Copyright (C) 2017 yuhuan.qiu <yq56@cornell.edu>
 *
 * Distributed under terms of the MIT license.
 */

// P07 (**) Flatten a nested list structure.
//     Example:

//     scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
//     res0: List[Any] = List(1, 1, 2, 3, 5, 8)

object P07 extends App {
  def flatten(lst : List[Any]) : List[Any] =
    // infix notation flatmap
  lst flatMap ( x => x match {
    case ms: List[_] => flatten(ms)
    case e => List(e) }
  )

  val xs = List(Set(1, 2, 3), Set(1, 2, 3))
  val flattened = xs.flatten
  println("Hello world")
}

