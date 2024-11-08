package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;

import java.util.List;

public interface SongService {
    public List<Song> listSongs();
    public Artist addArtistToSong(Artist artist, Song song);
    public Song findByTrackId(String trackId);
}