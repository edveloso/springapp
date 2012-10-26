package br.com.uni.springapp.test;

import br.com.uni.springapp.model.Mensagem;
import br.com.uni.springapp.service.Mensageiro;

public class Cliente {

	private Mensageiro  mensageiro; 
	
	public void envia(Mensagem mensagem) {
		mensageiro.send(mensagem);
	}
	

	public Mensageiro getMensageiro() {
		return mensageiro;
	}

	public void setMensageiro(Mensageiro mensageiro) {
		this.mensageiro = mensageiro;
	}

}
