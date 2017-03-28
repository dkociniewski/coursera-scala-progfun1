def abs(x: Int) = if (x >= 0) x else -x

/*
if (b) e1 else e2
if (true) e1 else e2 -> e1
if (false) e1 else e2 -> e2
*/


val x = 2

def square(x: Int) = x * x

val y = square(x)

def loop: Boolean = loop

def x1 = loop

// will lead to an infinite loop
//val x2 = loop


def and(x: Boolean, y: => Boolean) = if (x) y else false
and(false, false)
and(false, true)
and(true, false)
and(true, true)

and(false, loop)

def or(x: Boolean, y: => Boolean) = if (x) true else y
or(false, false)
or(false, true)
or(true, false)
or(true, true)

