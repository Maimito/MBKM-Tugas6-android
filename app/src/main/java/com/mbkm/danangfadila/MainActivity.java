package com.mbkm.danangfadila;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
        ImageView iv3 = (ImageView) findViewById(R.id.imageView3);

        String url = "https://instagram.fcgk27-1.fna.fbcdn.net/v/t51.2885-15/sh0.08/e35/s750x750/19437124_2322478961310481_3774024704008912896_n.jpg?_nc_ht=instagram.fcgk27-1.fna.fbcdn.net&_nc_cat=101&_nc_ohc=6m1ibUKgquAAX-zFVB_&edm=AP_V10EBAAAA&ccb=7-4&oh=2bcd86c7fc14fbbc97f377fdb87c7e54&oe=613ECD87&_nc_sid=4f375e";
        String url2 = "https://instagram.fcgk27-1.fna.fbcdn.net/v/t51.2885-15/sh0.08/e35/s640x640/241240022_413358067173278_6185134354631430184_n.jpg?_nc_ht=instagram.fcgk27-1.fna.fbcdn.net&_nc_cat=1&_nc_ohc=3jjwknHZ9OEAX8a5RlB&edm=AIQHJ4wBAAAA&ccb=7-4&oh=c0226a677eb4a2fc2a1b1d3cecb3fe51&oe=613EE62A&_nc_sid=7b02f1";

        Picasso.get().load(url).resize(500, 500).centerCrop().into(iv3);
        Picasso.get().load(url2).resize(500, 500).centerCrop().into(iv2);
    }
}