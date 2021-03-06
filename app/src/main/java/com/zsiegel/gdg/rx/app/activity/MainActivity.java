package com.zsiegel.gdg.rx.app.activity;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import com.zsiegel.gdg.rx.app.R;
import com.zsiegel.gdg.rx.app.RXGDGApp;
import com.zsiegel.gdg.rx.app.fragment.MainFragment;

/**
 * @author zsiegel (zac.s@akta.com)
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, new MainFragment(), MainFragment.TAG)
                    .commit();
        }
    }
}
