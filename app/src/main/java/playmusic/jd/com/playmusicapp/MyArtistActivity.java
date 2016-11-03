package playmusic.jd.com.playmusicapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MyArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_artist);
        Button artist1 = (Button) findViewById(R.id.play_artis1_btn);
        Button artist2 = (Button) findViewById(R.id.play_artis2_btn);
        artist1.setOnClickListener(new PlayOnClickListener());
        artist2.setOnClickListener(new PlayOnClickListener());
    }

}
