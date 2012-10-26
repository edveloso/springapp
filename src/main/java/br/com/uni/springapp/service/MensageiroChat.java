package br.com.uni.springapp.service;

import br.com.uni.springapp.model.Mensagem;

public class MensageiroChat  implements Mensageiro{

	public void send(Mensagem mensagem){
		System.out.println("Via Chat: "+ mensagem); 
	}
	
}
