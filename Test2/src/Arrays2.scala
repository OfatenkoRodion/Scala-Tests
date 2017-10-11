import scala.collection.mutable.ArrayBuffer

object Arrays2 extends  App {

  val n:Int =6
  val b = ArrayBuffer[Int]()
  for (i<- 1 until n) b+=i
  println(b)


  var lastItemToSort:Int=0
  if (b.length%2==0){
    lastItemToSort=b.length
  } else  lastItemToSort=b.length-1
  for (i <- 0 until (lastItemToSort,2))
    {
      var temp=b(i)
      b(i)=b(i+1)
      b(i+1)=temp
    }
  println(b)

  var newB=for (i <- 0 until (lastItemToSort,2)) yield {
    var temp=b(i)
    b(i)=b(i+1)
    b(i+1)=temp
    temp
  }
  println(newB)

}
