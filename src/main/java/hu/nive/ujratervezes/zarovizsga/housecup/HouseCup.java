package hu.nive.ujratervezes.zarovizsga.housecup;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class HouseCup {

    public DataSource dataSource;

    public HouseCup(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int getPointsOfHouse(String house) {
        int totalScore = 0;
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("select points_earned from house_points where house_name = ?");
        ) {
            stmt.setString(1, house);

            try (
                    ResultSet rs = stmt.executeQuery();
            ) {
                while (rs.next()) {
                    totalScore = totalScore + rs.getInt("points_earned");
                }
                return totalScore;
            }
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }
}
