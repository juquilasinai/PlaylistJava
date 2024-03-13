
package com.mycompany.playlistjava;

public class Musicas {
    String title;
    String album;
    String date;
    int time;
    
    public Musicas(String title, String album, String date, int time) {
        this.title=title;
        this.album=album;
        this.date=date;
        this.time=time;
    }
    
    public void ShowPlaylist(){
        System.out.println("Title: " + title);
        System.out.println("Album: " + album);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
    }
}