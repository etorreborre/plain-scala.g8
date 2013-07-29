package $organization$

object Application {
  def main(args: Array[String]) {
   println("adding 1+1 returns: " + (new Calculator).add(1, 1))
  }
}

class Calculator {
  def add(a: Int, b: Int) = a + b
}
