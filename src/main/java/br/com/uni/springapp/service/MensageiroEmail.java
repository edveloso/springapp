package br.com.uni.springapp.service;

import br.com.uni.springapp.model.Mensagem;

public class MensageiroEmail implements Mensageiro {

	public void send(Mensagem mensagem){
		System.out.println("Via Email: "+ mensagem); 
	}
	
}
