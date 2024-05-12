package com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.common;

import X.BinderC91098Zp8;
import X.C022406y;
import X.C09R;
import X.C16880lQ;
import X.C221108m2;
import X.C35532Dx2;
import X.C38413F5t;
import X.C52363Kgp;
import X.C62822Ol8;
import X.C84763XOl;
import X.C91532Zw8;
import X.EF7;
import X.X1D;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.MediaBrowserServiceCompat;
import com.zhiliaoapp.musically.R;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MediaSessionService extends MediaBrowserServiceCompat {
    public static final List<String> LJLJLLL;
    public static int LJLL;
    public static Notification LJLLI;
    public BinderC91098Zp8 LJLJL;
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C91532Zw8.INSTANCE);

    @Override // androidx.media.MediaBrowserServiceCompat
    public final void LIZ(String clientPackageName) {
        o.LJIIIZ(clientPackageName, "clientPackageName");
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.intent.action.MEDIA_BUTTON");
        arrayList.add("android.media.browse.MediaBrowserService");
        arrayList.add("android.media.AUDIO_BECOMING_NOISY");
        LJLJLLL = arrayList;
        LJLL = -1;
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service
    public final void onCreate() {
        NotificationManager notificationManager;
        super.onCreate();
        if (LJLL >= 0 && LJLLI != null) {
            try {
                PrintStream printStream = System.err;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("MediaSessionService valid onCreate. startForeground() invoke before,   notification id is : ");
                LIZ.append(LJLL);
                printStream.println(X1D.LIZIZ(LIZ));
                C16880lQ.LLLJ(this, LJLL, LJLLI);
                return;
            } catch (Throwable unused) {
                PrintStream printStream2 = System.err;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("MediaSessionService valid onCreate. startForeground() invoke exception,   notification id is : ");
                LIZ2.append(LJLL);
                printStream2.println(X1D.LIZIZ(LIZ2));
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            C52363Kgp.LIZ.getClass();
            if (((Number) C52363Kgp.LIZIZ.getValue()).intValue() == 1) {
                System.err.println("MediaSessionService in fix. onCreate. startForeground() default and stop it");
                try {
                    NotificationChannel notificationChannel = new NotificationChannel("MUSIC_PLAY_SERVICE", "Music Play Service", 2);
                    notificationChannel.setSound(null, null);
                    notificationChannel.enableVibration(false);
                    notificationChannel.setVibrationPattern(null);
                    notificationChannel.setDescription("MUSIC_PLAY_SERVICE");
                    notificationChannel.setLockscreenVisibility(1);
                    Object LLILZIL = C16880lQ.LLILZIL(this);
                    if ((LLILZIL instanceof NotificationManager) && (notificationManager = (NotificationManager) LLILZIL) != null) {
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                    C16880lQ.LLLJ(this, R.id.ix, new C022406y(EF7.LIZIZ(), "MUSIC_PLAY_SERVICE").LIZIZ());
                    stopSelf();
                    return;
                } catch (Throwable unused2) {
                    System.err.println("MediaSessionService in fix. onCreate. startForeground or stopSelf invoke exception");
                    return;
                }
            }
        }
        try {
            System.err.println("MediaSessionService other onCreate. startForeground() default and stop it");
            C16880lQ.LLLJ(this, R.id.ix, new C022406y(EF7.LIZIZ(), "MUSIC_PLAY_SERVICE").LIZIZ());
            stopSelf();
        } catch (Throwable unused3) {
            System.err.println("MediaSessionService other onCreate. startForeground or stopSelf invoke exception");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        LJLL = -1;
        LJLLI = null;
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
        BinderC91098Zp8 binderC91098Zp8 = new BinderC91098Zp8(this);
        this.LJLJL = binderC91098Zp8;
        return binderC91098Zp8;
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

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        if (X.YBK.LIZ().shouldBringUpService == false) goto L8;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int onStartCommand(android.content.Intent r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.common.MediaSessionService.onStartCommand(android.content.Intent, int, int):int");
    }
}
