package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        View musicListButton = findViewById(R.id.playing_to_music_list);
        musicListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicListIntent = new Intent(PlayingActivity.this, MainActivity.class);
                startActivity(musicListIntent);
            }
        });

        View musicShopButton = findViewById(R.id.playing_to_music_shop);
        musicShopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicShopIntent = new Intent(PlayingActivity.this, ShopActivity.class);
                startActivity(musicShopIntent);
            }
        });

        TextView contentTextView = (TextView) findViewById(R.id.music_play_content);
        String content = "";
        content += "I have to solve a problem like this, keeping playing from music list, getting a file detail information";
        content += "\n";
        content += "So I need to keep playing music, get a detail information.";
        contentTextView.setText(content);
    }
}
