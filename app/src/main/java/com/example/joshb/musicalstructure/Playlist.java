package com.example.joshb.musicalstructure;

import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        // Let's hardware volume keys adjust the volume of music.
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
    }
}
