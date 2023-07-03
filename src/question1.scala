object question1 {
  def calculateInterest(amount: Double): Double = {
    if (amount > 2000000)
      amount * 0.065
    else if (amount > 200000)
      amount * 0.035
    else if (amount > 20000)
      amount * 0.04
    else
      amount * 0.02
  }


  def main(args: Array[String]): Unit = {
    var amount = 250000
    println("Interest for year: " + calculateInterest(amount))
  }
}
