fun main(args: Array<String>) {
    type(10)
    for (i in 1..4) {
        println(i)
    }
    println()
    println()
    for (i in 4 downTo 1) {
        println(i)
    }
    println()
    println()

    for (i in 1..4 step 2) {
        println(i)
    }
    for (i in 4 downTo 1 step 2){
        println(i)
    }
    println()
    println()
    for (i in 1 until 10) {
        println(i)
    }
}
