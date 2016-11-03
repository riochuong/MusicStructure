package playmusic.jd.com.playmusicapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SearchActivityResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        Button album2 = (Button) findViewById(R.id.play_album2_btn);
        Button song1 = (Button) findViewById(R.id.play_song1_btn);
        Button artis1 = (Button) findViewById(R.id.play_artis1_btn);
        album2.setOnClickListener(new PlayOnClickListener());
        song1.setOnClickListener(new PlayOnClickListener());
        artis1.setOnClickListener(new PlayOnClickListener());
    }

}
