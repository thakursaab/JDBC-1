/*DELETION of a TABLE IN MYSQL */
import java.sql.*;

public class seven {
    public static void main(String [] args)throws Exception{
        String url="jdbc:mysql://localhost:3306/ALIENS";
        String username="root";
        String password="yoyobmc12";
        String query="DROP TABLE STUDENTS";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement();
        statement.executeUpdate(query);
        System.out.println("TABLE DROPPED successfully");
        statement.close();
        connection.close();
    }
}
