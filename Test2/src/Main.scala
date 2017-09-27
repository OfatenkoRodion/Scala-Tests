
object Main extends  App{

  val x = 6
  val s = if (x > 0) "positive" else -1
  println(s)

  var n = 2
  var r = 2
  if  (n>0) {n=r*n;r-=1}
  println(r +" "+n)

  while (n>0){
    r=r*n
    n-=1
    println(r +" "+n)
  }

  n=3
  for (i<-1 to n){
    r=r*i
    println("i: " +i+" r: "+r)
  }

  val ss="Hello"
  var sum=0
  for (i<-0 until ss.length)
    sum+=ss(i)
  println("sum: " +sum)

  var sum2=0
  for (ch <-"Hello") sum2+=ch
  println("sum2: " +sum2)

  for (i<- 1 to 3;j<- 1 to 3) print ((10*i+j) + " ")
  println()
  for (i<- 1 to 3;j<- 1 to 3 if i!=j) print ((10*i+j) + " ")
  println()

  def myAbs(x:Double) = if (x < 0) -x else x
  println("myAbs(3)"+ myAbs(3))
  println("myAbs(-3)"+myAbs(3))

  def fac(n:Int): Int = if (n<=0) 1 else n * fac(n-1)
  
  println("fac(4)"+fac(4))


  val name = scala.io.StdIn.readLine("Your name:")
  print("Your age: ")
  val age = scala.io.StdIn.readInt()
  printf("Hello,%s! Next year, you will be %d. \n", name, age+1)

}
