/*Insert using PreparedStatement */

import java.sql.*;

public class three {
    public static void main(String [] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/EMP";
        String user="root";
        String pass="yoyobmc12";
        String query="insert into employees values (?,?,?,?)";
        Connection connection=DriverManager.getConnection(url,user,pass);
        int id=1000;
        int age=40;
        String first="sajal";
        String last="brijwasi";
        PreparedStatement statement=connection.prepareStatement(query);
        statement.setInt(1,id);
        statement.setInt(2,age);
        statement.setString(3,first);
        statement.setString(4,last);
        int count=statement.executeUpdate();
        System.out.println(count +" rows got affected");
        statement.close();
        connection.close();
    }
}
