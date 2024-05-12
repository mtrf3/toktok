package com.ss.android.ugc.aweme.audiomode.fullepisodev2.notification;

import X.C03880Dg;
import X.C09R;
import X.C10760bY;
import X.C221108m2;
import X.C35532Dx2;
import X.C38413F5t;
import X.C39519Ff9;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C66163Pxv;
import X.C78983UzD;
import X.C84763XOl;
import X.X1D;
import X.XOC;
import X.XOS;
import X.YBK;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AudioMediaSessionService extends MediaBrowserServiceCompat {
    public static final List<String> LJLJLJ;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(XOS.INSTANCE);

    @Override // androidx.media.MediaBrowserServiceCompat
    public final void LIZ(String clientPackageName) {
        o.LJIIIZ(clientPackageName, "clientPackageName");
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.intent.action.MEDIA_BUTTON");
        arrayList.add("android.media.browse.MediaBrowserService");
        arrayList.add("android.media.AUDIO_BECOMING_NOISY");
        LJLJLJ = arrayList;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        stopForeground(true);
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service
    public final IBinder onBind(Intent intent) {
        return new XOC(this);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    public final void LIZIZ(String parentId, C09R<List<MediaBrowserCompat.MediaItem>> c09r) {
        o.LJIIIZ(parentId, "parentId");
        c09r.LIZJ();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ActivityManager activityManager;
        List<ActivityManager.RunningServiceInfo> runningServices;
        String action;
        C66163Pxv.LIZ(this, intent, i, i2);
        Intent intent2 = new Intent("player.plugin.mediasession.common.intent.filter.AWE_MEDIA_SESSION_BROADCAST");
        intent2.putExtra("EXTRA_MEDIA_BUTTON_DATA", intent);
        if (intent != null && (action = intent.getAction()) != null && ((ArrayList) LJLJLJ).contains(action)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unexpect intent: ");
            LIZ.append(intent);
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
        }
        C10760bY.LIZ(this).LIZJ(intent2);
        if (Build.VERSION.SDK_INT >= 26) {
            YBK.LIZ.getClass();
            if (YBK.LIZ().tryToFixServiceBug && (activityManager = (ActivityManager) this.LJLJL.getValue()) != null) {
                C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101302, "android/app/ActivityManager", "getRunningServices", activityManager, new Object[]{Integer.MAX_VALUE}, "java.util.List", new C65300Pk0(false, "(I)Ljava/util/List;", "7924372429246218157"));
                if (LIZJ.LIZ) {
                    runningServices = (List) LIZJ.LIZIZ;
                } else {
                    runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
                }
                if (runningServices != null) {
                    Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
                    while (it.hasNext() && !o.LJ(it.next().service.getClassName(), AudioMediaSessionService.class.getName())) {
                    }
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
