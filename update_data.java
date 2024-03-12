package practice;

import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
public class update_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String password="simransahu123";
			Connection con=DriverManager.getConnection(url,user,password);
			//query
			String q="update perinfo set name=? , email=?, sub=? where id=?";
			//query fire
			PreparedStatement p=con.prepareStatement(q);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String name=br.readLine();
			String mail=br.readLine();
			String sub=br.readLine();
			int id=Integer.parseInt(br.readLine());
			
			p.setString(1, name);
			p.setString(2, mail);
			p.setString(3, sub);
			p.setInt(4, id);
			p.executeUpdate();
			p.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
