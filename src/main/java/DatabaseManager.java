import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3309/BaseDatosEmpresa?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USER = "root"; // tu usuario de MySQL
    private static final String PASSWORD = "1234"; // tu contraseña de MySQL

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
