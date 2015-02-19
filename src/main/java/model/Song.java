package model;

public class Song {
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
<<<<<<< HEAD
	public String toString() {
		return "id : "+ id+" tit : "+title+" ar :"+artist;
	}
=======
>>>>>>> 6eaf0bef825957a570b12058873cd6dfa24b902a
	String title;
	String artist;
	int id;
}
