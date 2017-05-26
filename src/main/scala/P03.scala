/*
 * P03.scala
 * Copyright (C) 2017 yuhuan.qiu <yq56@cornell.edu>
 *
 * Distributed under terms of the MIT license.
 */

// Find the Kth element of a list.
//     By convention, the first element in the list is element 0.

//     Example:

//     scala> nth(2, List(1, 1, 2, 3, 5, 8))
//     res0: Int = 2

object P03 extends App {
  def kth[T](lst : List[T], k : Int) : T = lst match {
    case Nil => throw new NoSuchElementException
    case x::xs =>
      if (k == 0) x
      else kth(xs, k-1)
  }
  println(kth(List(1,1,2,3,5,8),4))
  assert(kth(List(1, 1, 2, 3, 5, 8), 3) == 3)
}

