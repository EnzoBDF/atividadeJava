package cafeteria.vendas;

import cafeteria.vendas.produtos.UnidadeMedida;

public class ItemVenda {
	private int id;
	private String nome;
	private UnidadeMedida medida;
	private int quantidade;
	private double preco;
	
	public ItemVenda(int id, String nome, UnidadeMedida medida, int quantidade, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.medida = medida;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public UnidadeMedida getMedida() {
		return medida;
	}

	public void setMedida(UnidadeMedida medida) {
		this.medida = medida;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
}
