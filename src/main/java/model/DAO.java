package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList; 

public class DAO {

	private String driver = "com.mysql.cj.jdbc.Driver";
		
	private String url = "jdbc:mysql://127.0.0.1:3306/wavesbd";
		
	private String user = "root";
		
	private String password = "1234";

	public Connection conectar() {
		Connection con = null;
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);
				return con;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}

		}
		
	public void inserirCadastro(JavaBeans tbl_cadastro) {
		String create = "insert into tbl_cadastro (nome,email,senha) values (?,?,?)";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, tbl_cadastro.getNome());
			pst.setString(2, tbl_cadastro.getEmail());
			pst.setString(3, tbl_cadastro.getSenha());
			pst.execute();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	}


	

