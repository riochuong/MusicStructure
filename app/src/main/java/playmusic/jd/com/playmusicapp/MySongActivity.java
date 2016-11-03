package playmusic.jd.com.playmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MySongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_song);
        Button song1 = (Button) findViewById(R.id.play_song1_btn);
        Button song2 = (Button) findViewById(R.id.play_song2_btn);
        song1.setOnClickListener(new PlayOnClickListener());
        song2.setOnClickListener(new PlayOnClickListener());
    }

}
