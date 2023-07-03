object question3 {
  def toUpper(str: String): String = {
    str.toUpperCase()
  }

  def toLower(str: String): String = {
    str.toLowerCase()
  }

  def characterIntoUpper(str: String, index: Int): String = {
    str.updated(index, str.charAt(index).toUpper)
  }


  def formatNames(f: String => String, name: String): String = {
    f(name)
  }

  def formatNames(f: (String, Int) => String, name: String, index: Int): String = {
    f(name, index)
  }

  def main(args: Array[String]): Unit = {
    println(formatNames(toUpper, "Benny"))
    println(formatNames(characterIntoUpper, "Niroshan", 1))
    println(formatNames(toLower, "Saman"))
    println(formatNames(characterIntoUpper, "Kumara", 5))
  }

}
