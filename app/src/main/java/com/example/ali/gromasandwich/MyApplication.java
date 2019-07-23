package com.example.ali.gromasandwich;

import android.app.Application;
import android.content.Context;
/**
 * Created by ali on 02/02/2018.
 */
public class MyApplication extends Application {

    private static Context context;

    public void onCreate() {
      super.onCreate();
      MyApplication.context = getApplicationContext();
    }

    public static Context getAppContext() {
      return MyApplication.context;
    }
}
