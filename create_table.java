package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class create_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//driver load
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String password="simransahu123";
			Connection con=DriverManager.getConnection(url,user,password);
			//query
			String q="create table perinfo(id int primary key auto_increment,name varchar(10),email varchar(100),sub varchar(100))";
			//query fire
			Statement s=con.createStatement();
			s.executeUpdate(q);
			System.out.print("all right!!!!!!!!");
			s.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
