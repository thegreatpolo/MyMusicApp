package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by paulcristofari on 26/05/2018.
 */

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowplaying);

        String artist="artist";
        String song = "song";

        Intent intent = getIntent();
        if (intent.getExtras() != null) {

            artist = intent.getStringExtra("artistName");
            song = intent.getStringExtra("songName");
        }

        TextView artistName = (TextView) findViewById(R.id.artist_name_nowplaying);
        TextView songName = (TextView) findViewById(R.id.song_name_nowplaying);
        artistName.setText(artist);
        songName.setText(song);

        Button search = (Button) findViewById(R.id.search_activity_button);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent search = new Intent(NowPlayingActivity.this, SearchActivity.class);
                startActivity(search);
            }
        });

        final Button allSongs = (Button) findViewById(R.id.all_songs_button);
        allSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent allSongs = new Intent(NowPlayingActivity.this, AllSongsActivity.class);
                startActivity(allSongs);
            }
        });
    }


    protected void onStart(){
        super.onStart();
        Intent intent = getIntent();
        if (intent.getExtras() != null) {

            String artist = intent.getStringExtra("artistName");
            String song = intent.getStringExtra("songName");
            TextView artistName = (TextView) findViewById(R.id.artist_name_nowplaying);
            TextView songName = (TextView) findViewById(R.id.song_name_nowplaying);
            artistName.setText(artist);
            songName.setText(song);
        }



        Button search = (Button) findViewById(R.id.search_activity_button);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent search = new Intent(NowPlayingActivity.this, SearchActivity.class);
                startActivity(search);
            }
        });

        final Button allSongs = (Button) findViewById(R.id.all_songs_button);
        allSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent allSongs = new Intent(NowPlayingActivity.this, AllSongsActivity.class);
                startActivity(allSongs);
            }
        });
    }
}
