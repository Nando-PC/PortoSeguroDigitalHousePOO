package PortoSeguroPOO;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String cpf;
	private String cnpj;
	private int telefone;
	private int idade;
	
	
	public Pessoa(String nome, String endereco, // referencia Operario e Empregado
			String cpf, int telefone, int idade) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	public Pessoa(String nome, String endereco, //referencia Fornecedor
			String cnpj, int telefone) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.telefone = telefone;
	}
	
	

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void validarCpf() {
		if(getCpf().length() != 11) { //length---conta a qtde de caracteres
			System.out.println("\n---CPF inválido.");
		}
		else {
			System.out.println("\n---CPF válido.");
		}
		
	}

}
