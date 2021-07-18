object sumToN extends App{

  def sumN(n:Int):Int ={
    {
      if (n==1) 1
      else n+sumN(n-1)
    }
  }

  println(sumN(5))
}
