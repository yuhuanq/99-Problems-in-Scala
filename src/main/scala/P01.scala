// P01 (*) Find the last element of a list.
//     Example:
//     scala> last(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 8

// The start of the definition of last should be
//     def last[A](l: List[A]): A = ...
// The `[A]` allows us to handle lists of any type.

object P01{
  def lastBuiltin[A](lst:List[A]): A = lst.last

  def lastRecursive[A](lst : List[A]) : A = lst match {
    case Nil => throw new NoSuchElementException
    case x::Nil => x
    case x::xs => lastRecursive(xs)
  }

  def main(args: Array[String]):Unit = {
    val lst = List(1,2,3,4,5,6,7,8,9,10)
    println(lastBuiltin(lst))
    println(lastRecursive(lst))
  }
}
