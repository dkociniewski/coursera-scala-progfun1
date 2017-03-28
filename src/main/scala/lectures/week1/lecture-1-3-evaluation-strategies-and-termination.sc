import scala.annotation.tailrec

@tailrec
def loop:Int = loop

def first(x:Int, y: Int) = x

//first(1, loop)
//first(1, 2)


def constOne(x:Int, y: => Int) = 1

constOne(1+2, loop)

constOne(loop, 1+2)




