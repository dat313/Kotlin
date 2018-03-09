fun main(args: Array<String>) {

var listaNumero:IntArray= intArrayOf(1, 2, 3, 4, 5, 6)
    for (i in listaNumero.indices)
    {
        print(listaNumero[i])
    }
    val frutas:List<String> = listOf("manzana", "Piña", "Uva", "Platano")
    for (fruta: String in frutas)
    {
        println(fruta)
    }

    var X=3
    while(X>0){
        X--
        println(X)
    }
    var sum:Int=0
    var input: String?=""
    do {
        print("Ingresa un numero")
        input= readLine()
        sum+=input?.toInt()?:0
    }while (input !="0")
println("La suma es: $sum")
}