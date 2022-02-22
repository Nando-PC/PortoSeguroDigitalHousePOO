package PortoSeguroPOO;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente("Manoel dos Santos", 10001,"Rua Cinco, 48",
				"12547859632", 998766544, 35, "Liquidificador", 1, 75);
		System.out.println("****Dados do Cliente*****");
		cliente1.imprimirInfo();
		System.out.println("\n*****Dados da Compra*****");
		cliente1.dadosCompra();
		

	}

}
