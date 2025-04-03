import java.sql.*;

public class MySQLConnection {
    public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/Unexpected";
                    String user = "root";
                            String password = "Pyrjj2rgo@a1";

                                    try (Connection conn = DriverManager.getConnection(url, user, password)) {
                                                System.out.println("Connected to MySQL successfully!");
                                                        } catch (SQLException e) {
                                                                    e.printStackTrace();
                                                                            }
                                                                                }
                                                                                }