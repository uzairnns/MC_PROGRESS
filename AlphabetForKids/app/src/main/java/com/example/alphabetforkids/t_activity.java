package com.example.alphabetforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class t_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t);
    }
    public void Playt(View view) {
        MediaPlayer ourSong;
        ourSong= MediaPlayer.create(this,R.raw.t);
        ourSong.start();
    }
}