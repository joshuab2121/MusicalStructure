package com.example.joshb.musicalstructure;

import android.content.Intent;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        // Let's hardware volume keys adjust the volume of music.
        setVolumeControlStream(AudioManager.STREAM_MUSIC);

        Button nowPlaying = (Button) findViewById(R.id.btn_now_playing);
        Button playlist = (Button) findViewById(R.id.btn_playlist);

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MusicLibrary.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MusicLibrary.this, Playlist.class);
                startActivity(playlistIntent);
            }
        });
    }
}
