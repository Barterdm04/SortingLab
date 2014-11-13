/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;

import common.Song;
import common.SongBySongID;
import common.SongBySongTitle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author dbarter1
 */
public class StartupLab6{
    public static void main(String[] args) {
        Song song1 = new Song("Pink Floyd", "Dark Side of the Moon", "Brain Damage", "001");
        Song song2 = new Song("Led Zeppelin", "Houses of the Holy", "No Quarter", "002");
        Song song3 = new Song("The Beatles", "The White Album", "Rocky Raccoon", "003");
        Song song4 = new Song("Queen", "A Night at the Opera", "Bohemian Rhapsody", "004");

        List<Song> songList = new ArrayList<>();
        
        songList.add(song1);
        songList.add(song2);
        songList.add(song3);
        songList.add(song4);

        
        //In a Hashmap the order is not maintained:
        System.out.println("Songs from SongList: ");
        for (Song song : songList){
            System.out.println("\t" + song);
        }
        Collections.sort(songList, new SongBySongID());
        System.out.println("");
        System.out.println("Songs from Songlist after Collections.sort() (SongID) :");
        for (Song song : songList){
            System.out.println("\t" + song);
        }
        
        Collections.sort(songList, new SongBySongTitle());
        System.out.println("");
        System.out.println("Songs from Songlist after Collections.sort() (Song Title) :");
        for (Song song : songList){
            System.out.println("\t" + song);
        }
        
        Collections.sort(songList);
        System.out.println("");
        System.out.println("Songs from Songlist after Collections.sort() (Artist) :");
        for (Song song : songList){
            System.out.println("\t" + song);
        }
        
    }
    
            
}
