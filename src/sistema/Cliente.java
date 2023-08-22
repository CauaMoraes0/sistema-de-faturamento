package sistema;

public class Cliente {
	private String nome;
	private String cpfCnpj;
	private String endereco;
	
	public Cliente(String nome, String cpfCnpg, String endereco, String cpfCnpj) {
		this.setNome(nome);
		this.setCpfCnpj(cpfCnpj);
		this.setEndereco(endereco);
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

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

}
