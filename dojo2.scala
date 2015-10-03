import Array._

object funcional{
	def main(args: Array[String])
	{
		var lista = List(1,2,3)

		lista.map((x:Int) => println(x+4))

		println("suma2: " + suma2(2,7))
	}

    val suma2 =(x:Int,y:Int)=>x+y   


}