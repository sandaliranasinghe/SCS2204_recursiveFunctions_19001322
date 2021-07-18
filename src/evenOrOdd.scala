object evenOrOdd extends App{

  def evenNo(n:Int):Boolean = n match{
    case 0 => true
    case n => ((n%10)% 2==0) && evenNo(n/10)
  }

  var x = String.valueOf(evenNo(24))
  if (x.equals("""true""")) println("""Even""")
  else println("""Odd""")

}
