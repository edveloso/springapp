package br.com.uni.springapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.uni.springapp.model.Mensagem;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mensagem mensagem = new Mensagem("Minha mensagem");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Cliente cli = (Cliente) ctx.getBean("cliente");
		cli.envia( mensagem);
		
	}

}
