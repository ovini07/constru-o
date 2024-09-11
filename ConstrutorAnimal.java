package Construtores_11_09;

public class ConstrutorAnimal {

	public static void main(String[] args) {
		 Animal animal = new Animal("preto", 30);
	        Animal animal2 = new Animal("preto");
	        Animal animal3 = new Animal(30);

	        System.out.println("Cor do animal 1: " + animal.getCor());
	        System.out.println("Tamanho do animal 1: " + animal.getTamanho());
	        System.out.println("Cor do animal 2: " + animal2.getCor());
	        System.out.println("Tamanho do animal 3: " + animal3.getTamanho());

	}

}
