package bancodedados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoEstatica {
	private static String strConexao = "jdbc:postgresql://localhost:5432/cafeteria";
	private static String usuario = "postgres";
	private static String senha = "senha";
	static Connection conn = null;
	
	public static Connection getConnection() {
		
		try {
			if(conn == null) {
			conn = DriverManager.getConnection(strConexao, usuario, senha);
			}else {
				return conn;
			}
			System.out.println("Conexao estabelecida com sucesso!");
		} catch (SQLException e) {
			System.err.println("Erro de SQL na conexao: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Erro na conexao: " + e.getMessage());
		}
		return conn;
	}
	
	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			System.err.println("Erro de SQL no encerramento da conexao: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Erro no encerramento da conexao: " + e.getMessage());
		}
	}
}

