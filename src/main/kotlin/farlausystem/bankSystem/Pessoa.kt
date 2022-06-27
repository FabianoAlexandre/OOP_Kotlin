package farlausystem.bankSystem

class Pessoa {
    var nome: String = "Fabiano"
    var cpf: String = "123.125.542-78"

    inner class Endereco {
        var rua: String = "Av. Exemplo de teste"
        var numero: Int = 781
    }
}
fun main(){
    val fabiano = Pessoa()

    println("${fabiano.nome}\n${fabiano.cpf}")
    println("Rua: ${fabiano.Endereco().rua} ${fabiano.Endereco().numero}")
}