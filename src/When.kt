fun main(args: Array<String>) {
type(10)

}
fun type(dato:Any)
{
    when(dato){
        is String->{
            print(dato.length)
        }
        is Int->println("${dato*2}")
        is Boolean->{
            println("Es un booleano")
            println(dato)
        }
        is Persona-> print("${dato.nombre} ")
        else ->print("No se que objeto es")
    }
}

