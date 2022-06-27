package farlausystem.bankSystem

class Pessoa {
    var nome: String = "Fabiano"
    var cpf: String = "123.125.542-78"
    private set
}
fun main(){
    val fabiano = Pessoa()

    println(fabiano)
    println("${fabiano.nome}\n${fabiano.cpf}")
}