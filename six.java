/*Creation of a TABLE IN MYSQL */
import java.sql.*;

public class six {
    public static void main(String [] args)throws Exception{
        String url="jdbc:mysql://localhost:3306/ALIENS";
        String username="root";
        String password="yoyobmc12";
        String query="CREATE TABLE STUDENTS"+
                "(first varchar(25)  not NULL,"+
                " last varchar(25)  not NULL," +
                " age INTEGER not NULL,"+
                " id INTEGER not NULL,"+
                " PRIMARY KEY (id))";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement();
        statement.executeUpdate(query);
        System.out.println("TABLE created successfully");
        statement.close();
        connection.close();
    }
}
