package employeeInterview;
import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class CreatingTableEmployee {
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
					 
					  
					   
					          // get connecting with database
					  Connection con =DriverManager.getConnection(JDBC_URL, USER_NAME,PASSWORD);
					  Statement stmt =con.createStatement();        // stmt OBject is created to EXCECUTING Queries
					  System.out.println("connection sucessfull");
					 
					  String sqdrop = "drop database  CANDIDATES " ;   //its just given to delete database 
					  stmt.executeUpdate(sqdrop);                                             //existing name and create new database 
					  
					        
					  
					         // Executing query
					  System.out.println("CREATING DATABASE CANDIDATE AND TABLE EMPLOYEE INSERTING RECORDS INTO THE TABLE");
				  			  
					  
					         //query is given to create database name
					  String sqLcreate = "create database CANDIDATES " ;
	                  stmt.executeUpdate(sqLcreate);
					  System.out.println("DATABASE CREATED SUCESSFULLY");// database will be created in mysql and check sql database
					        
					  
					          // database is selected to EXCECUTE to add data in table
					  String sql2 = "use CANDIDATES " ;
	                  stmt.executeUpdate(sql2);
					  System.out.println("DATABASE CREATED CAN BE IS USED AND ADD DATA");
					  
					  
					         //Query to create table  /* creating table name and row headings with datatypes   */ 
					  String sql3 = " create table CANDIDATES.Employee "
					  		+ "( "
					  		+ "employeeId VARCHAR(36) PRIMARY KEY,  "
					  		+ "firstName  VARCHAR(40)not null,  "
					  		+ "MiddleName VARCHAR(40)not null, "
					  		+ " lastName VARCHAR(30)not null, "
					  		+ "fullName VARCHAR(60)not null,   "
					  		+ "emailId VARCHAR(60)not null,   "
					  		+ "education VARCHAR(30)not null,"
					  		+ "mobileNumber Varchar(12),"
					  		+ " dateOfBirth VARCHAR(12),  "
					  		+ "gender VARCHAR(30)not null,  "
					  		+ "address1 VARCHAR(40)not null,"
					  		+ "address2 VARCHAR(40)not null,"
					  		+ "pincode int,"
					  		+ "City VARCHAR(30)not null, "
					  		+ "State VARCHAR(30)not null,"
					  		+ "jobDesignation VARCHAR(30)not null,"
					  		+ "jobRole VARCHAR(30)not null,"
					  		+ "joiningdDate VARCHAR(30)not null,"
					  		+ "Salary VARCHAR(30)not null,"
					  		+ "PerAnnum VARCHAR(30)not null)";
					  
					  stmt.executeUpdate(sql3);
					  System.out.println("DATABASE CREATED SUCESSFULLY WITH TABLE ");
					  
				               // Query is used to Insert data in Table
					    String sql4 = " INSERT INTO Employee "+ " "
					    		+ "VALUES ("
					    		+ "	UUID(),'vinoth',"
					    		+ "	'',"
					    		+ "	' PG',"
					    		+ "	CONCAT(firstName, MiddleName, lastName),"
					    		+ "	CONCAT(firstName, MiddleName,'Itech@gmail.com'),"
					    		+ "'B.E MECH',"
					    		+ "	8065559246,"
					    		+ " DATE_FORMAT (19911001, '%d/%m/%Y'),"
					    		+ "	'MALE',"
					    		+ " 'PRC SHED',"
					    		+ " 'USILAMPATTI',"
					    		+ "	625532,"
					    		+ "	'MADURAI',	"
					    		+ "'TAMIL NADU',"
					    		+ "	'JAVA',	"
					    		+ "'TRAINEE',"
					    		+ "	'05/01/2023 10:00:00 AM',"
					    		+ "	'30000',	"
					    		+ "CONCAT(Salary*12/100000,IF(Salary*12>100000,' LPA',' KPA'))"
					    		+ ")";
					    stmt.executeUpdate(sql4);
                        System.out.println("RECORD-1 INSERTED SUCESSFULLY");
				                 
				                 // Query is used to Insert data in Table
					    String sql5 = " INSERT INTO Employee VALUES (UUID(),'Sundera','moorthy',' R',CONCAT(firstName, MiddleName, lastName),CONCAT(firstName, MiddleName,'Itech@gmail.com'),'MCA','8056669246',DATE_FORMAT (19931001, '%d/%m/%Y'),'MALE','CKECKANOORNI','USILAMPATTI',625532,'MADURAI','TAMIL NADU','JAVA','TRAINEE','11/01/2023  10:00:00 AM','30000', CONCAT(Salary*12/100000,IF(Salary*12>100000,' LPA',' KPA')) )" ;        
					    stmt.executeUpdate(sql5);
								    
		                System.out.println("RECORD-2 INSERTED SUCESSFULLY"); 
							                 
							                 
							                 
							                 
							     // Query is used to Insert data in Table
						String sql6 = " INSERT INTO Employee VALUES (UUID(),'pandiya','Rajan',' K',CONCAT(firstName, MiddleName, lastName),CONCAT(firstName, MiddleName,'Itech@gmail.com'),'B.tech','805675435',DATE_FORMAT (19930808, '%d/%m/%Y'),'MALE','PATHIMA COLLEGE','ALAMARAM STOP',625532,'MADURAI','TAMIL NADU','php','TRAINEE','30/12/2022  10:00:00 AM','30000', CONCAT(Salary*12/100000,IF(Salary*12>100000,' LPA',' KPA')) )" ;        
											    
				        stmt.executeUpdate(sql6);
		                System.out.println("RECORD-3 INSERTED SUCESSFULLY");						    	
		                
		                
		                
		                // Query is used to Insert data in Table
		                String sql7 = " INSERT INTO Employee VALUES (UUID(),'Dhileep','kumar',' C',CONCAT(firstName, MiddleName, lastName),CONCAT(firstName, MiddleName,'Itech@gmail.com'),'MCA','8056654989',DATE_FORMAT (19930315, '%d/%m/%Y'),'MALE','ALANGANALOOR','VADIPATTI',625532,'MADURAI','TAMIL NADU','JAVA','TRAINEE','25/12/2022  10:00:00 AM','8000', CONCAT(Salary*12/100000,IF(Salary*12>100000,' LPA',' KPA')) )" ;        
		                
		                stmt.executeUpdate(sql7);
		                System.out.println("RECORD-4 INSERTED SUCESSFULLY");						    	
		                
		                
		                // Query is used to Insert data in Table
		                String sql8 = " INSERT INTO Employee VALUES (UUID(),'veera','senthoor',' vasan',CONCAT(firstName, MiddleName, lastName),CONCAT(firstName, MiddleName,'Itech@gmail.com'),'B.E MECH','8056634233',DATE_FORMAT (19930122, '%d/%m/%Y'),'MALE','T.KALLUPATTI','THIRUMANGALAM',625532,'MADURAI','TAMIL NADU','NoDE JS','TRAINEE','03/01/2023  10:00:00 AM','8000', CONCAT(Salary*12/100000,IF(Salary*12>100000,' LPA',' KPA')) )" ;        
		                
		                stmt.executeUpdate(sql8);
		                System.out.println("RECORD-5 INSERTED SUCESSFULLY");						    	
										                               
					        
				    
					

					con.close();
				  }catch (SQLException e){
					  e.printStackTrace();
				  }
			}
			  
			  
			}




