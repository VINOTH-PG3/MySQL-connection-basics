package conectivityProcess;
import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicConnectionGET {
	                       
	                         //in this way of connection JDBC_URL, USER_NAME,PASSWORD is intialized as variable 
	                         //and get their values url link ,user id, password, and driver path  below and mentioned in connection
	     
	
	//JDBC driver name and database URL
  static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
  static final String JDBC_URL ="jdbc:mysql://localhost:3306/student_data_detials";
         //database user name and password in MYSQL
  //JDBC driver name and database URL
  static final String USER_NAME ="root";
  static final String PASSWORD ="vinothpg";
    
  public static void main(String[] args) throws SQLException {
	  
	  try{
		             // get connecting with database
		  Connection con =DriverManager.getConnection(JDBC_URL, USER_NAME,PASSWORD);
		  Statement stmt =con.createStatement();  // stmt OBject is created to EXCECUTING Queries
		  
		             // Executing query
		  System.out.println("GETTING RECORDS FROM THE TABLE");
		  
		             // here user2 is an already created table name in mysql database
		  ResultSet student =stmt.executeQuery("select * from user2");     //ResultSet is used get the data from table
		  
		 
		  while (student.next()) {
			  System.out.println(student.getInt(1)+"\t"+student.getInt(2)+"\t"+student.getInt(3)+"\t"+student.getString(4));
			
			
		}
		  con.close();
	  }catch (SQLException e){
		  e.printStackTrace();
	  }
}
  
  
}
