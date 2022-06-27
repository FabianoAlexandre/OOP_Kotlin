package farlausystem.bankSystem

class Pessoa {
    var nome: String = "Fabiano"
    var cpf: String = "123.125.542-78"
}
fun main(){
    val fabiano = Pessoa()

    println("${fabiano.nome}\n${fabiano.cpf}")
}