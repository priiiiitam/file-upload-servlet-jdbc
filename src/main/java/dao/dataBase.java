package dao;
import java.sql.*;
public class dataBase {
public void saveUser(String name, String password, String fileName) {	
		try {
			String Driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(Driver);
			String url = "jdbc:mysql://localhost:3306/pritamdb";
			String userName = "root";
			String pass = "Pritam@2005";
			Connection cn = DriverManager.getConnection(url,userName,pass);
			
			String q = "insert into files(name,password,fileName) values(?,?,?)";
			
			PreparedStatement ps = cn.prepareStatement(q);
			ps.setString(1,name);
			ps.setString(2,password);
			ps.setString(3,fileName);
			
			int row = ps.executeUpdate();
			if(row > 0) {
				System.out.print("data is stored sucessfully");
			}
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
	}
}
