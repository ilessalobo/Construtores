package a;

class X {
	
	//Construtor padrão
	/*Lembrando que o padrão também irá seguir o modificador de acesso determinado*/
	X() {
		super();
	}
	
	/*Quando se cria um construtor o compilador deixa de adicionar o construtor padrão*/
	X(String s) {
		
	}
}

	public class TestaConstrutores {
	public static void main(String[] args) {
		
		X a = new X();
		X b = new X("Guilherme");
		
	}
}
