package com.example.alphabetforkids;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
    MediaPlayer ourSong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (Button) findViewById(R.id.btna);
       /* b=(Button)findViewById(R.id.b);
        c=(Button)findViewById(R.id.c);
        d=(Button)findViewById(R.id.d);
        e=(Button)findViewById(R.id.e);
        f=(Button)findViewById(R.id.f);
        g=(Button)findViewById(R.id.g);
        h=(Button)findViewById(R.id.h);
        i=(Button)findViewById(R.id.i);
        j=(Button)findViewById(R.id.j);
        k=(Button)findViewById(R.id.k);
        l=(Button)findViewById(R.id.l);
        m=(Button)findViewById(R.id.m);
        n=(Button)findViewById(R.id.n);
        o=(Button)findViewById(R.id.o);
        p=(Button)findViewById(R.id.p);
        q=(Button)findViewById(R.id.q);
        r=(Button)findViewById(R.id.r);
        s=(Button)findViewById(R.id.s);
        t=(Button)findViewById(R.id.t);
        u=(Button)findViewById(R.id.u);
        v=(Button)findViewById(R.id.v);
        w=(Button)findViewById(R.id.w);
        x=(Button)findViewById(R.id.x);
        y=(Button)findViewById(R.id.y);
        z=(Button)findViewById(R.id.z);*/
        a.setOnClickListener(this);
       /* b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);*/
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater factory;
        View view;
        ImageView image;
        switch (v.getId()) {

            case R.id.btna:
                MyActivity.setContentView(R.layout.a);

                /*ourSong = MediaPlayer.create(this, R.raw.a);

                builder.setTitle("A");
                factory = LayoutInflater.from(MainActivity.this);
                view = factory.inflate(R.layout.a, null);
                image = (ImageView) view.findViewById(R.id.ai);
                image.setImageResource(R.drawable.a);
                builder.setView(view);
                builder.setNeutralButton("BACK", null);
                builder.show();*/
                break;

        }
    }
}