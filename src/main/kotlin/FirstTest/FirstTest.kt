package FirstTest

import java.util.*

/*
1)Write a program to Print default and assigned values of variables of different data types(Entered by the User).
*/
fun main() {
//    var a=10
//    var b=20
//    println("Default value of a and b is $a,$b")
//    a=a+b //30
//    b=a-b//30-20=10
//    a=a-b
//    println("after change the value of variable is $a,$b")

    /* 2)Write a program to Print an Float (Entered by the User).*/
//    println("Enter the number")
//    var inputScan = Scanner(System.`in`)
//    var number = inputScan.nextInt()
//    var number2: Float = number.toFloat()
//    println("$number2")


    //3) write a program  to check Even or Odd number.
    /*  println("Enter a number to check Even and odd of given number")
      var inputByUser=Scanner(System.`in`)
      var number=inputByUser.nextInt()
      if (number%2==0){
          println("the given number is even $number")
      }else{
          println("the given number is odd $number")
      }*/

    // 4)write a program of reverse string.
    var myString="Hello"
    var index=0
    var length=myString.length
    println(length)
    val reversed: String = StringBuilder(myString).reverse().toString()
    println("$reversed")


   //5)write a program using Relational Operators.
   /* var a=10
    var b=20
    var c=10
    if(a>b&&a>c) {
        println("a is greatter $a")
    }else if(a==b)
    {
        println(" a and b are equal")
    }else{
        println("a and b are not equal")
    }
*/



    //6)write a program to Add, sub, multi and div Two values(Entered by the User & use multi line Comment)
    /*println("Enter the value of number 1")
    var scanner = Scanner(System.`in`)
    var inputNumber = scanner.nextInt()
    println("Enter the value of number 2")
    var scanners = Scanner(System.`in`)
    var inputNumber2 = scanners.nextInt()
    var result=("the addition of two number is ${inputNumber+inputNumber2}")
    println("$result")

    var result2=("the addition of two number is ${inputNumber-inputNumber2}")
    println("$result2")

    var result3=("the addition of two number is ${inputNumber*inputNumber2}")
    println("$result3")

    var result4=("the addition of two number is ${inputNumber*inputNumber2}")
    println("$result4")
*/
    // write a program to convert the value from float into int & Int into float.

   /* println("Enetr the number")
    var inputScan = Scanner(System.`in`)
    var number = inputScan.nextFloat()

    var newNumber = number.toInt()
    println("number is $newNumber")*/


    //write a program to convert the value from Int into double.

    /* var inputNumber=10
     var newNumber:Double=inputNumber.toDouble()
     println("After converted of int value  $inputNumber to double is $newNumber")

     */


    //write a program to find the largest number among three

    /* println("Enter the value of number1")
     var num1scan=Scanner(System.`in`)
     var number1=num1scan.nextInt()
     println("Enter the value of number2")
     var num2Scan=Scanner(System.`in`)
     var number2=num2Scan.nextInt()
     println("Enter the value of number3")
     var num3Scan=Scanner(System.`in`)
     var number3=num3Scan.nextInt()
     if (number1>number2&&number1>number3) {
         println("Among the number $number1,$number2,$number3 is greater $number1")

     }else if (number2>number3&&number2>number1){
         println("Among the number $number1,$number2,$number3 is greater $number2")
     }
     else if(number3>number1&&number3>number2){
         println("Among the number $number1,$number2,$number3 is greater $number3")
     }
     else{
         println("number not found")
     }*/


    // write a program to concatenate two String.

//    var inputString="Hello"
//    var inputString2="How are you"
//    println("After concatenation of given string is ${inputString+inputString2}")

}