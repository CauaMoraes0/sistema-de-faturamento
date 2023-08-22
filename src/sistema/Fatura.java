package sistema;
import java.util.ArrayList;
import java.util.List;

public class Fatura {
	private Cliente cliente;
	private List<Produto> produtos;
	
	public Fatura(Cliente cliente) {
		this.setCliente(cliente);
		produtos = new ArrayList<>();
	}
	
	public void adicionarProdutos(Produto produto) {
		produtos.add(produto);
	}
	
	public double calcularTotalFatura() {
		double total = 0;
		for (Produto produto : produtos) {
			total += produto.calcularTotal();
		}
		return total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}