package com.example.stud.musicapp.database;


import java.util.Date;

import io.realm.RealmObject;

public class Favorite extends RealmObject {
    private String track ;
    private String artist ;
    private int trackId ;
    private Date date ;

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}