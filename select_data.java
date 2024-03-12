package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class select_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 //connnection
			 String url="jdbc:mysql://localhost:3306/student";
			 String user="root";
			 String password="simransahu123";
			 Connection con= DriverManager.getConnection(url,user,password);
			 //query
			 String q="select * from perinfo where name like '%a' ";
			 //fire query
			 Statement s=con.createStatement();
			 ResultSet set=s.executeQuery(q);
			// BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//		String name=br.readLine();
			 
			 while(set.next())  {
				 int id=set.getInt(1);
				 String name1=set.getString(2);
				 String email=set.getString(3);
				 String sub=set.getString(4);
				 System.out.println(id+" "+name1+" "+email+" "+sub);
			 }
			 s.close();
		 }
catch (Exception e) {
	e.printStackTrace();
}
	}

}
