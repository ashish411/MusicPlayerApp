package com.example.ashis.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Artist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        Button buttonNowPlaying = (Button)findViewById(R.id.buttonNowPlaying2);
        Button buttonAlbum = (Button) findViewById(R.id.buttonAlbum);
        buttonNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),NowPlaying.class);
                Toast.makeText(getApplicationContext(),"Now Playing Activity opened",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        buttonAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Album.class);
                Toast.makeText(getApplicationContext(),"Album Activity opened",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
