package tomer.notiffler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.app.Notification;
import android.content.IntentFilter;
import android.media.RingtoneManager;
import android.net.Uri;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;
/**
 * Created by Tomer on 06-Jul-16.
 */
public class NotifflerService extends NotificationListenerService {

    private String path;
    public NotifflerService(String path){
        super();
        this.path=path;
    }



    public void onNotificationPosted(StatusBarNotification sbn){
        Log.i("Tomer",sbn.getPackageName());
        if(!sbn.getPackageName().equals("com.whatsapp"))
            return;

        Uri next_sound = null;

        // find new ringtone

        RingtoneManager.setActualDefaultRingtoneUri(MyNotiffler.getAppContext(),RingtoneManager.TYPE_NOTIFICATION,next_sound);

    }
}
