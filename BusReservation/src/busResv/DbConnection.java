package busResv;
import java.sql.*;

public class DbConnection  {

	private static final  String url="jdbc:mysql://localhost:3306/BusReservation";
	private static final  String userName="root";
	private static final  String password="Mouli";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,userName,password);
		
	}
	
	
	

}
