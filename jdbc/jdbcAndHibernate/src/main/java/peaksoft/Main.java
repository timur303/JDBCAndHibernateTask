package peaksoft;

import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {


        // реализуйте алгоритм здесь

        UserDaoJdbcImpl userDaoJdbc = new UserDaoJdbcImpl();
        //createTable user1
//       userDaoJdbc.createUsersTable();

        //save User (INTO INSERT )
//        userDaoJdbc.saveUser("Timur","Kadyrbekov", (byte) 21);
//        userDaoJdbc.saveUser("Zukh", "Kamchybekov",(byte) 20);
//        userDaoJdbc.saveUser("Zarip","Kursanov",(byte) 20);
//        userDaoJdbc.saveUser("Atabek","Dosbaev",(byte) 20);

        //clean User
//        userDaoJdbc.cleanUsersTable();


        //callByIdRemove
//        userDaoJdbc.removeUserById(3);





//        userDaoJdbc.getAllUsers();
//        List<User> userDaoJdbcList = userDaoJdbc.getAllUsers();
//        System.out.println(userDaoJdbcList);

        //drop user1 table
//        userDaoJdbc.dropUsersTable();

    }
}
