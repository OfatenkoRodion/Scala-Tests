object Function extends App{


  def sum(args: Int*) = { // это функция, тут есть =
    var result = 0
    for (arg <- args) result += arg
    result
  }
  def recursiveSum(args: Int*): Int ={ // это функция, тут есть =
    if (args.length==0) 0
    else args.head+ recursiveSum(args.tail:_*)
  }

  def box (s:String){ // это процедура, тут нет =
    val border ="-"*s.length+"--\n"
    print(border+"|"+s+"|\n"+border)
  }

  val s1 = sum (1,3,4,4)
  //val s2 = sum (1 to 5) ошиибка
  val s2 = sum (1 to 5: _*)// интерпритировать 1 to 5 как последовотельность элементов
  print(s1 + " "+ s2)
  println()

  val r1 = recursiveSum (1,3,4,4)
  val r2 = recursiveSum ( 1 to 5:_*)
  print(s1 + " "+ s2)

  box("Слова в рамке")


}
