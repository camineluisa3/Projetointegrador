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
		
		if (Ideais.trim().length() > 2) {
			this.Ideais = Ideais;
		} else {
			System.out.println("Inválido");
		}
	}
	
	
}
