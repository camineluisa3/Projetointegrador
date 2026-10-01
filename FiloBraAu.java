import java.util.Scanner; 

class FiloBraAu {
	
	String autorBrasileiro;
	String autorEstrangeiro;
	String Ideais;
	String Bio;

	public FiloBraAu(String autorBrasileiro, String autorEstrangeiro, String Ideais, String Bio) {

		if (autorEstrangeiro.trim().length() > 3) {

			this.autorBrasileiro = autorBrasileiro;
			this.autorEstrangeiro = autorEstrangeiro;

		} else {

			System.out.println("Nome inválido.");

		}
		
		this.Bio = Bio;
		
		if (Ideais.trim().length() > 2) {
			this.Ideais = Ideais;
		} else {
			System.out.println("Inválido");
		}
	}
	
	public void LerTeclado () {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Olá! Bem vindo ao código. O obejtivo desse código em especifico é encontrar autores brasileiros que compartilhem ideais parecidos com algum autor estrangeiro." + "\n" + "Escreva o nome de um autor estrangeiro, que devolveremos um brasileiro: ");
		
		String AutorDigitado = sc.nextLine ();
		
		System.out.println("Você digitou: " + AutorDigitado);
		
		
	}
}

