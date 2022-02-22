package PortoSeguroPOO;

public class Fornecedor extends Pessoa{
	
	private int codigoFornecedor;
	private int quantidade;
	private double valorProduto;
	private String produto;
	
	//criar antes o construtor em Pessoa com os atributos de super()
	
	public Fornecedor(String nome, String endereco,
			String cnpj, int telefone, int codigoFornecedor, String produto,
			int quantidade,	double valorProduto) {
		
		super(nome, endereco, cnpj, telefone);
		this.codigoFornecedor = codigoFornecedor;
		this.quantidade = quantidade;
		this.valorProduto = valorProduto;
		this.produto = produto;		
		
	}

	public int getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(int codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
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

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public void imprimirInfo() {
		System.out.println(
				"Nome do Fornecedor: "+getNome()+
				"\nCNPJ: "+getCnpj()+
				"\nEndereço: "+getEndereco()+
				"\nTelefone: "+getTelefone()+
				"\nNome do Produto: "+produto+
				"\nQuantidade: "+quantidade+
				"\nValor do Produto: "+valorProduto);
	}
	
	public void valorTotal() {
		double valorTotal = quantidade * valorProduto;		
		System.out.println(
				"\nValor Total a ser pago ao fornecedor é: "+valorTotal);
	}


}
