package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by paulcristofari on 26/05/2018.
 */

public class SearchActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        hideActionBar();

        /*
        TextView searchButton = (TextView) findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                search();
            }
        });
*/

    }


    public void hideActionBar() {  // Hides the action bar
        getSupportActionBar().hide();
    }


    public void search(View view) {
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


        EditText nameEditText = (EditText) findViewById(R.id.search);
        String search = nameEditText.getText().toString();
        Log.i("SearchActivity.java", search);


        ArrayList<Songs> items = new ArrayList<Songs>();

        for(int i=0; i<songs.size(); i++){
            Songs item= songs.get(i);
            if(item.getArtistName().toLowerCase().contains(search.toLowerCase()) || item.getSongName().toLowerCase().contains(search.toLowerCase())){
                items.add(songs.get(i));
            }
        }
        if(items.isEmpty()){
            Toast toast = Toast.makeText(SearchActivity.this, "No result for your search!",
                    Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER,0,-500);
            toast.show();

        }

        SongsAdapter SongsAdapter = new SongsAdapter(this, items);
        ListView searchListView = (ListView) findViewById(R.id.list_search);
        searchListView.setAdapter(SongsAdapter);


        final ArrayList<Songs> songsBundle = items;
        searchListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Songs song = songsBundle.get(i);
                playSong(song);
            }
        });


    }


    public void playSong(Songs song){
        Intent nowplayingIntent = new Intent(SearchActivity.this, NowPlayingActivity.class);
        nowplayingIntent.putExtra("artistName", String.valueOf(song.getArtistName()));
        nowplayingIntent.putExtra("songName", String.valueOf(song.getSongName()));
        startActivity(nowplayingIntent);
    }





}
