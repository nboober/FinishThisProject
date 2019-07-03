package project;

public class Song {

    private String artist = "";
    private String title = "";

    public Song(){

    }

    public Song(String artist, String title){
        this.artist = artist;
        this.title = title;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getArtist(){
        return this.artist;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public String display(){
        return getArtist() + " : " + getTitle();
    }

}
