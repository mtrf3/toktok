package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C022406y;
import X.C0NB;
import X.C10760bY;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84763XOl;
import X.X1D;
import Y.IDBReceiverS9S0100000_11;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.ies.live_impl.R$drawable;
import com.zhiliaoapp.musically.R;

/* loaded from: classes12.dex */
public class BgBroadcastService extends Service {
    public NotificationManager mNotificationManager;
    public final BroadcastReceiver mPostNotificationPermissionResultReceiver = new IDBReceiverS9S0100000_11(this, 0);

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_ss_android_ugc_aweme_live_livehostimpl_BgBroadcastService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_ss_android_ugc_aweme_live_livehostimpl_BgBroadcastService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public void onDestroy() {
        C0NB.LJIIIIZZ("BgBroadcastService onDestroy");
        stopForeground(true);
        if (Build.VERSION.SDK_INT >= 33) {
            C10760bY.LIZ(this).LIZLLL(this.mPostNotificationPermissionResultReceiver);
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C0NB.LJIIIIZZ("BgBroadcastService onCreate");
        int i = Build.VERSION.SDK_INT;
        this.mNotificationManager = (NotificationManager) getSystemService("notification");
        C16880lQ.LLLJIL(this, buildNotification(this));
        if (i >= 33) {
            C10760bY.LIZ(this).LIZIZ(this.mPostNotificationPermissionResultReceiver, new IntentFilter("bytedance.android.livesdk.chatroom.ui.intent.filter.SERVICE_REQUEST_POST_NOTIFICATION_END"));
        }
    }

    public Notification buildNotification(Context context) {
        int i;
        C022406y c022406y;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && this.mNotificationManager.getNotificationChannel("BgBroadcastService.notification") == null) {
            NotificationChannel notificationChannel = new NotificationChannel("BgBroadcastService.notification", getString(R.string.huf), 3);
            notificationChannel.enableVibration(false);
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity");
        if (i2 >= 23) {
            i = 201326592;
        } else {
            i = 134217728;
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, i);
        if (i2 >= 26) {
            c022406y = new C022406y(context, "BgBroadcastService.notification");
        } else {
            c022406y = new C022406y(context, null);
        }
        c022406y.LJFF(getString(R.string.hun));
        c022406y.LJJIIJ.icon = R$drawable.icon;
        c022406y.LJII(2, true);
        c022406y.LJJIIJ.when = System.currentTimeMillis();
        c022406y.LJI = activity;
        c022406y.LJIJJ = "service";
        c022406y.LJII(8, true);
        c022406y.LJII(16, true);
        c022406y.LJII(2, true);
        c022406y.LJJ = 1;
        return c022406y.LIZIZ();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        C0NB.LJIIIIZZ("BgBroadcastService onBind");
        return new Binder();
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        C0NB.LJIIIIZZ("BgBroadcastService onTaskRemoved");
        super.onTaskRemoved(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BgBroadcastService onTrimMemory level = ");
        LIZ.append(i);
        C0NB.LJIIIIZZ(X1D.LIZIZ(LIZ));
        super.onTrimMemory(i);
    }

    public static void com_ss_android_ugc_aweme_live_livehostimpl_BgBroadcastService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(BgBroadcastService bgBroadcastService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        bgBroadcastService.com_ss_android_ugc_aweme_live_livehostimpl_BgBroadcastService__attachBaseContext$___twin___(context);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        C0NB.LJIIIIZZ("BgBroadcastService onStartCommand");
        if (intent != null && "ACTION_SERVICE_START_FOREGROUND".equals(intent.getAction())) {
            C16880lQ.LLLJIL(this, buildNotification(this));
            C10760bY.LIZ(GlobalContext.getApplicationContext()).LIZJ(new Intent("ACTION_SERVICE_START_FOREGROUND_END"));
        }
        return super.onStartCommand(intent, i, i2);
    }
}
