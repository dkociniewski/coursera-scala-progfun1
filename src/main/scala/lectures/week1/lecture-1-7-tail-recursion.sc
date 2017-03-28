import scala.annotation.tailrec

object session {
  @tailrec
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  gcd(14, 21)
  /*if (21 == 0) 14 else gcd(21, 14 % 21)
  if (false) 14 else gcd(21, 14 % 21)
  gcd(21, 14 % 21)
  gcd(21, 14)
  if (14 == 0) 21 else gcd(14, 21 % 14)
  gcd(14, 7)
  gcd(7, 0)
  if (0 == 0) 7 else gcd(0, 7 % 0)
  7*/

  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1)

  factorial(4)

  /*if (4 == 0) 1 else 4 * factorial(4 - 1)
  4 * factorial(3)
  4 * (3 * (2 * factorial(1)))
  4 * (3 * (2 * (1 * factorial(0))))
  4 * (3 * (2 * (1 * 1)))
  24
*/
  object exercise {
    def factorial(n: Int): Int = {
      @tailrec
      def loop(acc: Int, n: Int): Int =
        if (n == 0) acc
        else loop(acc * n, n - 1)

      loop(1, n)
    }
  }

   exercise.factorial(4)
}
