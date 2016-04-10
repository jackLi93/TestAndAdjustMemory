package com.test.jack.testviewpager.app;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by jack on 2016/4/9.
 */
public class TestViewPagerApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }


}
