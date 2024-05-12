package com.bytedance.android.live.broadcast.service;

import X.AnonymousClass078;
import X.C022406y;
import X.C05400Jc;
import X.C0JX;
import X.C0NB;
import X.C0RN;
import X.C35532Dx2;
import X.C38413F5t;
import X.C40684Fxw;
import X.C66163Pxv;
import X.C84763XOl;
import X.QZP;
import X.X1D;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import com.zhiliaoapp.musically.R;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class ForegroundMirrorCastService extends Service {
    public NotificationManager mNotificationManager;

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_bytedance_android_live_broadcast_service_ForegroundMirrorCastService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_bytedance_android_live_broadcast_service_ForegroundMirrorCastService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onCreate() {
        C0NB.LJIIIZ("ForegroundMirrorCastService", "BgBroadcastService onCreate");
        super.onCreate();
        this.mNotificationManager = (NotificationManager) getSystemService("notification");
        Notification buildNotification = buildNotification(this);
        if (C40684Fxw.LIZ()) {
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("service info---->:");
            LIZ.append(getClass().getCanonicalName());
            printStream.println(X1D.LIZIZ(LIZ));
        }
        startForeground(R.id.h4g, buildNotification);
    }

    @Override // android.app.Service
    public void onDestroy() {
        C0NB.LJIIIZ("ForegroundMirrorCastService", "BgBroadcastService onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    private Notification buildNotification(Context context) {
        int i;
        C022406y c022406y;
        C0RN.LIZLLL("BgBroadcastService buildNotification: notificationsEnabled", new AnonymousClass078(context).LIZIZ(), "ForegroundMirrorCastService");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && this.mNotificationManager.getNotificationChannel("ForegroundMirrorCastService.notification") == null) {
            NotificationChannel notificationChannel = new NotificationChannel("ForegroundMirrorCastService.notification", "Cast", 3);
            notificationChannel.enableVibration(false);
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent();
        intent.putExtra("enter_from", "mirror_cast_notice");
        intent.putExtra("broadcast_type", 4);
        if (i2 >= 23) {
            i = 201326592;
        } else {
            i = 134217728;
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, i);
        if (i2 >= 26) {
            c022406y = new C022406y(context, "ForegroundMirrorCastService.notification");
        } else {
            c022406y = new C022406y(context, null);
        }
        c022406y.LJFF("Live");
        c022406y.LJJIIJ.icon = R.drawable.cwo;
        c022406y.LJII(2, true);
        c022406y.LJJIIJ.when = System.currentTimeMillis();
        c022406y.LJI = activity;
        c022406y.LJIJJ = "service";
        c022406y.LJII(8, true);
        c022406y.LJII(16, true);
        c022406y.LJII(2, true);
        c022406y.LJJ = 0;
        C0NB.LJIIIZ("ForegroundMirrorCastService", "BgBroadcastService buildNotification done");
        return c022406y.LIZIZ();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new Binder();
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        C0NB.LJIIIZ("ForegroundMirrorCastService", "BgBroadcastService onTaskRemoved");
        C05400Jc.LJIIL();
        C0JX.LJII(true);
        stopForeground(true);
        super.onTaskRemoved(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        QZP.LIZJ("BgBroadcastService onTrimMemory level = ", i, "ForegroundMirrorCastService");
        super.onTrimMemory(i);
    }

    public static void com_bytedance_android_live_broadcast_service_ForegroundMirrorCastService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(ForegroundMirrorCastService foregroundMirrorCastService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        foregroundMirrorCastService.com_bytedance_android_live_broadcast_service_ForegroundMirrorCastService__attachBaseContext$___twin___(context);
    }
}
