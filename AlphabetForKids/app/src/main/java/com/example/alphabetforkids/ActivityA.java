package com.example.alphabetforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ActivityA extends AppCompatActivity {
    MediaPlayer ourSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a);
    }

    public void Playa(View view) {
        ourSong=MediaPlayer.create(this,R.raw.a);
        ourSong.start();
    }
}