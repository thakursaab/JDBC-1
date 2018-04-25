/*Running a SELECT QUERY */

import java.sql.*;

public class one{
    public static void main(String [] args)throws Exception{
        String url="jdbc:mysql://localhost:3306/EMP";
        String username="root";
        String password="yoyobmc12";
        String query="Select * from employees";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(query);

        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+" "+resultSet.getInt(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
        }

        statement.close();
        connection.close();
    }
}