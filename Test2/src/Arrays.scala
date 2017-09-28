import scala.collection.mutable.ArrayBuffer

object Arrays extends  App{

  val b = ArrayBuffer[Int]()
  b+=1 ; println(b)
  b+=(1,2,3,4) ; println(b)
  b++=Array (8,9,10); println(b)
  b.trimEnd(3); println(b)
  b.insert(2,7); println(b)
  b.insert(2,77,777,7777); println(b)
  b.remove(2); println(b)
  b.remove(2,2); println(b)
  val c:String =b.toString()
  println("c: "+c)

  for(i<-0 until 10)
    println("i: "+i)

  for(j<-0 to 10)
    println("j: "+j)

  var z = Array (100,2,3,4,50,6,7,8,9,10)
  for(l<- z)
    println("l: "+l)


  val bb = ArrayBuffer(1,7,2,9)
  val bSorted = bb.sortWith(_ < _)
   println(bSorted.mkString("Start "," end ", " finish"))

}
