package com.weiyu.common;

import android.app.Application;
import android.content.Context;

import com.blankj.utilcode.util.Utils;

public class BaseApplication extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        Utils.init(BaseApplication.this);
    }

    public static Context getContext() {
        return context;
    }
}
