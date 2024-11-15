package cafeteria.vendas.produtos;


public interface IProdutoService {
	public void incluirProduto(String nome, String telefone);
	public void alterarProduto(String nome, String telefone);
	public Produto consultarProduto(int id);
}
