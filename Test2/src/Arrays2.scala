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
  println(b.size)
  var temp=0
  var newB=for (i <- 0 to lastItemToSort) yield {
   /* if (i%2==0){
      temp=b(i)
      b(i+1)
    } else temp*/
    b(i)
  }
  println(newB)

  val negative= ArrayBuffer[Int]()
  val pozitive= ArrayBuffer[Int]()
  val first= ArrayBuffer[Int](1,1,6,-6,-8,6,-6,63,100,-2)

  for (i <- 0 until first.size){
    if (first(i)<0){
      negative+=first(i)
    } else pozitive+=first(i)
  }
  val rez= ArrayBuffer[Int]()
  rez++=negative
  rez++=pozitive
  println(rez)
  println(rez.sortWith(_ < _))
  println(rez.sortWith(_ > _))
}
