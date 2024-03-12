package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert_data {

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
			String q="insert into perinfo(id,name,email,sub) value(?,?,?,?)";
			//query fire
			PreparedStatement p=con.prepareStatement(q);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("enter id");
			int id=Integer.parseInt(br.readLine());
			System.out.println("name");
			String name=br.readLine();
			System.out.println("enter email");
			String email=br.readLine();
			System.out.println("enter sub");
			String sub=br.readLine();
			p.setInt(1, id);
			p.setString(2, name);
			p.setString(3, email);
			p.setString(4, sub);
			
			p.executeUpdate();
			System.out.print("done bro");
			p.close();
		}
		catch(Exception e){
            e.printStackTrace();			
		}

	}

}
