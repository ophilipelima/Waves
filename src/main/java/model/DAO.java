package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList; 

public class DAO {

	private String driver = "com.mysql.cj.jdbc.Driver";
		
	private String url = "jdbc:mysql://localhost:3306/wavesbd?user=philipe&password=1234";
		
	private String user = "philipe";
		
	private String password = "1234";

	private Connection conectar() {
		Connection con = null;
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url);
				return con;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}

		}
	
	}


	

