package a;

class X {
	
	//Construtor padr�o
	/*Lembrando que o padr�o tamb�m ir� seguir o modificador de acesso determinado*/
	X() {
		super();
	}
	
	/*Quando se cria um construtor o compilador deixa de adicionar o construtor padr�o*/
	X(String s) {
		
	}
}

	public class TestaConstrutores {
	public static void main(String[] args) {
		
		X a = new X();
		X b = new X("Guilherme");
		
	}
}
