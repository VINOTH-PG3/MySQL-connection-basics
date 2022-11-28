package conectivityProcess;
import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class CreatingTableAtMysqlDatabase {
                   /////CREATING NEW DATABASE AND TABLE AND INSERTING DETAILS IN ECLIPSE////

	              //JDBC driver name and database URL
		 // static final String JDBC_DRIVER ="com.mysql.cj.jdbc.Driver";
		  static final String JDBC_URL ="jdbc:mysql://localhost:3306";  // here database name is not added
		                                                                //because we are creating new database below
		
		         //database user name and password in MYSQL
		  static final String USER_NAME ="root";
		  static final String PASSWORD ="vinothpg";
		    
		  public static void main(String[] args) throws SQLException, ClassNotFoundException {
			  
			  
			  try{
				 // Class.forName("com.mysql.jdbc.Driver"); //its shows error loading class error so jc is added below
				  
				        ////this line28 is not compulsory because its given in  auto connect in eclipse///
				         //register jdbc driver
//                 Class.forName(JDBC_DRIVER); // cj is added to remove errorLoadind class 'com.mysql.jdbc.Driver'
				                                            //  youtube link for jc :https://youtu.be/dvkqHxbFNRM
				 
				          // get connecting with database
				  Connection con =DriverManager.getConnection(JDBC_URL, USER_NAME,PASSWORD);
				  Statement stmt =con.createStatement();        // stmt OBject is created to EXCECUTING Queries
				  System.out.println("connection sucessfull");
				 
				          // Executing querys
				  System.out.println("INSERTING RECORDS INTO THE TABLE");
			  			  
				          //query is qiven to create database name
				  String sql = "create database Employee_DETIALS " ;
                   stmt.executeUpdate(sql);
				  System.out.println("DATABASE CREATED SUCESSFULLY");// database will be created in mysql and check sql database
				        
				       // database is selected to EXCECUTE to add data in table
				  String sql2 = "use Employee_DETIALS " ;
                  stmt.executeUpdate(sql2);
				  System.out.println("DATABASE CREATED CAN BE IS USED AND ADD DATA");
				  
				  
				      //Query to create table  /* creating table name and row headings with datatypes   */ 
				  String sql3 = " create table Employee_DETIALS.Employee ( Emp_id int, E_Name  VARCHAR(30)not null,Qualification VARCHAR(30)not null,Desgination VARCHAR(30)not null)";
				  stmt.executeUpdate(sql3);
				  System.out.println("DATABASE CREATED SUCESSFULLY WITH TABLE ");
				  
				  

			               // Query is used to Insert data in Table
				    String sql4 = " INSERT INTO Employee "+ 
			                 " VALUES (1,'SURYA','B.E MECH','PHP')";
			                 stmt.executeUpdate(sql4);
			                 System.out.println("RECORD INSERTED SUCESSFULLY");
				        
			             // Query is used to Insert data in Table
			        String sql5 = " INSERT INTO Employee "+ 
		                 " VALUES (2,'VINOTH','B.E MECH','JAVA')";
		                 stmt.executeUpdate(sql5);
		                 System.out.println("RECORD INSERTED SUCESSFULLY");
		 
		                 // Query is used to Insert data in Table
		            String sql6 = " INSERT INTO Employee "+ 
                       " VALUES (3,'DHILEEPAN','B.E MECH','JAVA')";
                 stmt.executeUpdate(sql6);
           System.out.println("RECORD INSERTED SUCESSFULLY");
				

				con.close();
			  }catch (SQLException e){
				  e.printStackTrace();
			  }
		}
		  
		  
		}


