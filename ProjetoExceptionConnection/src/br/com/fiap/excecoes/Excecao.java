package br.com.fiap.excecoes;

public class Excecao extends Exception{
	
	public Excecao() {
		super();
		System.out.println("Erro");
	}
	
	public Excecao(Exception e) {
		super();
		if (e.getClass().toString().equals("class java.lang.NumberFormatException")){
		System.out.println("Digitou letra ao inves de um numero");
	}else {
		System.out.println("Falha desconhecida");
		}

	}
}
