package Construtores_11_09;

public class ConstrutorCarro {
	public static void main(String[] args) {
	Carro carro1 = new Carro();
	System.out.println("Carro1");
	System.out.println(carro1.getPlaca());
	System.out.println(carro1.getnumChassi());
	//***********Construtor sem argumento*********
	Carro carro2 = new Carro();
	System.out.println("Carro2");
	carro2.setPlaca("hw273");
	carro2.setnumChassi(12345);
	System.out.println(carro2.getPlaca());
	System.out.println(carro2.getnumChassi());
	//**********Construtor com 1 argumento*************
	System.out.println("Carro3");
	Carro carro3= new Carro();
	carro3.setPlaca("hw7728");
	carro3.setnumChassi(12345);
	System.out.println(carro3.getPlaca());
	System.out.println(carro2.getnumChassi());
	//**********Construtor com 1 argumento*************
	Carro carro4= new Carro();
	System.out.println("Carro4");
	carro4.setPlaca("yg3672");
	carro4.setnumChassi(12345);
	System.out.println(carro4.getPlaca());
	System.out.println(carro4.getnumChassi());
}
}
