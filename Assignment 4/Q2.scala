import scala.io.StdIn._

object Q2 {
    def main(args: Array[String]): Unit = {

        print("Enter Number: ")
        var num = readInt();

        num match {
        case num if num <= 0 => println("Number is Negative/Zero")

        case num if num%2==0 => println("Number is Even")

        case _ => println("Number is Odd")
       }
    }
}
