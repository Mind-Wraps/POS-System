package lk.mindwraps.pos.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Sanjaya Sandakelum <sandakelumsanjaya@gmail.com> (CREATIVE-2)
 * @since 2021-10-09
 */
public class DBConnection {

    private static DBConnection dbConnection;
    private Connection connection=null;
    private DBConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.
                getConnection("jdbc:mysql://127.0.0.1:3306/pos",
                        "root","1234");
    }

    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
        return (null==dbConnection)?
                (dbConnection= new DBConnection()):(dbConnection);
    }

    public Connection getConnection(){return connection;}

}
