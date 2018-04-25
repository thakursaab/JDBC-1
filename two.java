/*Insert QUERY*/

import java.sql.*;
public class two {
    public static void main(String [] args)throws Exception{
        String url="jdbc:mysql://localhost:3306/EMP";
        String user="root";
        String pass="yoyobmc12";
        int id=105;
        int age=20;
        String name="MAX";
        String last="MARTIN";
        String query="insert into employees values ("+id+","+age+",'"+name+"','"+last+"')";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection(url,user,pass);
        Statement statement=connection.createStatement();
        int count=statement.executeUpdate(query);
        System.out.println(count+" are the number of rows affected");
        statement.close();
        connection.close();
    }
}
