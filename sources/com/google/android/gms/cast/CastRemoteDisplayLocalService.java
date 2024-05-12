package com.google.android.gms.cast;

import X.BinderC90061ZWf;
import X.C35532Dx2;
import X.C38413F5t;
import X.C44389HbV;
import X.C84763XOl;
import X.C90469Zez;
import X.C90558ZgQ;
import X.C90858ZlG;
import X.HandlerC90301ZcH;
import X.RunnableC90059ZWd;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes29.dex */
public abstract class CastRemoteDisplayLocalService extends Service {
    public static final C90469Zez LJLJJI = new C90469Zez("CastRDLocalService");
    public static final Object LJLJJL = new Object();
    public boolean LJLIL;
    public C90858ZlG LJLILLLLZI;
    public final IBinder LJLJI;

    static {
        new AtomicBoolean(false);
    }

    public static void LIZ() {
        LJLJJI.getClass();
    }

    public CastRemoteDisplayLocalService() {
        new C90558ZgQ(this);
        this.LJLJI = new BinderC90061ZWf();
    }

    @Override // android.app.Service
    public final void onCreate() {
        LIZ();
        super.onCreate();
        new HandlerC90301ZcH(getMainLooper()).postDelayed(new RunnableC90059ZWd(this), 100L);
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new C90858ZlG(this);
        }
        if (!C44389HbV.LIZ()) {
            return;
        }
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        NotificationChannel notificationChannel = new NotificationChannel("cast_remote_display_local_service", getString(R.string.a0), 2);
        notificationChannel.setShowBadge(false);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        LIZ();
        return this.LJLJI;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        LIZ();
        this.LJLIL = true;
        return 2;
    }
}
