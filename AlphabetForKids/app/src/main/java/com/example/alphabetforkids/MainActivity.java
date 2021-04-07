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

    public void Movep(View view) {
        Intent intent=new Intent(this,p_activity.class);
        startActivity(intent);
    }

    public void Moveg(View view) {
        Intent intent=new Intent(this,g_activity.class);
        startActivity(intent);
    }
    public void Moveh(View view) {
        Intent intent=new Intent(this,h_activity.class);
        startActivity(intent);
    }
    public void Movei(View view) {
        Intent intent=new Intent(this,i_activity.class);
        startActivity(intent);
    }
    public void Movej(View view) {
        Intent intent=new Intent(this,j_activity.class);
        startActivity(intent);
    }
    public void Movek(View view) {
        Intent intent=new Intent(this,k_activity.class);
        startActivity(intent);
    }
    public void Movel(View view) {
        Intent intent=new Intent(this,l_activity.class);
        startActivity(intent);
    }
    public void Movem(View view) {
        Intent intent=new Intent(this,m_activity.class);
        startActivity(intent);
    }
    public void Moven(View view) {
        Intent intent=new Intent(this,n_activity.class);
        startActivity(intent);
    }
    public void Moveo(View view) {
        Intent intent=new Intent(this,o_activity.class);
        startActivity(intent);
    }
    public void Moveq(View view) {
        Intent intent=new Intent(this,q_activity.class);
        startActivity(intent);
    }
    public void Mover(View view) {
        Intent intent=new Intent(this,r_activity.class);
        startActivity(intent);
    }
    public void Moves(View view) {
        Intent intent=new Intent(this,s_activity.class);
        startActivity(intent);
    }
    public void Movet(View view) {
        Intent intent=new Intent(this,t_activity.class);
        startActivity(intent);
    }
    public void Moveu(View view) {
        Intent intent=new Intent(this,u_activity.class);
        startActivity(intent);
    }
    public void Movev(View view) {
        Intent intent=new Intent(this,v_activity.class);
        startActivity(intent);
    }
    public void Movew(View view) {
        Intent intent=new Intent(this,w_activity.class);
        startActivity(intent);
    }
    public void Movex(View view) {
        Intent intent=new Intent(this,x_activity.class);
        startActivity(intent);
    }
    public void Movey(View view) {
        Intent intent=new Intent(this,y_activity.class);
        startActivity(intent);
    }
    public void Movez(View view) {
        Intent intent=new Intent(this,z_activity.class);
        startActivity(intent);

    }
    public void Movee(View view) {
        Intent intent=new Intent(this,e_activity.class);
        startActivity(intent);
    }
    public void Movef(View view) {
        Intent intent=new Intent(this,f_activity.class);
        startActivity(intent);
    }
}
