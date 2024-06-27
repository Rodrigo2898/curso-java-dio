package org.example;

public class ContaPoupanca extends Conta {
    public ContaPoupanca() {
    }

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("#### Extrato de Conta Poupança #####");
        super.imprimirInfosComuns();
    }
}
