fun main(args: Array<String>)
{
    val a:Boolean =esMayor(6)
    val b:Boolean=esMayor(7)

    defineTipo("David")
}
fun esMayor(data:Int) : Boolean=

    if(data>0) {
        println("$data")
         true
    } else
    {
        println("$data")
        false


}

fun defineTipo(data: Any)
{
    if(data is String) {
        print(data.length)
    }
    else if(data is Int)
    {
        print("${data*2}")
    }
}