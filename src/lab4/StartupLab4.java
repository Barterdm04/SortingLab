/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;

import common.Song;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author dbarter1
 */
public class StartupLab4{
    public static void main(String[] args) {
        Song song1 = new Song("Pink Floyd", "Dark Side of the Moon", "Brain Damage", "001");
        Song song2 = new Song("Led Zeppelin", "Houses of the Holy", "No Quarter", "002");
        Song song3 = new Song("The Beatles", "The White Album", "Rocky Raccoon", "003");
        Song song4 = new Song("Queen", "A Night at the Opera", "Bohemian Rhapsody", "004");

        Set<Song> songSet = new TreeSet<>();
        
        songSet.add(song1);
        songSet.add(song2);
        songSet.add(song3);
        songSet.add(song4);

        
        //In a Hashmap the order is not maintained:
        System.out.println("Songs from TreeSet sorted by compareTo method (Artist): ");
        for (Song song : songSet){
            System.out.println("\t" + song);
        }
        
    }
    
            
}
