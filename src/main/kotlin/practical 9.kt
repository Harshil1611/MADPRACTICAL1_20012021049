fun findmax(a:Array<Int>) {
    var max = a[0]
    var count = 0
    for (i in a) {
        println("ar[$count] = $i")
        if (i > max) {
            max = i
        }
        count++
    }
    println("largest number is:")
    println(max)
}
fun main()
{
    val a = arrayOf(17, 90, 13, 56, 2, 234)
    findmax(a)

}