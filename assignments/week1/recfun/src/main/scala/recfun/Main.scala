package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  /**
    * Function calculates Pascal's triangle coefficient using the recursive approach
    *
    * @param c Number of Column
    * @param r Number of Row
    * @return coefficient in Pascal's Triangle for c-th column, and r-th row
    */
  def pascal(c: Int, r: Int): Int =
    if (c == 0 || r == 0 || r == c) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
    * Function calculates Pascal's triangle coefficient using the formula which is based on calculating the factorial
    *
    * @param c Number of Column
    * @param r Number of Row
    * @return coefficient in Pascal's Triangle for c-th column, and r-th row
    */
  def pascal2(c: Int, r: Int): Int = {
    def factorial(n: Int): Int = {

      def loop(acc: Int, num: Int): Int =
        if (num == 0) acc
        else loop(acc * num, num - 1)

      loop(1, n)
    }

    factorial(r) / (factorial(c) * factorial(r - c))
  }


  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def balanced(chars: List[Char], numberOfOpens: Int): Boolean = chars match {
      case Nil => numberOfOpens == 0
      case '(' :: tail => balanced(tail, numberOfOpens + 1)
      case ')' :: tail => numberOfOpens > 0 && balanced(tail, numberOfOpens - 1)
      case _ :: tail => balanced(tail, numberOfOpens)
    }

    balanced(chars, 0)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = coins match {
    case _ if money == 0 => 1
    case head :: tail if money > 0 => countChange(money - head, head :: tail) + countChange(money, tail)
    case _ => 0
  }
}
