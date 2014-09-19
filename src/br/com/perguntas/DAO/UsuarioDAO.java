package br.com.perguntas.DAO;

public class UsuarioDAO {

	public boolean cadastrar(){
		
		
		return false;
		
	}
	
	
	
//	public int adiciona(Contato contato) throws SQLException {
//		String sql = "INSERT INTO contatos(nome, email, endereco) " +
//			"VALUES(?, ?, ?)";
// 
//		//Inserir a constante RETURN_GENERATED_KEYS
//		PreparedStatement stmt = this.connection.prepareStatement(sql, 
//				Statement.RETURN_GENERATED_KEYS);
// 
//		stmt.setString(1, contato.getNome());
//		stmt.setString(2, contato.getEmail());
//		stmt.setString(3, contato.getEndereco());
// 
//		stmt.execute();
// 
//		//recuperar o ResultSet
//		ResultSet rs = stmt.getGeneratedKeys();
//		rs.next();
//		int id = rs.getInt(1);	// <= o valor do campo está aqui		
//		stmt.close();
// 
//		return id;
//	}
	
}
