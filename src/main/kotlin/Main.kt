fun main(args: Array<String>) {

    print("Nome do representante de vendas: ")
    var nome = readLine()!!.toString()

    print("Qual foi o valor de vendas desse representante R$: ")
    var totvendasrep = readLine()!!.toDouble()

    var comissao = 0.0

    if (totvendasrep >= 10000){
        comissao = totvendasrep * 0.30
        println("A comissão do representante é: $comissao ")

    }else if (totvendasrep >= 5001 && totvendasrep <= 9000){
        comissao = totvendasrep * 0.20
        println("A comissão do representante é: $comissao ")

    }else if (totvendasrep >= 1001 && totvendasrep <= 4999){
        comissao = totvendasrep * 0.10
        println("A comissão do representante é: $comissao ")

    }else{
        println("O representante não tem comissão")
    }

    println("O representante $nome, teve um total de vendas de: R$$totvendasrep, " +
            "e teve uma comissão de: R$$comissao")
}