package conectivityProcess;
import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicConectionSET {

              //JDBC driver name and database URL
	  static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	  static final String JDBC_URL ="jdbc:mysql://localhost:3306";
	
	         //database user name and password in MYSQL
	  static final String USER_NAME ="root";
	  static final String PASSWORD ="vinothpg";
	    
	  public static void main(String[] args) throws SQLException, ClassNotFoundException {
		  
		  
		  try{
			      //Class.forName("com.mysql.jdbc.Driver");  // its shows error loading class error so jc is added below
			      
			  //REGISTER JDBC DRIVER
			  Class.forName("com.mysql.cj.jdbc.Driver");     // cj is added to remove errorLoadind class 'com.mysql.jdbc.Driver'
			                                                 // youtube link for jc :https://youtu.be/dvkqHxbFNRM
			 
			          // get connecting with database
			  Connection con =DriverManager.getConnection(JDBC_URL, USER_NAME,PASSWORD);
			  Statement stmt =con.createStatement();        // stmt OBject is created to EXCECUTING Queries
			  System.out.println("connection sucessfull");
			 
			 
			          // Executing query
			  System.out.println("INSERTING RECORDS INTO THE TABLE");
			  String sql1= "use `student_data_detials`";   // database is selected to EXCECUTE to add data in table
			  stmt.executeUpdate(sql1);
			  
			  // here user2 is an already created table name in mysql database
			  String sql = " INSERT INTO user2 "+ 
			                 " VALUES (14,1000,1000,'HOSTEL')";
			                 stmt.executeUpdate(sql);
			 System.out.println("RECORD INSERTED SUCESSFULLY");
			        // if record is inserted its display successful and go and check database 1 column will be added
			
			con.close();
		  }catch (SQLException e){
			  e.printStackTrace();
		  }
	}
	  
	  
	}

