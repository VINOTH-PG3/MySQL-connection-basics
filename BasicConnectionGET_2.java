package conectivityProcess;
import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicConnectionGET_2 {
public static void main(String[] args) throws ClassNotFoundException {
	
	
	                                  //ANOTHER METHOD//    JDBC_URL, USER_NAME,PASSWORD is not intialized
	                                  //in this way of connection JDBC_URL, USER_NAME,PASSWORD values url link ,user id, password, and driver path  
	                                  //are directly mentioned in connection
	
	
	try{
	
		 
		            // get connecting with database
//		  Class.forName("com.mysql.jdbc.Driver");      //this line is not compulsory because its given in  auto connect in eclipse
		  
		  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data_detials","root","vinothpg");
		  
		  Statement stmt2 =con.createStatement();      // stmt OBject is created to EXCECUTING Queries

		  
		         // here user2 is an already created table name in mysql database
		  System.out.println("GETTING RECORDS FROM THE TABLE");
		  System.out.println();
		  System.out.println("r_no   HscMark  sslcMark  HostelStudent");
		  
		         // Executing query
	         ResultSet student =stmt2.executeQuery("select * from user2");   //ResultSet is used get the data from table
		 
		  while (student.next()) {
			      // getting data from the table
			  System.out.println(student.getInt(1)+"\t"+student.getInt(2)+"\t"+student.getInt(3)+"\t"+student.getString(4));  }
			
			
		
      con.close();
	  }catch (SQLException e){
		  e.printStackTrace();
	  }
}
}
