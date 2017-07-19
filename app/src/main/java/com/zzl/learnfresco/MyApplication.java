package com.zzl.learnfresco;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by ZZL on 2017/7/19
 * Email:mr_ziliang@163.com
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //初始化Fresco
        initFresco();
    }

    private void initFresco() {
        Fresco.initialize(this);
    }
}
