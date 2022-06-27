package farlausystem.bankSystem

class Pessoa {
    var nome: String = "Fabiano"
    var cpf: String = "123.125.542-78"
    private set

    constructor()

    fun pessoaInfo() = "Nome: $nome \nCPF: $cpf"
}
fun main(){
    val fabiano = Pessoa()

    println(fabiano.pessoaInfo())
    //println("${fabiano.nome}\n${fabiano.cpf}")
}