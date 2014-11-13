/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

import java.util.Comparator;

/**
 *
 * @author dbarter1
 */
public class SongBySongID implements Comparator<Song>{
    @Override
    public int compare(Song s1, Song s2) {
        return s1.getSongID().compareTo(s2.getSongID());
    }
}
