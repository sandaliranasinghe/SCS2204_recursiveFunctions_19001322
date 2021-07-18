object findPrime extends App{

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

  println(prime(5))
  println(prime(8))
}
