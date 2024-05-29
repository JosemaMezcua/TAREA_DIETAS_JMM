import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = DatabaseManager.connect();

        if (conn != null) {
            DietasDAO dietasDAO = new DietasDAO(conn);
            dietasDAO.createTable();
            dietasDAO.insertDietas();
            System.out.println("Dietas de empleados de Informática mayores de 30 €:");
            dietasDAO.consultarDietasInformatica();
            dietasDAO.incrementarDietasVentas();
        }
    }
}
