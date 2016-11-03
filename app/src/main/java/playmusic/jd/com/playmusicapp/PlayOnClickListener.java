package playmusic.jd.com.playmusicapp;

import android.content.Intent;
import android.view.View;

/**
 * Created by chuondao on 11/2/16.
 */

public class PlayOnClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        // launch search results activity
        int id = view.getId();
        Intent launchPlayMusicActivity = new Intent(view.getContext(),
                NowPlayingActivity.class);
        view.getContext().startActivity(launchPlayMusicActivity);
    }
}
