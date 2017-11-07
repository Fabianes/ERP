
// Adapted from http://www.vogella.com/tutorials/MySQLJava/article.html
public class Main {
	  public static void main(String[] args) throws Exception {
		  RemuneracionesAccess db = new RemuneracionesAccess();
		  db.connectToDB();
		  db.readDataBase();
		  db.close();
	  }

}
