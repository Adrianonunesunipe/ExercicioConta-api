package com.db1.conta.contaapi.domain.entity;

import java.util.ArrayList;

import java.util.List;

import org.junit.Assert;

public class Cliente {
	
	private Long id;
	
	private String nome;
	
	private String cpf;
	
	private List<Endereco> endereco = new ArrayList<Endereco>();
	
	private List<Conta> conta = new ArrayList<Conta>();
	

	public Cliente (String nome, String cpf){
		Assert.hasText(nome, "Nome Ã© obrigatÃ³rio.");
		Assert.hasText(cpf, "CPF Ã© obrigatÃ³rio.");
		this.nome = nome;
		this.cpf = cpf;

}
	

	public Long getId(){
	return id;
	
}

	public String getNome(){
	return nome;

}

	public String getCpf(){
	return cpf;
	
}
	
	public List<Endereco> getEndereco(){
		return endereco;

}


	public List<Conta> getConta(){
	return conta;


}

	
}