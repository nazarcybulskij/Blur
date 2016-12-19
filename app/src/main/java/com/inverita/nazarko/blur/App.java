package com.inverita.nazarko.blur;

import android.app.Application;

import com.wonderkiln.blurkit.BlurKit;

/**
 * Created by nazarko on 12/19/16.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        BlurKit.init(this);
    }
}
