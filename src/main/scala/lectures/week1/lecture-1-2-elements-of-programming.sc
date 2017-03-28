def abs(x: Int) = if (x > 0) x else -x

abs(-19)

def and(a: Boolean, b: => Boolean):Boolean = if(a) b else false

and(false, false)
and(false, true)
and(true, false)
and(true, true)

def or(a: Boolean, b: => Boolean):Boolean = if(a) true else b

or(false, false)
or(false, true)
or(true, false)
or(true, true)

