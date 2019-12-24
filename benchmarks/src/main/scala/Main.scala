import java.util

object Main {
  case class A(int: Int)
  case class B(int: Int) extends AnyRef

  trait T { def int: Int }
  case class Q(int: Int) extends T
  case class Z(int: Int) extends T

  case class StrWrp(str1: String, str2: String)

  def main(args: Array[String]): Unit = {
    val start = System.nanoTime()

    {
      (1 to 10000000).toSeq.map(x => x * 2)
    }
    {
      (1 to 10000000).toSeq.map(x => x * 2)
    }
    {
      (1 to 10000000).toSeq.map(x => x * 2)
    }
    {
      (1 to 10000000).toSeq.map(x => x * 2)
    }
    {
      (1 to 10000000).toSeq.map(x => x * 2)
    }
    {
      (1 to 10000000).toSeq.map(x => x * 2)
    }
    {
      (1 to 10000000).toSeq.map(x => x * 2)
    }
    {
      (1 to 10000000).toSeq.map(x => x * 2)
    }
    {
      (1 to 10000000).toSeq.map(x => x * 2)
    }
    {
      (1 to 10000000).toSeq.map(x => x * 2)
    }
    {
      (1 to 10000000).toSeq.map(x => x * 2)
    }
    {
      (1 to 10000000).toSeq.map(x => x * 2)
    }

    val end = System.nanoTime()

    println(s"Rutntime ${end - start} ns")

    val mb = 1024*1024
    val runtime = Runtime.getRuntime
    println(s"Memory ${(runtime.totalMemory - runtime.freeMemory) / mb}")

    sys.exit(0)
  }
}

