package com.bancodigital.entidades;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(String nome, String cpf) {
		super();
		setCliente(new Cliente(nome, cpf));
	}
		
	public ContaCorrente(String nome, String cpf, double depositoInicial, int numero) {
		super();
		setCliente(new Cliente(nome, cpf));
		setNumero(numero);
		depositar(depositoInicial);
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;		
	}

	@Override
	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque realizado com Sucesso!");
		} else {
			System.out.println("Saldo Insuficiente!");
		}
	}

	@Override
	public void transferir(double valor, Conta conta) {
		this.saldo -= valor;
		conta.saldo += valor;
		System.out.println("Transação " + cliente.getNome() + " -> " + conta.cliente.getNome() + " efetuada com Sucesso!");
	}

	@Override
	public void verificaExtrato() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaCorrente [numero => ");
		builder.append(numero);
		builder.append(" ");
		builder.append(cliente);
		builder.append(", saldo R$ ");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}

}
