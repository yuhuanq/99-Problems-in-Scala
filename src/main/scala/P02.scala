/*
 * P02.scala
 * Copyright (C) 2017 yuhuan.qiu <yq56@cornell.edu>
 *
 * Distributed under terms of the MIT license.
 */

// Find the last but one element of a list.
//    Example:

//    scala> penultimate(List(1, 1, 2, 3, 5, 8))
//    res0: Int = 5

object P02 extends App {

  def penultimateBuiltin[A](lst : List[A]): A = {
    if (lst.isEmpty) throw new NoSuchElementException
    else lst.init.last
  }

  def penultimate[T](lst : List[T]) : T = lst match {
    case Nil => throw new NoSuchElementException
    case x::Nil=> throw new NoSuchElementException
    case x::x2::Nil => x // 2 elts
    case x::xs => penultimate(xs) // > 2 elts
  }

  val lst = List(1,1,2,3,5,8)
  assert(penultimate(lst) == 5)
}

