object Practise  extends App{

  def signum(value: Int) ={
    if (value<0) -1
    else
    if (value>0) 1
    else 0
  }
  def countdown(value:Int): Unit = {
    if (value >= 0){
      println(value)
      countdown(value-1)}
  }
  def product(str: String): Long = {
    var prod: Long = 1
    for (ch <- str) prod *= ch
    prod
  }
  def productRecursive(str: String): Long = {
    var prod: Long = 1
    if (str.length!=0){
      prod*=str.head.toInt*productRecursive(str.tail)
    }
    prod
  }

  var y=2
  var x=y=1 //x = (y=1)

  println(signum(5))
  println(signum(-5))
  println(signum(0))

  var i =0
  while (i<=10){
    println(i)
    i+=1
  }
  println("------------------------")
  countdown(4)
  println("------------------------")

  var z: Long=1
  for (c <- "Hello") z *= c.toInt;
  println("in 1 row " +z)
  println("product()-> " +product("Hello"))
  println("product2()-> " +productRecursive("Hello"))
}
