package com.example.joshb.musicalstructure;

import android.content.Intent;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlaying extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Let's hardware volume keys adjust the volume of music.
        setVolumeControlStream(AudioManager.STREAM_MUSIC);

        Button library = (Button) findViewById(R.id.btn_library);
        Button artistDetail = (Button) findViewById(R.id.btn_artist_detail);
        Button playlist = (Button) findViewById(R.id.btn_playlist);

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(NowPlaying.this, MusicLibrary.class);
                startActivity(libraryIntent);
            }
        });

        artistDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(NowPlaying.this, ArtistDetail.class);
                startActivity(artistIntent);
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(NowPlaying.this, Playlist.class);
                startActivity(playlistIntent);
            }
        });

    }
}
