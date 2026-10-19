import java.util.Arrays;

public class Problem2Playlist {
    static class Playlist {
        private final String[] songs;
        private int songCount;

        public Playlist(int capacity) {
            if (capacity < 0) {
                throw new IllegalArgumentException("Capacity cannot be negative.");
            }
            songs = new String[capacity];
            songCount = 0;
        }

        public boolean addSong(String title) {
            if (title == null || songCount >= songs.length) {
                return false;
            }
            songs[songCount++] = title;
            return true;
        }

        public String[] getSongs() {
            return Arrays.copyOf(songs, songCount);
        }

        public int getSongCount() {
            return songCount;
        }
    }

    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        System.out.println("Songs: " + Arrays.toString(copy));
        copy[0] = "Hacked";
        System.out.println("Returned copy changed: " + Arrays.toString(copy));
        System.out.println("Actual playlist: " + Arrays.toString(p.getSongs()));
        System.out.println("Song count: " + p.getSongCount());
    }
}
