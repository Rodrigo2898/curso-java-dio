package org.example;

public class ContaCorrente extends Conta {
    public ContaCorrente() {
    }

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("#### Extrato de Conta Corrente #####");
        super.imprimirInfosComuns();
    }
}
