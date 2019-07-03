package project;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String cont = "";
        boolean confirm = false;

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
        do {
            System.out.println("Type the title of the song you would like to find: ");
            String titleToFind = scanner.nextLine();
            for (Song s : songs) {
                if (s.getTitle().contains(titleToFind)) {
                    System.out.printf("I found %s \r\n", s.display());
                    confirm = true;
                }
            }

            if(!confirm){
                System.out.println("Unfortunately that song title is not in your list. Would you like to try again?");
            }else{
                System.out.println("Would you like to search for a different title? (yes|no)");
            }
            confirm = false;
            cont = scanner.nextLine();
        }while(!cont.equalsIgnoreCase("no"));
    }
}
