package cafeteria.vendas.produtos;

public class EstoqueProduto extends Produto {
	
	private int estoque;

	public EstoqueProduto(int id, String nome, UnidadeMedida medida, double preco) {
		super(id, nome, medida, preco);
		this.estoque = estoque;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	

}
