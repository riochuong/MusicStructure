package playmusic.jd.com.playmusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music_app);
        Button searchButton = (Button) findViewById(R.id.search_btn);
        searchButton.setOnClickListener(new SearchButtonOnClickListener());
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.my_album_tap:
                startActivity(new Intent(this, MyAlbumActivity.class));
                break;
            case R.id.my_artis_tap:
                startActivity(new Intent(this, MyArtistActivity.class));
                break;
            case R.id.my_song_tap:
                startActivity(new Intent(this, MySongActivity.class));
                break;
            default:
                break;

        }

    }
}
