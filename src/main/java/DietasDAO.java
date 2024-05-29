import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DietasDAO {
    private Connection conn;

    public DietasDAO(Connection conn) {
        this.conn = conn;
    }

    public void createTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Dietas ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "empleado VARCHAR(255), "
                + "departamento VARCHAR(255), "
                + "cantidad DOUBLE, "
                + "concepto VARCHAR(255)"
                + ")";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(createTableSQL);
            System.out.println("Tabla 'Dietas' creada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertDietas() {
        String insertSQL = "INSERT INTO Dietas (empleado, departamento, cantidad, concepto) VALUES "
                + "('Juan Pérez', 'Informática', 45.0, 'Viaje a cliente'), "
                + "('Ana Gómez', 'Ventas', 30.0, 'Comida con cliente'), "
                + "('Luis Martínez', 'Recursos Humanos', 25.0, 'Reunión externa'), "
                + "('Marta Sánchez', 'Informática', 35.0, 'Curso de formación'), "
                + "('Pedro López', 'Ventas', 50.0, 'Evento de ventas'), "
                + "('Laura García', 'Recursos Humanos', 20.0, 'Desayuno con candidato'), "
                + "('Carlos Fernández', 'Informática', 60.0, 'Conferencia'), "
                + "('Elena Ruiz', 'Ventas', 40.0, 'Presentación de producto'), "
                + "('José Díaz', 'Informática', 55.0, 'Reunión con proveedor'), "
                + "('Raquel Jiménez', 'Ventas', 45.0, 'Cena con cliente')";

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(insertSQL);
            System.out.println("Registros insertados exitosamente en la tabla 'Dietas'.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void consultarDietasInformatica() {
        String querySQL = "SELECT * FROM Dietas WHERE departamento = 'Informática' AND cantidad > 30";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(querySQL)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Empleado: " + rs.getString("empleado") +
                        ", Departamento: " + rs.getString("departamento") +
                        ", Cantidad: " + rs.getDouble("cantidad") +
                        ", Concepto: " + rs.getString("concepto"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void incrementarDietasVentas() {
        String updateSQL = "UPDATE Dietas SET cantidad = cantidad * 1.10 WHERE departamento = 'Ventas'";
        try (Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(updateSQL);
            System.out.println("Dietas del departamento de Ventas incrementadas en un 10%. Filas afectadas: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
