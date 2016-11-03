package playmusic.jd.com.playmusicapp;

import android.content.Intent;
import android.view.View;

/**
 * Created by chuondao on 11/2/16.
 */

public class SearchButtonOnClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        // launch search results activity
        Intent launchSearResultActivity = new Intent(view.getContext(), SearchActivityResult.class);
        view.getContext().startActivity(launchSearResultActivity);
    }
}
