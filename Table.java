import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static void createNewTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/SSSIT.db";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS addresses (\n"
                + " user id integer PRIMARY KEY,\n"
                + " type text NOT NULL,\n"
                + " line 1 varchar NOT NULL,\n"
                + " line 2 varchar NOT NULL,\n"
                + " city varchar NOT NULL,\n"
                + "province varchar NOT NULL,\n"
                + "postcode varchar NOT NULL,\n"
                + ");";

        String sql = "CREATE TABLE IF NOT EXISTS users (\n"
                + " user id integer PRIMARY KEY,\n"
                + " first name varchar NOT NULL,\n"
                + " last name varchar NOT NULL,\n"
                + " email varchar NOT NULL,\n"
                + " phone number varchar NOT NULL,\n"
                + " type text NOT NULL,\n"
                + ");";

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createNewTable();
    }

}