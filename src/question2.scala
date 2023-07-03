import scala.io.StdIn
object question2 extends App {

  print("Enter the integer: ")
  val num=StdIn.readInt()


  val message = num match {
    case a if a <= 0 => "Negative/Zero is input"
    case b if b % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
  }
  println(message)

}
