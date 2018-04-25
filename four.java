/*Deleting a record */

import java.sql.*;

public class four {
    public static void main(String [] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/EMP";
        String user="root";
        String pass="yoyobmc12";
        String query="delete from employees where id = ?";
        Connection connection=DriverManager.getConnection(url,user,pass);
        PreparedStatement statement=connection.prepareStatement(query);
        statement.setInt(1,0);
        statement.executeUpdate();
        System.out.println("DELETION DONE");
        statement.close();
        connection.close();
    }
}
