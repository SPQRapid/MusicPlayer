package com.example.android.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Finding the button Play
        Button play = (Button) findViewById(R.id.play_music);

        mediaPlayer = MediaPlayer.create(this, R.raw.the_only_place);

        // Creating a click listener
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creating a intent
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Toast.makeText(MainActivity.this, "Just Getting Started", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        // Finding the button Play
        final Button pause = (Button) findViewById(R.id.pause_music);

        mediaPlayer = MediaPlayer.create(this, R.raw.the_only_place);

        // Creating a click listener
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creating a intent
                mediaPlayer.pause();
                ;
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("MainActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MainActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("MainActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("MainActivity", "onDestroy");
    }
}




