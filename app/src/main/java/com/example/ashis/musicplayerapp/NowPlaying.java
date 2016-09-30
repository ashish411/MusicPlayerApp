package com.example.ashis.musicplayerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        ImageButton imageButtonPlay = (ImageButton) findViewById(R.id.imageButtonPlay);
        ImageButton imageButtonPause = (ImageButton) findViewById(R.id.imageButtonPause);
        ImageButton imageButtonRewind = (ImageButton) findViewById(R.id.imageButtonRewind);
        ImageButton imageButtonForward = (ImageButton) findViewById(R.id.imageButtonForward);

        imageButtonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"play Button detected",Toast.LENGTH_SHORT).show();
            }
        });

        imageButtonPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"pause Button detected",Toast.LENGTH_SHORT).show();
            }
        });

        imageButtonForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"forward Button detected",Toast.LENGTH_SHORT).show();

            }
        });
        imageButtonRewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"rewind Button detected",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
