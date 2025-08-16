package database;

import java.sql.*;

public class DatabaseManager {
    // --- UPDATE these for your MySQL ---
    private static final String URL = "jdbc:mysql://localhost:3306/mood_db";
    private static final String USER = "root";           // your MySQL username
    private static final String PASSWORD = "12345678"; // your MySQL password
    // -----------------------------------

    @SuppressWarnings("CallToPrintStackTrace")
    public static String[] getMoodData(String mood) {
        String[] data = new String[2]; // [0] quote, [1] link
        String query = "SELECT quote, music_link FROM mood_data WHERE mood = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, mood);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    data[0] = rs.getString("quote");
                    data[1] = rs.getString("music_link");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error fetching data for mood: " + mood);
        }
        return data;
    }
}
