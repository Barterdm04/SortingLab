package common;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class Song implements Comparable {
    private String artist;
    private String album;
    private String name;
    private String songID;

    public Song(String artist, String album, String name, String songID) {
        this.artist = artist;
        this.album = album;
        this.name = name;
        this.songID = songID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.songID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.songID, other.songID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Song {" + "Artist = " + artist + ", Album = " + album + ", Name = " + name + ", Song ID = " + songID + '}';
    }
    
    @Override
    public int compareTo(Object other) {
        Song o = (Song)other;
        
        return new CompareToBuilder()
               .append(this.artist, o.artist)
               .toComparison();
    }
    
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSongID() {
        return songID;
    }

    public void setSongID(String songID) {
        this.songID = songID;
    }


    
    
}
