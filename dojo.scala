import Array._

object dojo{
	def main(args: Array[String])
	{
		//var nombre:String = "Scala"
		//println("El valor es: " + dojo.nombre)
		println("El valor es: " + dojo.suma(2,3))

		var s = suma2(4,3)
		println("suma2: " + s)

		var arrayl = new Array[Int](2)
        arrayl(0) = 1
        arrayl(1) = 2 
		var sum1:Int = readLine().toInt
		var sum2:Int = readLine().toInt

		var s2 = suma2(sum1,sum2)
		println("suma2 réplica: " + s2)

		var sumaT = suma(sum1,sum2)
		println("suma: "+sumaT)
        println("array(0): "+arrayl(0))
        
        println("imprime arreglo")

		for(i <- 0 to (arrayl.length - 1))
		{
           println(arrayl(i))
		}
       
        var matriz = ofDim[Int](2,2)
        
        println("matriz")

        for(i <- 0 to 1){
        	for(j <- 0 to 1){
               println(matriz(i)(j))
        	}
        }
		var array2 = ("Hola","mundo")
		var array3 = (1,2)

	}

	def suma(x:Int,y:Int)=x+y
    val suma2 =(x:Int,y:Int)=>x+y   


}

//println("El valor es: " + dojo.nombre)
//println("El valor es: " + dojo.suma(2,3))