package com.byted.cast.source.services;

import X.C022406y;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C66163Pxv;
import X.C84763XOl;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.zhiliaoapp.musically.R;
import java.util.Random;

/* loaded from: classes29.dex */
public class ProjectionService extends Service {
    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_byted_cast_source_services_ProjectionService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_byted_cast_source_services_ProjectionService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void com_byted_cast_source_services_ProjectionService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(ProjectionService projectionService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        projectionService.com_byted_cast_source_services_ProjectionService__attachBaseContext$___twin___(context);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Notification build;
        Random random;
        C66163Pxv.LIZ(this, intent, i, i2);
        if (Build.VERSION.SDK_INT >= 26) {
            String packageName = getPackageName();
            NotificationChannel notificationChannel = new NotificationChannel(packageName, packageName, 0);
            notificationChannel.setLightColor(-16776961);
            notificationChannel.setLockscreenVisibility(0);
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannel);
            C022406y c022406y = new C022406y(this, packageName);
            c022406y.LJII(2, true);
            c022406y.LJJIIJ.icon = R.drawable.bt;
            c022406y.LJFF("App is running in background");
            c022406y.LJIIJ = 1;
            c022406y.LJIJJ = "service";
            build = c022406y.LIZIZ();
            build.flags = 32;
            random = new Random();
        } else {
            Context applicationContext = getApplicationContext();
            if (C38891fp.LJLJI && applicationContext == null) {
                applicationContext = C38891fp.LJLILLLLZI;
            }
            build = new Notification.Builder(applicationContext).build();
            build.flags = 32;
            random = new Random();
        }
        C16880lQ.LLLILZ(this, random.nextInt(), build);
        return super.onStartCommand(intent, i, i2);
    }
}
