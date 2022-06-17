package Jmeter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {

	public static String dbValue() throws ClassNotFoundException, SQLException {

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	
		String connectionUrl = "jdbc:sqlserver://AGL78\\SQLEXPRESS;databaseName=Jmeter;user=sa;password=ATE186@agaramtech";
	 
		Connection conn = DriverManager.getConnection(connectionUrl);
	
		Statement statement = conn.createStatement();
		
		String selectSql = "select * from Jmeter";
	
		ResultSet rs=statement.executeQuery(selectSql);
		
		List <String>value=new ArrayList();
		 
		while(rs.next())
		{
			String dbValue=rs.getString(1);
			
			value.add(dbValue);
			
		 
		}
		 
		String finalValue= value.get(0);
		
		
		return finalValue; 
		 
	}
}
