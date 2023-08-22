package sistema;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.setNome(nome);
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double calcularTotal() {
		return preco * quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
