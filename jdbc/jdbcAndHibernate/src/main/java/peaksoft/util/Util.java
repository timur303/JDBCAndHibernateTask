package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    private static final String url= "jdbc:postgresql://localhost:5432/user1";
    private static final String user= "postgres";
    private static final String password= "3019";

    public static Connection connection(){
    Connection connect = null;
    try{
        connect = DriverManager.getConnection(url,user,password);
        System.out.println("Connection on postgres");
    }catch (SQLException e){
        System.out.println(e.getMessage());
    }
    return connect;
    }

}
