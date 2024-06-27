package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Banco bancoInicial = new Banco();

        bancoInicial.setNome("First Bank");

        Cliente goku = new Cliente("Goku", bancoInicial);
        Conta contaCorrente = new ContaCorrente(goku);

        contaCorrente.depositar(new BigDecimal(100));

        Cliente vegeta = new Cliente("Vegeta", bancoInicial);
        Conta contaPoupanca = new ContaPoupanca(vegeta);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        contaCorrente.transferir(new BigDecimal(48), contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
        bancoInicial.mostrarClientes();
    }
}