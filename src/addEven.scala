object addEven extends App{

  var y = 0

  def sumEven(n:Int):Int ={
    {
      if (n>1) {
        var x = n%2
        if (x==0) y = y+n

        sumEven(n-1)
      }
      else y
    }
  }

  println(sumEven(10))



}
