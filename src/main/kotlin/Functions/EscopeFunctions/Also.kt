package Functions.EscopeFunctions

data class Persons(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writedCreationLog(p: Persons) {
    println("A new person ${p.name} was created.")
}

fun main() {
    var jake = Persons("Jake", 30, "Android Developer")
        .also {
            writedCreationLog(it)
        }
}