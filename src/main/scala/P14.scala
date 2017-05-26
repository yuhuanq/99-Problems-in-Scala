/*
 * P14.scala
 * Copyright (C) 2017 yuhuan.qiu <yuhuan.qiu@YuhuanQuiMBP>
 *
 * Distributed under terms of the MIT license.
 */

object P14 extends App {
  def duplicate[A](lst : List[A]) : List[A] =
    lst flatMap (x => List(x,x))

  assert(List(1,1,2,2,3,3) == duplicate(List(1,2,3)))
}

