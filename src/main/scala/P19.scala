/*
 * P19.scala
 * Copyright (C) 2017 yuhuan.qiu <yuhuan.qiu@YuhuanQuiMBP>
 *
 * Distributed under terms of the MIT license.
 */


// P19 (**) Rotate a list N places to the left.
//     Examples:
//     scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//     res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
//
//     scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//     res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)

// 1,2,3,4
// rotate -1
// 4,1,2,3
// rotateleft -1+4=3
// drop selects all elts except first n
// take selects first n elts
// ::: = ++
object P19 extends App {
  def rotate[A](lst: List[A], n: Int) : List[A] = {
    val n_b = n % lst.length // bound n
    if (n_b == 0) lst
    else if (n_b < 0) rotate(lst, n_b + lst.length)
    else rotate(lst.tail ::: List(lst.head),n_b-1)
  }

  def rotateBetter[A](lst: List[A], n: Int) : List[A] = {
    val n_b = if (lst.isEmpty) 0 else n % lst.length
    if (n_b < 0) rotate(lst,n_b+lst.length)
    else (lst drop n_b) ::: (lst take n_b)
  }

  val lst = List(1,2,3,4)
  assert(rotate(lst,2) == List(3,4,1,2))
  assert(rotate(lst,-1) == List(4,1,2,3))
}

