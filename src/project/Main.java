package project;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Song> songs = new ArrayList<Song>();
        for (int i = 0; i< 10;i++){
            System.out.println("Enter an artists name: ");
            String artist = scanner.nextLine();
            System.out.println("Enter the Title of a song by the artist you just entered: ");
            String title = scanner.nextLine();
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song s: songs){
            System.out.println(s.display());
        }

        //look for blue and print if found
        System.out.println("Type the title of the song you would like to find: ");
        String titleToFind = scanner.nextLine();
        for (Song s: songs){
            if (s.getTitle().equals(titleToFind)){
                System.out.printf("I found %s \r\n",s.display());
            }
        }
    }
}
