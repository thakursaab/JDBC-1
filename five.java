/*Creation of a DATABASE IN MYSQL */
import java.sql.*;

public class five {
    public static void main(String [] args)throws Exception{
        String url="jdbc:mysql://localhost/";
        String username="root";
        String password="yoyobmc12";
        String query="CREATE DATABASE ALIENS";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement();
        statement.executeUpdate(query);
        System.out.println("Database created successfully");
        statement.close();
        connection.close();
    }
}
