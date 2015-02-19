package command;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Song;
import connectionprovider.ConnectionProvider;

public class DeleteSongCommand {
<<<<<<< HEAD
    public String execute(int id) {
=======
    public String execute(Song s) {
>>>>>>> 6eaf0bef825957a570b12058873cd6dfa24b902a
        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement stmt = connection
            .prepareStatement("DELETE From SONGS WHERE id=?");
<<<<<<< HEAD
            stmt.setInt(1, id);
            stmt.execute();
=======
            stmt.setInt(1, s.getId());
            
>>>>>>> 6eaf0bef825957a570b12058873cd6dfa24b902a
        } catch ( URISyntaxException e ) {
            e.printStackTrace();
        } catch ( SQLException e ) {
            e.printStackTrace();
        }
        return "-1";
    }
<<<<<<< HEAD
    /*public static void main(String[] args) {
    	DeleteSongCommand c = new DeleteSongCommand();
		c.execute(8);
		System.out.println("done");
	}*/
=======
>>>>>>> 6eaf0bef825957a570b12058873cd6dfa24b902a
}