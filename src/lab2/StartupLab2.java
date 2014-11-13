/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import common.Song;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author dbarter1
 */
public class StartupLab2{
    public static void main(String[] args) {
        Song song1 = new Song("Pink Floyd", "Dark Side of the Moon", "Brain Damage", "001");
        Song song2 = new Song("Led Zeppelin", "Houses of the Holy", "No Quarter", "002");
        Song song3 = new Song("The Beatles", "The White Album", "Rocky Raccoon", "003");
        Song song4 = new Song("Queen", "A Night at the Opera", "Bohemian Rhapsody", "004");

        Map<String, Song> songMap = new HashMap<>();

        songMap.put(song1.getSongID(), song1);
        songMap.put(song2.getSongID(), song2);
        songMap.put(song3.getSongID(), song3);
        songMap.put(song4.getSongID(), song4);
        
        //In a Hashmap the order is not maintained:
        System.out.println("Songs from HashMap: ");
        for (String key : songMap.keySet()){
            Song songFound = songMap.get(key);
            System.out.println("\t" + songFound);
        }
        
        //Changing the Hashmap to a linked hash map to maintain order
        songMap = new LinkedHashMap<>(songMap);
        
        System.out.println("");
        System.out.println("Songs from LinkedHashMap:");
        for (String key : songMap.keySet()){
            Song songFound = songMap.get(key);
            System.out.println("\t" + songFound);
        }
    }
    
            
}
