package PortoSeguroPOO;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automovel auto = new Automovel("Rejane Santos", "Celta", 
				"RSA2J34", 2015);
		
		auto.imprimirInfo();
		System.out.println("\n***********************");
		System.out.println("\n***Transfer�ncia de Propriet�rio***");
		auto.setNomeProprietario("Emilly Pellini");
		System.out.println("\n***********************");
		auto.imprimirInfo();

	}

}
