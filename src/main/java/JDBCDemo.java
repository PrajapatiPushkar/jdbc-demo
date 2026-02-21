import java.sql.*;

public class JDBCDemo {

    private static final String URL = "jdbc:mysql://localhost:3306/spring_fist";

    private static final String USER = "root";

    private static final String PASSWORD = "Password";


    public static void main(String[] args) throws SQLException {

        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD)){
            System.out.println("Connected to the Database");
            insertStudent(con,"Alice", "Alice@gmail.com");
            updateStudent(con, 1, "john", "jhon@gmail.com");
            selectStudent(con);
            deleteStudent(con,1);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void insertStudent(Connection con, String name, String email) {
        String sql = "INSERT INTO student (name, email) VALUES (' " + name + " ', ' " + email + " ' )";
        try (Statement stmt = con.createStatement()) {
            int rows = stmt.executeUpdate(sql);
            System.out.println("INSERTED: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void selectStudent(Connection con){
        String sql = "SELECT * FROM student";
        try (Statement stmt = con.createStatement()) {
            ResultSet resultSet =  stmt.executeQuery(sql);
            System.out.println("Student list: ");
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println(id + " | " + name + " | " + email + " | ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateStudent(Connection con, int id, String name, String email){
        String sql = "UPDATE student SET name = '" + name + "', email = '" + email + "' WHERE id =" + id ;
//        UPDATE student SET name = 'Alice', email = 'alice@gmail.com'
//        WHERE id = 10;
        try (Statement stmt = con.createStatement()) {
            int rows = stmt.executeUpdate(sql);
            System.out.println("UPDATED: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteStudent(Connection con, int id){
        String sql = "DELETE FROM student WHERE id =" + id;
        try (Statement stmt = con.createStatement()) {
            int rows = stmt.executeUpdate(sql);
            System.out.println("DELETED: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
