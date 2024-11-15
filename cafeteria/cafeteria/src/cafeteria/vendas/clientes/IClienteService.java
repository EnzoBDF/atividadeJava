package cafeteria.vendas.clientes;

public interface IClienteService {
	public void incluirCliente(String nome, String telefone);
	public void alterarCliente(String nome, String telefone);
	public Cliente consultarCliente(int id);
}
