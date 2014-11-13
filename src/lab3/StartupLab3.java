/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

import common.Song;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author dbarter1
 */
public class StartupLab3{
    public static void main(String[] args) {
        Song song1 = new Song("Pink Floyd", "Dark Side of the Moon", "Brain Damage", "001");
        Song song2 = new Song("Led Zeppelin", "Houses of the Holy", "No Quarter", "002");
        Song song3 = new Song("The Beatles", "The White Album", "Rocky Raccoon", "003");
        Song song4 = new Song("Queen", "A Night at the Opera", "Bohemian Rhapsody", "004");

        Map<String, Song> songMap = new TreeMap<>();
        
        songMap.put(song3.getSongID(), song3);
        songMap.put(song4.getSongID(), song4);
        songMap.put(song1.getSongID(), song1);
        songMap.put(song2.getSongID(), song2);

        
        //In a Hashmap the order is not maintained:
        System.out.println("Songs from TreeMap sorted by key (songID): ");
        for (String key : songMap.keySet()){
            Song songFound = songMap.get(key);
            System.out.println("\t" + songFound);
        }
        
        //Add the values of the tree map to a collection to be sorted
        Collection songMapValues = songMap.values();
        List<Song> sortableList = new ArrayList<>(songMapValues);
        
        Collections.sort(sortableList);
        System.out.println("");
        System.out.println("Songs from the sorted list created from the collection of the map values, sorted by Artist: ");
        for (Song song : sortableList){
            System.out.println("\t" + song);
        }
    }
    
            
}
