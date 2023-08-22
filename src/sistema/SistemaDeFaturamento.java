package sistema;

public class SistemaDeFaturamento {
	public static void main(String [] args) {
		Produto produto1 = new Produto("Camiseta", 29.99, 2);
		Produto produto2 = new Produto("Calça", 59.99, 1);
		
		Cliente cliente = new Cliente("Cauã Moraes", "123.456.789.00", "Rua Aparecida de São José, 222", null);
		
		Fatura fatura = new Fatura(cliente);
		fatura.adicionarProdutos(produto1);
		fatura.adicionarProdutos(produto2);
		
		double totalFatura = fatura.calcularTotalFatura();
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("Total da fatura: R$" + totalFatura);
	}

}
