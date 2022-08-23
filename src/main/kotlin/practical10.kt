
class Car(type:String, model:String, price:Int, owner:String, miles:Int){

    val typee:String = type
    val modell =model
    val pricee:Int = price
    val ownerr = owner
    val miless:Int = miles
    fun getCarInfo() {
        println("Selling Price of Car: " + (pricee - miless).toString() + "rs")
        println("Actual price: " + pricee.toString() + "rs")
        println("Total Kms: " + miless.toString())
        println("car model:" + modell.toString())
        println("car owner: " + ownerr.toString())
        println("car miles: " + miless.toString())
        println()

    }
    fun getOriginalCarPrice() {
        println("Actual price: " + pricee.toString() + "rs")
        println()

    }
}



fun main() {
    var c1 = Car("SUV", "Scorpio", 235000, "Harshil", 10000)
    c1.getCarInfo()

    var c2 = Car(" SUV", "CLA 220 ", 1450000, "Aman", 50000)
    c2.getCarInfo()

    println("************************************************************")
    c1.getOriginalCarPrice()
    c2.getOriginalCarPrice()
}