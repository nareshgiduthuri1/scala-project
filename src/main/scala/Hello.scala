import java.util.Date


object Hello {

  var number = 110;                         //closures eg
  val add  = (x: Int) => {
    number = x + number;
    number;
  }

  def main(args: Array[String]) = {
    /*val name = "Ash"
    val age = 18
    println("Hello "+ name +" your age is "+age)
    println(s"$name is $age years old") //string interpolation
    println(f"$name%s is $age%d years old") //f string interpolation
    println(s"Hello \nWorld")
    println(raw"Hello \nWorld")

    // iF-eLSE sTATEMENTS

    val x = 21;
    val y = 20;
    var res = "";

    if (x == 21 && y == 20){
      res = "x is 20";
    } else {
      res = "x != 20";
    }
    println(res);

    val res2 = if (x !=20) "x == 20" else "x !=20";
    println(res2)
    println(if (x !=20) "x == 20" else "x !=20");

    // While & Do-While Loops
    var x = 0;

    while (x<10){
      println("x = "+x)
      x+=1;
    }

    var y = 0;
    do {
      println("y is "+y)
      y+=1;
    } while (y<10);

    // For Loops

    for (i <- 1.to(5)){  // OR for (i <- 1 to 5){
      println("i is using "+ i);
    }
    for (i <- 1.until(6)){  // OR for (i <- 1 until 6){
      println("i is using until "+ i);
    }
    for (i <- 1.until(6); j<- 1 to 3){  // OR for (i <- 1 until 6){
      println("i is using until "+ i + " " +j);
    }

    val lst = List(1,2,3,4,5,6,7,8,9,10)

    for (i <- lst){
      println(" From list "+i)
    }
    for (i <- lst; if i>6){
      println(" From filtered list "+i)
    }

    val result = for {i <- lst; if i>6} yield {
      i * i
    }
    println("result is "+result);

    // Matched Expressions

    val age = "18";

    age match {
      case "18" => println(age);
      case "19" => println(age);
      case "20" => println(age);
      case "21" => println(age);
      case "22" => println(age);
      case _ => println("Default");
    }
    val result: Any = age match {
      case "18" => age;
      case "19" => age;
      case "20" => age;
      case "21" => age;
      case "22" => age;
      case _ => "default";
    }
    println("result = "+result);

    val i = 10;
     i match {
       case 1 | 3 | 5 | 7 | 9 => println("odd");
       case 2 | 4 | 6 | 8 | 10 => println ( "even");
     }

    // Functions
    object Math {
      def Add(x: Int, y: Int): Int = {
        return x + y;
      }
      def add(x: Int = 10, y: Int = 20): Int = {   //passing default values
        return x + y;
      }
      def square(x:Int) = x*x ;

      def +(x: Int, y: Int) = x + y; //passing operators as def names
      def **(x: Int, y: Int)= x*y;
    }
    println(Math.+(9,5));
    println(Math.**(4,5));

    def Sub(x: Int, y: Int): Int = {
      x - y;
    }

    def Mul(x: Int, y: Int): Int = x * y;

    def Div(x: Int, y: Int) = x / y;

    println(Math.Add(3,2));
    println(Math.add());
    println(Math.square(3));    //println(Math square 3);
    println(Sub(3,2));
    println(Mul(3,2));
    println(Div(3,2));



    def print(x: Int, y: Int): Unit = {
      println(x+y);
    }
    print(4,5);

    var add  = (x : Int,y : Int) => x+y;
    println(add(100,200))

    // Higher-Order Functions

  def math(x: Double,y: Double,f: (Double, Double) => Double):Double = f(x,y);
      val result = math(50,20,(x,y)=>x+y) //(x,y)=>x-y)
      val result1 = math(50,20,(x,y)=>x min y)
      println(result);
      println(result1);
  def math1(x: Double,y: Double,z: Double,f: (Double, Double) => Double):Double = f(f(x,y),z);
      val result2 = math1(50,20,10,(x,y)=>x min y); //(x,y)=>x-y)
      val result3 = math1(50,20,10,_+_);
      val result4 = math1(50,20,10,_ max _);
      println(result2);
      println(result3);
      println(result4);

    // Partially Applied Functions

      val sum = (a: Int,b: Int, c: Int) => a+b+c
      val f = sum(10,20,_:Int)
      println(f(30));

  def log(date: Date,message: String) ={
    println(date+ " " +message)
  }
    val date = new Date;
    val newLog = log(date,_:String);
    newLog("The message 1");

    // Closures - is a function which uses one or more variables declared outside the function
    number = 110;
    println(add(20));
    println(number);

    // Currying - is the technique of transforming a function that takes multiple arguments into a function,- that takes a single argument

    def add(x: Int, y: Int) = x+y

    def add2 (x: Int) = (y: Int) => x+y
    def add3 (x: Int)  (y: Int) = x+y

      println(add(10,20));
      println(add2(10)(20));
      val sum40 = add2(40);
      println(sum40(100));
      println(add3(100)(200))
      val sum50 = add3(50)_;    //using partial function in currying function
      println(sum50(400));

    // Strings
    val a = 1;
    val b = 2.5;
    val str1 : String = "hello";
    val str2 : String = " world";
      println(str1.length());
      println(str1.concat(str2));
      println(str1 + str2);
      val result = printf("(%d -- %f -- %s)",a,b,str1);
      println(result);
      println("(%d -- %f -- %s)".format(a,b,str1));
      printf("(%d -- %f -- %s)",a,b,str1);
    */

    // Arrays















  }
}
