package com.example.android.mymusicapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by paulcristofari on 26/05/2018.
 */

public class AllSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allsongs);
        displaySongs();

        Button search = (Button) findViewById(R.id.search_activity_button);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent search = new Intent(AllSongsActivity.this, SearchActivity.class);
                startActivity(search);
            }
        });

        final Button nowPlaying = (Button) findViewById(R.id.now_playing_button);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlaying = new Intent(AllSongsActivity.this, NowPlayingActivity.class);
                nowPlaying.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(nowPlaying);
            }
        });
    }

    public void displaySongs() {
        ArrayList<Songs> songs = new ArrayList<Songs>();

        songs.add(new Songs("Artist 1", "Song 1"));
        songs.add(new Songs("Artist 2", "Song 2"));
        songs.add(new Songs("Artist 3", "Song 3"));
        songs.add(new Songs("Artist 4", "Song 4"));
        songs.add(new Songs("Artist 5", "Song 5"));
        songs.add(new Songs("Artist 6", "Song 6"));
        songs.add(new Songs("Artist 7", "Song 7"));
        songs.add(new Songs("Artist 8", "Song 8"));
        songs.add(new Songs("Artist 9", "Song 9"));
        songs.add(new Songs("Artist 11", "Song 11"));
        songs.add(new Songs("Artist 12", "Song 12"));
        songs.add(new Songs("Artist 13", "Song 13"));
        songs.add(new Songs("Artist 14", "Song 14"));
        songs.add(new Songs("Artist 15", "Song 15"));
        songs.add(new Songs("Artist 16", "Song 16"));


        SongsAdapter itemsAdapter = new SongsAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


        final ArrayList<Songs> songsBundle = songs;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Songs song = songsBundle.get(i);
                playSong(song);
            }
        });
    }

    public void playSong(Songs song) {
        Intent nowplayingIntent = new Intent(AllSongsActivity.this, NowPlayingActivity.class);
        nowplayingIntent.putExtra("artistName", String.valueOf(song.getArtistName()));
        nowplayingIntent.putExtra("songName", String.valueOf(song.getSongName()));
        startActivity(nowplayingIntent);
    }
}
