object fibonacciSeq extends App{

  def fib(n:Int):Int= n match{
    case x if (n==0) => 0
    case x if (n==1) => 1
    case x => fib(n-1)+fib(n-2)
  }

  def printFib(n:Int):Unit= {
    if (n > 0) printFib(n-1)
    println(fib(n))
  }

  printFib(5)

}
