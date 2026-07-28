


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/Demo";
		String username = "postgres";
		String password = "root";
		

		try {
			
			//Step 1
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded ");
			
			
			//Step 2
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is created");
			
			
			//step 3
			Statement stm = con.createStatement();
			System.out.println("statement is created");
			
			String query = "insert into student values(109,'Pengi','pengi@gmail.com',45678765)";

			
			stm.execute(query);
			System.out.println("Record saved");
			
			
			con.close();
			System.out.println("Connection is closed");
			
			
			
		
	
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
