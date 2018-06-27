package com.example.android.mymusicapp;

/**
 * Created by paulcristofari on 26/05/2018.
 */

public class Songs {
    private String mArtistName;
    private String mSongName;

    public Songs(String artistName, String songName) {
        mArtistName = artistName;
        mSongName = songName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getSongName() {
        return mSongName;
    }
}
