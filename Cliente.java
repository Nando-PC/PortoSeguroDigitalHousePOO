package PortoSeguroPOO;

public class Cliente extends Pessoa {
	
	private int codigoCliente;
	private String produto;
	private int quantidade;
	private double valorProduto;
	
	public Cliente(String nome, int codigoCliente, String endereco, String cpf, 
			int telefone, int idade, String produto, 
			int quantidade, double valorProduto) {
		
		super(nome, endereco, cpf, telefone, idade);
		this.codigoCliente = codigoCliente;
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorProduto = valorProduto;			
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	public void imprimirInfo() {
		System.out.println(
				"Código do Cliente: "+codigoCliente+
				"\nNome do Cliente: "+getNome()+
				"\nCPF: "+getCpf()+
				"\nIdade: "+getIdade()+				
				"\nEndereço: "+getEndereco()+
				"\nTelefone: "+getTelefone());
	}
	
	public void dadosCompra() {
		double valorTotal = valorProduto*quantidade;
		System.out.println(
				"Código do Cliente: "+codigoCliente+
				"\nNome do Cliente: "+getNome()+
				"\nNome do Produto: "+produto+
				"\nValor do Produto: "+valorProduto+
				"\nQuantidade: "+quantidade+
				"\nValor Total da Compra: "+valorTotal);
	}

}
