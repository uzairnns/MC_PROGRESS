package com.example.alphabetforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class i_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i);
    }
    public void Playi(View view) {
        MediaPlayer ourSong;
        ourSong= MediaPlayer.create(this,R.raw.i);
        ourSong.start();
    }
}