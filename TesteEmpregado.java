package PortoSeguroPOO;

public class TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado emp = new Empregado("Edu", "Rua da Marola, 361",
				"54434474585", 948445676, 35, 123, 20000, 15);
		emp.imprimirInfo();
		emp.calcularSalario();
		
		
	}

}
