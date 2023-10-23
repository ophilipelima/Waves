package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList; 

public class DAO {

	private String driver = "com.mysql.cj.jdbc.Driver";
		
	private String url = "jdbc:mysql://localhost:3306/wavesbd";
		
	private String user = "root";
		
	private String password = "root";

	private Connection conectar() {
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
	
	}


	

