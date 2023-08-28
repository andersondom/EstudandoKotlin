package Introduction

open class Dogs {                // 1
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

class Yorkshires : Dogs() {       // 3
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}

fun main() {
    val dog: Dogs = Yorkshires()
    dog.sayHello()
}