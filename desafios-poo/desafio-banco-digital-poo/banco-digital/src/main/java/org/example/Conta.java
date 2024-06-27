package org.example;

import java.math.BigDecimal;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENTIAL = 1; //variavel de controle iniciada em 1 dentro da classe pra criar nro seq de conta

    protected int agencia;
    protected int numero;
    protected BigDecimal saldo = new BigDecimal(0);

    protected Cliente cliente;

    public Conta() {
    }

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENTIAL++; // Forçando a criação de numero subsequente. Funcionará como uma chave primaria
        this.cliente = cliente;
    }

    public static int getSEQUENTIAL() {
        return SEQUENTIAL;
    }

    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


    public BigDecimal getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }


    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }


    protected void imprimirInfosComuns() {
        System.out.printf(String.format("Titular: %s%n", this.cliente.getNome()));
        System.out.printf(String.format("Agência: %d%n", this.agencia));
        System.out.printf(String.format("Número: %d%n", this.numero));
        System.out.printf(String.format("Saldo: %.2f%n", this.saldo));
    }

    //implementação de metodos da interface IConta
    @Override
    public void sacar(BigDecimal valor) {
        saldo = saldo.subtract(valor);

    }

    @Override
    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
    }

    @Override
    public void transferir(BigDecimal valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {

    }
}
