package day01

object IfDemo {
//得有函数的入口
def main(args: Array[String]): Unit = {
  //定义第一个变量
  //下边的代码可以简写为，大括号可以去掉，但是有前提：
  //处理逻辑里面只能有一行代码，我才可以简写
  var age =18   //val是不可变
  if(age <18) println("我不能谈恋爱")
  else println("我成年了，自由了")

  //在scala中if语句是可以用变量接收返回值的
  //在scala中if语句里,返回值类型是由最后一行代码决定的，return可以不写
  val result: Any =if (age>20){
    println("我能去网吧了。。。")
       20
  }else{
    println("我不能去。。。")
    "sdfij"
  }

}
}
