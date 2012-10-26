package br.com.uni.springapp.model;


public class Mensagem {

	private String texto;
	
	public Mensagem(String texto) {
		super();
		this.texto = texto;
	}

	public Mensagem() {
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return texto;
	}
	
	
}
