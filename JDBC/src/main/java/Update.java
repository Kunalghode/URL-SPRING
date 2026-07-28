import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/Demo";
		String username = "postgres";
		String password = "root";
		
		
		
		
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Load the Driver");
			
			
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is created");
			
			
			Statement stm= con.createStatement();
			System.out.println("statement is created");
			
			
	      String query = "update student set phoneno=1234567890 where id=102";
	      
	      stm.execute(query);
			System.out.println("Record saved");
			
			con.close();

			System.out.println("record updated and connection is closed");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
