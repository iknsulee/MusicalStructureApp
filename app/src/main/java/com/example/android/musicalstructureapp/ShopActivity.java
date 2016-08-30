package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        View musicListButton = findViewById(R.id.shop_to_music_list);
        musicListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicListIntent = new Intent(ShopActivity.this, MainActivity.class);
                startActivity(musicListIntent);
            }
        });

        View nowPlayingButton = findViewById(R.id.shop_to_now_playing);
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(ShopActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });

    }
}
