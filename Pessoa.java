package Construtores_11_09;

public class Pessoa {
	private String nome;
	private int idade;
	public Pessoa() {
		
	}
	//********** Construtor 1 ***************//
	public Pessoa(String nome) {
	this.nome= nome;
	}
	//***********Construtor 2***************//
	public Pessoa(String nome, int idade) {
	this.nome= nome;
	this.idade=idade;
	}
	public String getNome() {
	return nome;
	}
	public void setnome(String nome) {
	this.nome = nome;
	}
	public int getidade() {
	return idade;
	}
	public void setidade(int idade) {
	this.idade = idade;
	}
	///**************Construtor 3********//
	public Pessoa(int idade) {
	this.idade= idade;
	}
}