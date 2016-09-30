package com.example.ashis.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Album extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        Button buttonNowPlaying=(Button) findViewById(R.id.buttonNowPlaying6);
        buttonNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),NowPlaying.class);
                Toast.makeText(getApplicationContext(),"Now Playing Activity opened",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
