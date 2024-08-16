package com.bancodigital.aplicativo;

import com.bancodigital.entidades.Cliente;
import com.bancodigital.entidades.Conta;
import com.bancodigital.entidades.ContaCorrente;
import com.bancodigital.entidades.ContaPoupanca;

public class Aplicativo {

	public static void main(String[] args) {
	
		Cliente cliente = new Cliente("EFNRA", "06281312406");
		Conta cc = new ContaCorrente(cliente.getNome(), cliente.getCpf(), 550.0, 001);
		Conta cp = new ContaPoupanca(cliente.getNome(), cliente.getCpf(), 100.0, 002);
		
		cc.verificaExtrato();
		cp.verificaExtrato();
		
		cc.sacar(45.0);
		cc.verificaExtrato();
		
		System.out.println("______________________________");
		
		cc.transferir(105.0, cp);
		cc.verificaExtrato();
		cp.verificaExtrato();
		
		Conta cpEdmar = new ContaPoupanca("Edmar Alves", "02471948424", 003);
		cpEdmar.verificaExtrato();
		
		cc.transferir(209.50, cpEdmar);
		
		cc.verificaExtrato();
		cpEdmar.verificaExtrato();
		
		cc.sacar(210.0);
		
		
		
		
	}

}
