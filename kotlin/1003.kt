var fibonacci = Array(42, {0}) 

fun main(){
    Fibonacci()
    var tInt = readLine()!!.toInt()

    while (t--  0){
        var nInt = readLine()!!.toInt()
        println(${fibonacci[n]} ${fibonacci[n + 1]})
    }
}

fun Fibonacci(){
    fibonacci[0] = 1
    fibonacci[1] = 0
    for (i in 2..41){
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
    }
}