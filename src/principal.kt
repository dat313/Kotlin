fun main(args: Array<String>) {
    val a=5
    var b=4
    "Hola mi nombre es David".println()

    println(4.multiply(2))
    println(4 multiply 5)

    print("Hello Kotlin")
    val nombre ="David"
    val edad=25
    val Sentencia= "El es: $nombre y tiene $edad años"
    val cumple=" $nombre cumple ${edad+1}"

    println(Sentencia)
    println(cumple)
    println("Número Mayor"+max(4,9))
    //println("Suma de los npúmeros"+suma(4,9))
    val persona=Persona("David", 28)
    println(persona)

    val ListaNombre= mutableListOf("Zelt", "Rodrigo", "Amaury", "Andres", "Jazmin")
    ListaNombre.swap(0,2)
    println(ListaNombre.toString())
}

fun <T> MutableList<T>.swap(index1:Int, index2:Int)
{
val tmp: T =this[index1]
    this[index1]= this[index2]
    this[index2]= tmp

}

fun hello():Unit{
    println("Hola a todos")
}
fun suma(a:Int, b:Int){
        println("La suma de $a y $b es igual a ${a+b}")
}
fun max(a:Int, b:Int):Int{
    if(a>b)
        return a
    else
        return b
}

class Persona(val nombre:String){
init {
    print("Nombre $nombre")
}
    constructor(name:String, edad:Int) :this(name){
        println("Nombre $nombre " +
                "Edad $edad")
    }
}

fun String.println(){//Extension function
    println(this)
}
infix fun Int.multiply(numM: Int): Int{
    return this *numM
}