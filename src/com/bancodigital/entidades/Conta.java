package com.bancodigital.entidades;

public abstract class Conta {
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
    public abstract void depositar(double valor);
	
	public abstract void sacar(double valor);
	
	public abstract void transferir(double valor, Conta conta);
	
	public abstract void verificaExtrato();

}
