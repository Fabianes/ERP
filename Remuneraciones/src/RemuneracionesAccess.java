import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class RemuneracionesAccess {
	 private Connection connect = null;
	  private Statement statement = null;
	  private PreparedStatement preparedStatement = null;
	  private ResultSet resultSet = null;

	  final private String host = "localhost";
	  final private String user = "root";
	  final private String passwd = "";
	  final private String database = "sistemaremuneraciones";
	  
	  public void connectToDB() throws Exception {
          try {
        	  Class.forName("com.mysql.jdbc.Driver");
              connect = DriverManager.getConnection("jdbc:mysql://" + host + "/"+ database + "?" + "user=" + user + "&password=" + passwd);
          } catch (Exception e) {
                  throw e;
          }
	  }

	  
	  public void readDataBase() throws Exception {
		  try {
		      // This will load the MySQL driver, each DB has its own driver
		      Class.forName("com.mysql.jdbc.Driver");
		      
		      // Setup the connection with the DB
		      connect = DriverManager
		          .getConnection("jdbc:mysql://" + host + "/sistemaremuneraciones?"
		              + "user=" + user + "&password=" + passwd );
	
		      // Statements allow to issue SQL queries to the database
		      statement = connect.createStatement();
		      // Result set get the result of the SQL query
		      resultSet = statement
		          .executeQuery("select * from sistemaremuneraciones.REM_Personal");
	
		      while(resultSet.next()) {
		          String nombre=resultSet.getString("nombre");
		          System.out.println(nombre);
		      }
	      
		  } catch (Exception e) {
			  throw e;
		  } finally {
		      close();
		  }

	  }

	  private void writeMetaData(ResultSet resultSet) throws SQLException {
	    //   Now get some metadata from the database
	    // Result set get the result of the SQL query
	    
	    System.out.println("The columns in the table are: ");
	    
	    System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
	    for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
	      System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
	    }
	  }

	  private void writeResultSet(ResultSet resultSet) throws SQLException {
	    // ResultSet is initially before the first data set
	    while (resultSet.next()) {
	      // It is possible to get the columns via name
	      // also possible to get the columns via the column number
	      // which starts at 1
	      // e.g. resultSet.getSTring(2);
	      String user = resultSet.getString("myuser");
	      String website = resultSet.getString("webpage");
	      String summary = resultSet.getString("summary");
	      Date date = resultSet.getDate("datum");
	      String comment = resultSet.getString("comments");
	      System.out.println("User: " + user);
	      System.out.println("Website: " + website);
	      System.out.println("Summary: " + summary);
	      System.out.println("Date: " + date);
	      System.out.println("Comment: " + comment);
	    }
	  }

	  // You need to close the resultSet
	  public void close() {
	    try {
	      if (resultSet != null) {
	        resultSet.close();
	      }

	      if (statement != null) {
	        statement.close();
	      }

	      if (connect != null) {
	        connect.close();
	      }
	    } catch (Exception e) {

	    }
	  }
}
