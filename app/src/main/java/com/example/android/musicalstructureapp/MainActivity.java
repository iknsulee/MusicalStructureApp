package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View nowPlayingButton = findViewById(R.id.main_to_now_playing);
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });

        TextView contentTextView = (TextView)findViewById(R.id.music_list_content);
        String content = "";
        content += "I have technical hurdles(listing a music files saved on internal and external disk,";
        content += "getting an individual information from that list, playing a music clicked by user";
        content += ")\n";
        content += "So I need to find an API to list a music files save on disk, get an music file information, play a music.";
        contentTextView.setText(content);
    }
}
