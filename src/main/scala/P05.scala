/*
 * P05.scala
 * Copyright (C) 2017 yuhuan.qiu <yq56@cornell.edu>
 *
 * Distributed under terms of the MIT license.
 */

object P05 extends App {
    def isPalindromeBuitIn[A](lst : List[A]) : Boolean =  {
      lst == lst.reverse
    }

    assert(isPalindromeBuitIn(List(1,2,3,4,3,2,1)))
}

