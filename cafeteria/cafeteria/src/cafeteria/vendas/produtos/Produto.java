package cafeteria.vendas.produtos;

public class Produto {
	private int id;
	private String nome;
	private UnidadeMedida medida;
	private double preco;
	
	
	public Produto(int id, String nome, UnidadeMedida medida, double preco) {
		this.id = id;
		this.nome = nome;
		this.medida = medida;
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


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
}

