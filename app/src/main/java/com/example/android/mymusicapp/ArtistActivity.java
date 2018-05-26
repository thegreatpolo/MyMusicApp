package com.example.android.mymusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by paulcristofari on 26/05/2018.
 */

public class ArtistActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowplaying);
        hideActionBar();
    }


    public void hideActionBar() {  // Hides the action bar
        getSupportActionBar().hide();
    }
}
