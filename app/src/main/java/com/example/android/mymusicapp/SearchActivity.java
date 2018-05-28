package com.example.android.mymusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;

/**
 * Created by paulcristofari on 26/05/2018.
 */

public class SearchActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        hideActionBar();
    }


    public void hideActionBar() {  // Hides the action bar
        getSupportActionBar().hide();
    }


    public void search() {
        EditText nameEditText = (EditText) findViewById(R.id.search);
        String search = nameEditText.getText().toString();
        Log.i("MainActivity.java", search);
    }





}
