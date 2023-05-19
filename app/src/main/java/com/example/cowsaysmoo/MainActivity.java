package com.example.cowsaysmoo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView cat, chicken, cow, dog, duck,sheep;
    private MediaPlayer catSound, chickenSound, cowSound, dogSound, duckSound,sheepSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cat = (ImageView) findViewById(R.id.cat);
        chicken = (ImageView) findViewById(R.id.chicken);
        cow = (ImageView) findViewById(R.id.cow);
        dog = (ImageView) findViewById(R.id.dog);
        duck = (ImageView) findViewById(R.id.duck);
        sheep = (ImageView) findViewById(R.id.sheep);

        catSound = MediaPlayer.create(this,R.raw.cat);
        chickenSound = MediaPlayer.create(this,R.raw.chicken);
        cowSound = MediaPlayer.create(this,R.raw.cow);
        dogSound = MediaPlayer.create(this,R.raw.dog);
        duckSound = MediaPlayer.create(this,R.raw.duck);
        sheepSound = MediaPlayer.create(this,R.raw.sheep);
        imageclick();
    }

    public void imageclick() {
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPlay(catSound);
            }

        });
        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPlay(chickenSound);
            }
        });
        cow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPlay(cowSound);
            }
        });
        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPlay(dogSound);
            }
        });
        duck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPlay(duckSound);
            }
        });
        sheep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPlay(sheepSound);
            }
        });
    }
    private void soundPlay(MediaPlayer sound) {
        sound.start();
    }
}