package com.example.alphabetforkids;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    TextView textView;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void Movea(View view) {
        Intent intent=new Intent(this,ActivityA.class);
        startActivity(intent);
    }

    public void Moveb(View view) {
        Intent intent=new Intent(this,b_activity.class);
        startActivity(intent);
    }

    public void Movec(View view) {
        Intent intent=new Intent(this,c_activity.class);
        startActivity(intent);
    }

    public void Moved(View view) {
        Intent intent=new Intent(this,d_activity.class);
        startActivity(intent);
    }
}
