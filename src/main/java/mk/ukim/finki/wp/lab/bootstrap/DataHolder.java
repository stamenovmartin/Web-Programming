package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Artist> artistList = new ArrayList<>();
    public static List<Song> songList = new ArrayList<>();

    @PostConstruct
    public void init() {
        artistList.add(new Artist(1L, "Toshe", "Proeski", "Macedonian singer and songwriter"));
        artistList.add(new Artist(2L, "David", "Guetta", "French DJ and record producer"));
        artistList.add(new Artist(3L, "Alan", "Walker", "Norwegian DJ and music producer"));
        artistList.add(new Artist(4L, "Michael", "Jackson", "American singer, songwriter, dancer, and philanthropist"));
        artistList.add(new Artist(5L, "Dzordze", "Balasevic ", "Serbian singer and songwriter, writer, poet and director."));

        songList.add(new Song("Song1", "Fading", "Techno", 2024));
        songList.add(new Song("Song2", "Hard", "House", 2022));
        songList.add(new Song("Song3", "Beyond", "Electronic", 2005));
        songList.add(new Song("Song4", "Roller coaster", "Jazz", 2003));
        songList.add(new Song("Song5", "Hardest Thing", "Pop", 2010));
    }
}
