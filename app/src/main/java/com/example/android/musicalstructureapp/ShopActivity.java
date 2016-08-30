package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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

        TextView contentTextView = (TextView) findViewById(R.id.music_shop_content);
        String content = "";
        content += "I have an issue about buying a music online";
        content += ")\n";
        content += "I need to find a way for user to pay for buying a music.";
        contentTextView.setText(content);

    }
}
