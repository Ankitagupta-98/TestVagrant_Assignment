package TestVagrant;

public class A 
{

	public static void main(String[] args) {
		
		RecentlyPlayedStrore store1 = new RecentlyPlayedStrore(3);

		store1.addSong("user1", "S1");
		store1.addSong("user1", "S2");
		store1.addSong("user1", "S3");
		System.out.println(store1.getRecentSongs("user1")); // [S3, S2, S1]

		store1.addSong("user1", "S4");
		System.out.println(store1.getRecentSongs("user1")); // [S4, S2, S3]

		store1.addSong("user1", "S2");
		System.out.println(store1.getRecentSongs("user1")); // [S2, S4, S3]

		store1.addSong("user1", "S1");
		System.out.println(store1.getRecentSongs("user1")); // [S1, S2, S4]

	}
}
