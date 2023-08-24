package me.dio.helloworld

import javax.naming.InitialContext

// Definição do pacote (algo muito comum para organização do código

fun <E> mutableStackOf(vararg elements: E) = Generics(*elements)

fun main() {     // A definição da main não necessita de argumentos. Esse é sempre o ponto de entrada do código kotlin

    var stack = mutableStackOf("A", "B", "C", "D", "E")

    if (stack.isEmpty()) {
        println("Está vazio")
    } else {
        println("Possui items")
    }

    println(stack)

    stack.push("F")
    println(stack)

    println("peek(): ${stack.peek()}")
    println(stack)

    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }

    if (stack.isEmpty()) {
        println("Está vazio")
    } else {
        println("Possui items")
    }
}
/*
        val customer = Classes()

        val contact = Contact(1, "anderson@mica12.com.br")

        println(contact.id)
        println(contact.email)
        contact.email = "anderson@novoemail.com.br"
        println(contact.email)


            println(describeString(null))

            var neverNull: String = "This can´t be null"
            neverNull = null

            var nullable: String? = "You can keep a null here"
            nullable = null

            var inferredNonNull = "The compiler assumes non null"
            inferredNonNull = null

            fun strLength(notNull: String): Int {
                return notNull.length
            }
            strLength(neverNull)
            strLength(nullable)

            fun strLength(str: String): Int {
                return str?.length ?: 0
            }
            println(strLength(neverNull))
            println(strLength(nullable))

            var a: String = "initial"   // criação de uma variável do tipo String. Esse tipo de variável por ser modificada
            println(a)                  // imppressão da variável
            a = "final"
            println(a)
            val b: Int = 1              // uso de val define que o campo não pode ser mutável
            val c = 3                   // criação de um valor com tipagem implícita
            println(b)
            println(c)

            var e: Int = 10             // criação de uma variável sem ser inicializada
            println(e)                  // chamada de impressão de uma variável não inicializada. Isso não é possível


            fun someCondition() = false

            val d: Int

            if (someCondition()) {
                d = 1
            } else {
                d = 2
            }
            println(d)


            printMessage("Hello")
            printMessageWithPrefix("Hello", "Log")
            printMessageWithPrefix("Hello")
            printMessageWithPrefix(prefix = "Log", message = "Hello")
            println(sum(1, 2))
            println(multiply(2, 4))

            fun printAll(vararg messages: String) {
                for (m in messages) println(m)
            }
            printAll("Hello", "Hallo", "Salut", "Hola", "Shalom")

            fun printAllWithPrefix(vararg messages: String, prefix: String) {
                for (m in messages) println(prefix + m)
            }
            printAllWithPrefix(
                "Hello", "Hallo", "Salut", "Hola", "Shalom",
                prefix = "Greeting: "
            )

            fun Log(vararg entries: String) {
                printAll(*entries)
            }
            printAll("Hello", "Hallo", "Salut", "Hola", "Shalom")
}

class Classes {

}

class Contact(val id: Int, var email: String)

fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum (x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}
*/