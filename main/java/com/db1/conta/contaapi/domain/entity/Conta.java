package com.db1.conta.contaapi.domain.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;

public class Conta {
	
		private Long id;
		
		private Agencia agencia;
		
		private ContaTipo contaTipo;
		
		private String numero;
		
		private Cliente cliente;
		
		private Double saldo;
		
		private List<Historico> historico = new ArrayList<Historico>();
		
		
		public Conta (Agencia agencia, ContaTipo contatipo, String numero, Cliente cliente, Double saldo){
			
			Assert.notNull(agencia, "Agência é Obrigatório");
			Assert.notNull(contatipo, "ContaTipo é Obrigatório");
			Assert.hasText(numero, "Numero é Obrigatório");
			Assert.notNull(cliente, "Cliente é Obrigatório");
			Assert.notNull(saldo, "Saldo é Obrigatório");
			this.agencia = agencia;
			this.contaTipo = contatipo;
			this.numero = numero;
			this.cliente = cliente;
			this.saldo = saldo;

		}
		
		public Long getId(){
			return id;
			
		}
		
		public Agencia getAgencia(){
			return agencia;
	
		}

		public ContaTipo getContaTipo(){
			return contaTipo;
			
		}
			
			public String getnumero(){
				return numero;
	
		}
		

		public Cliente getCliente(){
			return cliente;
	
			
		}

		public Double getSaldo(){
			return saldo;
	
		}
		
		public List<Historico> getHsitorico(){
			return historico;
	
		}
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



		}
		


