package tomer.notiffler;

import android.app.Application;
import android.content.Context;

/**
 * Created by Tomer on 06-Jul-16.
 */
public class MyNotiffler extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        MyNotiffler.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return MyNotiffler.context;
    }
}