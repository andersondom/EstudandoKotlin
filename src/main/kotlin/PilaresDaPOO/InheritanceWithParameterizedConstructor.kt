package PilaresDaPOO

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhhh!")
    }
}

class SiberianTiger : Tiger("Sibéria")

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}