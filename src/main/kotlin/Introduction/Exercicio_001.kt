package Introduction

fun main() {
    val nome = "Anderson Domingos Souza Santos"
    var tamanhoString = nome.length
    var arrayNomes = nome.split(" ")
    var quantidadePalavras = arrayNomes.count()

    println("O nome informado foi: $nome")
    println("Esse nome possui: $quantidadePalavras partes")
}