package TestVagrant;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class RecentlyPlayedStrore 
{
	
	 int capacity;
	 //int songList;
	 
	 Map<String,LinkedList<String>> songMap;
	 
	 public RecentlyPlayedStrore(int capacity)
	 {
		 this.capacity=capacity;
		 this.songMap = new HashMap<String, LinkedList<String>>();
		 
	 }
	  
	 public void addSong(String user, String song)
	 {
		 LinkedList<String>songList=songMap.get(user);
		 
		 if(songList== null)
		 {
			 songList = new LinkedList<String>();
			 songMap.put(user, songList);
		 }
		 
		 if(songList.contains(song)) 
		 {
		      songList.remove(song);	 
		 }
		 
		 songList.addFirst(song);
		 
		 
		 if(songList.size() > capacity)
		 {
			 songList.removeLast();
		 }
	 }
	 
	 public List<String> getRecentSongs(String user)
	 {
		 LinkedList<String>songList1 = songMap.get(user);
		 
		 if(songList1 == null)
		 {
			 return Collections.emptyList();
		 }
		 
		 return songList1;
	 }
	 

	    
	}


