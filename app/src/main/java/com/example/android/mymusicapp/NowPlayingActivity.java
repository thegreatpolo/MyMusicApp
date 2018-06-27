package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by paulcristofari on 26/05/2018.
 */

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowplaying);
        hideActionBar();

        Intent intent = getIntent();
        TextView artistName = (TextView) findViewById(R.id.artist_name_nowplaying);
        TextView songName = (TextView) findViewById(R.id.song_name_nowplaying);
        artistName.setText(intent.getStringExtra("artistName"));
        songName.setText(intent.getStringExtra("songName"));
    }

    public void hideActionBar() {  // Hides the action bar
        getSupportActionBar().hide();
    }
}
