package com.google.android.play.core.assetpacks;

import X.C03880Dg;
import X.C13T;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C40654FxS;
import X.C40684Fxw;
import X.C66163Pxv;
import X.C84763XOl;
import X.X1D;
import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import java.io.PrintStream;

/* loaded from: classes7.dex */
public class AssetPackExtractionService extends Service {
    public final C13T LJLIL = new C13T("AssetPackExtractionService");
    public Context LJLILLLLZI;
    public i2 LJLJI;
    public y LJLJJI;
    public w LJLJJL;
    public NotificationManager LJLJJLL;

    public final synchronized void LIZ() {
        this.LJLIL.LIZJ("Stopping service.", 4, new Object[0]);
        this.LJLJI.LIZ(false);
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.LJLJJL;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public final void onCreate() {
        j0 j0Var;
        super.onCreate();
        this.LJLIL.LIZJ("onCreate", 3, new Object[0]);
        Context applicationContext = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        synchronized (l1.class) {
            if (l1.LIZ == null) {
                new C03880Dg();
                Context LLLLL = C16880lQ.LLLLL(applicationContext);
                if (LLLLL != null) {
                    applicationContext = LLLLL;
                }
                l1.LIZ = new j0(new m2(applicationContext));
            }
            j0Var = l1.LIZ;
        }
        Context context = j0Var.LIZ.LIZ;
        C40654FxS.LJI(context);
        this.LJLILLLLZI = context;
        this.LJLJI = j0Var.LIZJ.a();
        this.LJLJJI = j0Var.LIZIZ.a();
        this.LJLJJL = new w(this.LJLILLLLZI, this, this.LJLJJI);
        this.LJLJJLL = (NotificationManager) C16880lQ.LLILL(this.LJLILLLLZI, "notification");
    }

    public final synchronized void LIZIZ(Bundle bundle) {
        Notification.Builder priority;
        String string = bundle.getString("notification_title");
        String string2 = bundle.getString("notification_subtext");
        long j = bundle.getLong("notification_timeout");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("notification_on_click_intent");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            priority = new Notification.Builder(this.LJLILLLLZI, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j);
        } else {
            priority = new Notification.Builder(this.LJLILLLLZI).setPriority(-2);
        }
        if (pendingIntent != null) {
            priority.setContentIntent(pendingIntent);
        }
        priority.setSmallIcon(R.drawable.stat_sys_download).setOngoing(false).setContentTitle(string).setSubText(string2);
        priority.setColor(bundle.getInt("notification_color")).setVisibility(-1);
        Notification build = priority.build();
        this.LJLIL.LIZJ("Starting foreground service.", 4, new Object[0]);
        this.LJLJI.LIZ(true);
        if (i >= 26) {
            this.LJLJJLL.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", bundle.getString("notification_channel_name"), 2));
        }
        if (C40684Fxw.LIZ()) {
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("service info---->:");
            LIZ.append(getClass().getCanonicalName());
            printStream.println(X1D.LIZIZ(LIZ));
        }
        startForeground(-1883842196, build);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }
}
