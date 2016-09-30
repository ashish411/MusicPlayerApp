package com.example.ashis.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Tiles extends AppCompatActivity {

    Button buttonNowPlaying,buttonSongs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiles);
        buttonNowPlaying=(Button) findViewById(R.id.buttonNowPlaying);
        buttonSongs=(Button) findViewById(R.id.buttonSongs);

        buttonNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),NowPlaying.class);
                Toast.makeText(getApplicationContext(),"Now Playing Activity opened",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        buttonSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Songs.class);
                Toast.makeText(getApplicationContext(),"Song Activity opened",Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

    }


}
