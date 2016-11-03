package playmusic.jd.com.playmusicapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MyAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_album);
        Button album1 = (Button) findViewById(R.id.play_album1_btn);
        Button album2 = (Button) findViewById(R.id.play_album2_btn);
        album1.setOnClickListener(new PlayOnClickListener());
        album2.setOnClickListener(new PlayOnClickListener());

    }

}
