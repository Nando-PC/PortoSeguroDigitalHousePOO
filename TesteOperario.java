package PortoSeguroPOO;

public class TesteOperario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operario operario1 = new Operario("João Neves", "Rua Anchieta, 23",
				"23312262134", 978563211, 25, 50, 15);
		
		System.out.println("----Dados do Operario----");
		operario1.imprimirInfo();
		System.out.println("\n----Pagamento----");
		operario1.calcularProducao();

	}

}
