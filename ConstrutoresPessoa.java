package Construtores_11_09;

public class ConstrutoresPessoa {

	public static void main(String[] args) {
		Pessoa jogador2 = new Pessoa("Messi",36);
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getidade());
		//***********Construtor sem argumento*********
		
		Pessoa jogador1 = new Pessoa();
		
		jogador1.setidade(10);
		jogador1.setnome("MARGARIDA");
		
		System.out.println(jogador1.getidade());
		
		System.out.println(jogador1.getNome());
		//**********Construtor com 1 argumento*************
		
		Pessoa jogador3= new Pessoa("ROSA");
		System.out.println(jogador3.getNome());
		//**********Construtor com 1 argumento*************
		
		Pessoa jogador4= new Pessoa(15);
		System.out.println(jogador4.getidade());
	}
}

