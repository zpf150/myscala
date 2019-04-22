package day01

object ForDemo {
  def main(args: Array[String]): Unit = {
    //在scala中，系统给了俩个数据生成器  to   until
    //<-代表的意思就是  我的变量属于后边的区间
    //to 左右都包括  左闭右合
    //until 左包括右不包括  左闭右开
   for(num <- 1 to 10){print(num)}
    println("\t")
    for(num <- 1 until 10){print(num)}
    //九九乘法表
    for(i <- 1 to 9;j<- 1 to i){
      if(i==j){
        println(i+"*"+j+"="+i*j)
      }else{
        print(j+"*"+i+"="+j*i+"\t")
      }
    }
//守卫模式,很灵活
    for(i <- 1 to 10 if(i%2==0)){println(i)}
    //推导模式，yield,把前边集合的元素，依次用我的逻辑进行计算，返回一个集合
    val result=for(i <- 1 until 9) yield i*2
    println(result)
  }
}
