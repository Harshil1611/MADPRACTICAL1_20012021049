fun main(){
    val a = 111
    val b = 2222
    val c = -222
    add(a,b,c)
    sub(a,b,c)
    mul(a,b,c)
    div(a,b)
    mod(a,b)

}
fun add(a:Int, b:Int, c:Int){
    println("Addition of $a, $b, $c is ${a + b + c}")
}
fun sub(a:Int, b:Int, c:Int){
    println("Subtraction of $a, $b, $c is ${a - b - c}")
}
fun mul(a:Int, b:Int, c:Int){
    println("Multiplication of $a, $b, $c is ${a * b * c}")
}
fun div(a:Int, b:Int){
    println("Division of $a, $b is ${a / b}")
}
fun mod(a:Int, b:Int){
    println("Modulus of $a, $b is ${a % b}")
}