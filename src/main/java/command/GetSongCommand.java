package command;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Song;
import connectionprovider.ConnectionProvider;

public class GetSongCommand {

	public Song execute(int id) {
		Song s = new Song();
		try {
			Connection connection = ConnectionProvider.getConnection();
<<<<<<< HEAD
			//Statement stmt = connection.createStatement();
=======
			// Statement stmt = connection.createStatement();
>>>>>>> 6eaf0bef825957a570b12058873cd6dfa24b902a
			PreparedStatement stmt = connection
					.prepareStatement("SELECT * FROM Songs WHERE id = ?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				s.setArtist(rs.getString("artist"));
				s.setTitle(rs.getString("title"));
				s.setId(rs.getInt("id"));
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s;
	}
<<<<<<< HEAD
	/*public static void main(String[] args) {
		GetSongCommand c = new GetSongCommand();
		Song j = c.execute(8);
		System.out.println(j);
	}*/
=======

>>>>>>> 6eaf0bef825957a570b12058873cd6dfa24b902a
}
