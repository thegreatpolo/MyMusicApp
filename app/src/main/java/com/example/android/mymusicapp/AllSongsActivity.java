package com.example.android.mymusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by paulcristofari on 26/05/2018.
 */

public class AllSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allsongs);
        hideActionBar();
    }


    public void hideActionBar() {  // Hides the action bar
        getSupportActionBar().hide();



    ArrayList<Songs> songs = new ArrayList<Songs>();

    songs.add(new Songs("Artist 1","Song 1"));
    songs.add(new Songs("Artist 2","Song 2"));
        songs.add(new Songs("Artist 3","Song 3"));
        songs.add(new Songs("Artist 4","Song 4"));
        songs.add(new Songs("Artist 5","Song 5"));
        songs.add(new Songs("Artist 6","Song 6"));
        songs.add(new Songs("Artist 7","Song 7"));
        songs.add(new Songs("Artist 8","Song 8"));
        songs.add(new Songs("Artist 9","Song 9"));
        songs.add(new Songs("Artist 10","Song 10"));

        SongsAdapter itemsAdapter=new SongsAdapter(this,songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

}
}
