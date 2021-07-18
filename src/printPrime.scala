object printPrime extends App{

  def GCD(m:Int,n:Int):Int= n match{
    case 0 => m
    case y if (n>m) => GCD(n,m)
    case _ => GCD(n,m%n)
  }

  def prime(pr:Int,num:Int=2):Boolean= num match {
    case x if(x==pr) => true
    case x if GCD(pr,x)>1 => false
    case x => prime(pr,x+1)
  }

  def primeSeq(n:Int):Unit={
    if (n>1) {
      prime(n)
      var x = String.valueOf(prime(n))
        if (x.equals("""true""")) println(n)

      primeSeq(n-1)
    }
  }

  primeSeq(10)
}
