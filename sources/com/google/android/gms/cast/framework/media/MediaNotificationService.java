package com.google.android.gms.cast.framework.media;

import X.C021906t;
import X.C022006u;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C44389HbV;
import X.C66163Pxv;
import X.C84763XOl;
import X.C90117ZYj;
import X.C90295ZcB;
import X.C90423ZeF;
import X.C90468Zey;
import X.C90469Zez;
import X.C90643Zhn;
import X.QH7;
import X.ZYJ;
import X.ZZ5;
import X.ZZ6;
import X.ZZ7;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes29.dex */
public class MediaNotificationService extends Service {
    public static final C90469Zez LJLZ = new C90469Zez("MediaNotificationService");
    public static Runnable LJZ;
    public NotificationOptions LJLIL;
    public C90117ZYj LJLILLLLZI;
    public ComponentName LJLJI;
    public ComponentName LJLJJI;
    public int[] LJLJJLL;
    public long LJLJL;
    public C90423ZeF LJLJLJ;
    public ImageHints LJLJLLL;
    public Resources LJLL;
    public ZZ6 LJLLI;
    public ZZ7 LJLLILLLL;
    public NotificationManager LJLLJ;
    public Notification LJLLL;
    public ZYJ LJLLLL;
    public List<C022006u> LJLJJL = new ArrayList();
    public final BroadcastReceiver LJLLLLLL = new ZZ5(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaNotificationService.LIZIZ():void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d0 -> B:19:0x00d3). Please report as a decompilation issue!!! */
    @Override // android.app.Service
    public final void onCreate() {
        this.LJLLJ = (NotificationManager) getSystemService("notification");
        ZYJ LIZIZ = ZYJ.LIZIZ(this);
        this.LJLLLL = LIZIZ;
        LIZIZ.getClass();
        QH7.LJ("Must be called from the main thread.");
        CastMediaOptions castMediaOptions = LIZIZ.LJ.zzf;
        QH7.LJIIIIZZ(castMediaOptions);
        NotificationOptions notificationOptions = castMediaOptions.zze;
        QH7.LJIIIIZZ(notificationOptions);
        this.LJLIL = notificationOptions;
        this.LJLILLLLZI = castMediaOptions.LJJJJL();
        this.LJLL = getResources();
        Context applicationContext = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        this.LJLJI = new ComponentName(applicationContext, castMediaOptions.zzb);
        if (!TextUtils.isEmpty(this.LJLIL.zzf)) {
            Context applicationContext2 = getApplicationContext();
            if (C38891fp.LJLJI && applicationContext2 == null) {
                applicationContext2 = C38891fp.LJLILLLLZI;
            }
            this.LJLJJI = new ComponentName(applicationContext2, this.LJLIL.zzf);
        } else {
            this.LJLJJI = null;
        }
        NotificationOptions notificationOptions2 = this.LJLIL;
        this.LJLJL = notificationOptions2.zze;
        int dimensionPixelSize = this.LJLL.getDimensionPixelSize(notificationOptions2.zzt);
        this.LJLJLLL = new ImageHints(1, dimensionPixelSize, dimensionPixelSize);
        Context applicationContext3 = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext3 == null) {
            applicationContext3 = C38891fp.LJLILLLLZI;
        }
        this.LJLJLJ = new C90423ZeF(applicationContext3, this.LJLJLLL);
        ComponentName componentName = this.LJLJJI;
        if (componentName != null) {
            BroadcastReceiver broadcastReceiver = this.LJLLLLLL;
            IntentFilter intentFilter = new IntentFilter(componentName.flattenToString());
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                ReceiverRegisterCrashOptimizer.doHWReceiverFix();
            }
            try {
                if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                    ReceiverRegisterLancet.initHandler();
                    registerReceiver(broadcastReceiver, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler);
                } else {
                    registerReceiver(broadcastReceiver, intentFilter);
                }
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                } else {
                    throw e;
                }
            }
        }
        if (!C44389HbV.LIZ()) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", "Cast", 2);
        notificationChannel.setShowBadge(false);
        this.LJLLJ.createNotificationChannel(notificationChannel);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C90423ZeF c90423ZeF = this.LJLJLJ;
        if (c90423ZeF != null) {
            c90423ZeF.LIZIZ();
            c90423ZeF.LJ = null;
        }
        if (this.LJLJJI != null) {
            try {
                BroadcastReceiver broadcastReceiver = this.LJLLLLLL;
                ReceiverRegisterLancet.loge(broadcastReceiver, false);
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
                LJLZ.getClass();
            }
        }
        LJZ = null;
        this.LJLLJ.cancel(1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final C022006u LIZ(String str) {
        char c;
        int i;
        int i2;
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        PendingIntent pendingIntent = null;
        switch (c) {
            case 0:
                ZZ6 zz6 = this.LJLLI;
                int i3 = zz6.LIZJ;
                boolean z = zz6.LIZIZ;
                if (i3 == 2) {
                    NotificationOptions notificationOptions = this.LJLIL;
                    i = notificationOptions.zzh;
                    i2 = notificationOptions.zzv;
                } else {
                    NotificationOptions notificationOptions2 = this.LJLIL;
                    i = notificationOptions2.zzi;
                    i2 = notificationOptions2.zzw;
                }
                if (!z) {
                    i = this.LJLIL.zzj;
                    i2 = this.LJLIL.zzx;
                }
                Intent intent = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                intent.setComponent(this.LJLJI);
                return new C021906t(i, this.LJLL.getString(i2), PendingIntent.getBroadcast(this, 0, intent, C90295ZcB.LIZ)).LIZ();
            case 1:
                if (this.LJLLI.LJFF) {
                    Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                    intent2.setComponent(this.LJLJI);
                    pendingIntent = PendingIntent.getBroadcast(this, 0, intent2, C90295ZcB.LIZ);
                }
                NotificationOptions notificationOptions3 = this.LJLIL;
                return new C021906t(notificationOptions3.zzk, this.LJLL.getString(notificationOptions3.zzy), pendingIntent).LIZ();
            case 2:
                if (this.LJLLI.LJI) {
                    Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                    intent3.setComponent(this.LJLJI);
                    pendingIntent = PendingIntent.getBroadcast(this, 0, intent3, C90295ZcB.LIZ);
                }
                NotificationOptions notificationOptions4 = this.LJLIL;
                return new C021906t(notificationOptions4.zzl, this.LJLL.getString(notificationOptions4.zzz), pendingIntent).LIZ();
            case 3:
                long j = this.LJLJL;
                Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                intent4.setComponent(this.LJLJI);
                intent4.putExtra("googlecast-extra_skip_step_ms", j);
                PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent4, 134217728 | C90295ZcB.LIZ);
                NotificationOptions notificationOptions5 = this.LJLIL;
                int i4 = notificationOptions5.zzm;
                int i5 = notificationOptions5.zzA;
                if (j == 10000) {
                    i4 = notificationOptions5.zzn;
                    i5 = notificationOptions5.zzB;
                } else if (j == 30000) {
                    i4 = notificationOptions5.zzo;
                    i5 = notificationOptions5.zzC;
                }
                return new C021906t(i4, this.LJLL.getString(i5), broadcast).LIZ();
            case 4:
                long j2 = this.LJLJL;
                Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                intent5.setComponent(this.LJLJI);
                intent5.putExtra("googlecast-extra_skip_step_ms", j2);
                PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 0, intent5, 134217728 | C90295ZcB.LIZ);
                NotificationOptions notificationOptions6 = this.LJLIL;
                int i6 = notificationOptions6.zzp;
                int i7 = notificationOptions6.zzD;
                if (j2 == 10000) {
                    i6 = notificationOptions6.zzq;
                    i7 = notificationOptions6.zzE;
                } else if (j2 == 30000) {
                    i6 = notificationOptions6.zzr;
                    i7 = notificationOptions6.zzF;
                }
                return new C021906t(i6, this.LJLL.getString(i7), broadcast2).LIZ();
            case 5:
                Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                intent6.setComponent(this.LJLJI);
                PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 0, intent6, C90295ZcB.LIZ);
                NotificationOptions notificationOptions7 = this.LJLIL;
                return new C021906t(notificationOptions7.zzs, this.LJLL.getString(notificationOptions7.zzG), broadcast3).LIZ();
            case 6:
                Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                intent7.setComponent(this.LJLJI);
                PendingIntent broadcast4 = PendingIntent.getBroadcast(this, 0, intent7, C90295ZcB.LIZ);
                NotificationOptions notificationOptions8 = this.LJLIL;
                return new C021906t(notificationOptions8.zzs, this.LJLL.getString(notificationOptions8.zzG, ""), broadcast4).LIZ();
            default:
                LJLZ.getClass();
                return null;
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, final int i2) {
        boolean z;
        WebImage webImage;
        ZZ6 zz6;
        C66163Pxv.LIZ(this, intent, i, i2);
        MediaInfo mediaInfo = (MediaInfo) intent.getParcelableExtra("extra_media_info");
        QH7.LJIIIIZZ(mediaInfo);
        MediaMetadata mediaMetadata = mediaInfo.zzf;
        QH7.LJIIIIZZ(mediaMetadata);
        int intExtra = intent.getIntExtra("extra_remote_media_client_player_state", 0);
        CastDevice castDevice = (CastDevice) intent.getParcelableExtra("extra_cast_device");
        QH7.LJIIIIZZ(castDevice);
        if (intExtra == 2) {
            z = true;
        } else {
            z = false;
        }
        int i3 = mediaInfo.zzd;
        String LJJJJZ = mediaMetadata.LJJJJZ("com.google.android.gms.cast.metadata.TITLE");
        String str = castDevice.zzd;
        MediaSessionCompat.Token token = (MediaSessionCompat.Token) intent.getParcelableExtra("extra_media_session_token");
        boolean booleanExtra = intent.getBooleanExtra("extra_can_skip_next", false);
        boolean booleanExtra2 = intent.getBooleanExtra("extra_can_skip_prev", false);
        ZZ6 zz62 = new ZZ6(z, i3, LJJJJZ, str, token, booleanExtra, booleanExtra2);
        if (intent.getBooleanExtra("extra_media_notification_force_update", false) || (zz6 = this.LJLLI) == null || z != zz6.LIZIZ || i3 != zz6.LIZJ || !C90468Zey.LJFF(LJJJJZ, zz6.LIZLLL) || !C90468Zey.LJFF(str, zz6.LJ) || booleanExtra != zz6.LJFF || booleanExtra2 != zz6.LJI) {
            this.LJLLI = zz62;
            LIZIZ();
        }
        if (this.LJLILLLLZI != null) {
            webImage = C90117ZYj.LIZ(mediaMetadata);
        } else {
            List<WebImage> list = mediaMetadata.zzd;
            if (list != null && !list.isEmpty()) {
                webImage = (WebImage) ListProtector.get(mediaMetadata.zzd, 0);
            } else {
                webImage = null;
            }
        }
        ZZ7 zz7 = new ZZ7(webImage);
        ZZ7 zz72 = this.LJLLILLLL;
        if (zz72 == null || !C90468Zey.LJFF(zz7.LIZ, zz72.LIZ)) {
            C90423ZeF c90423ZeF = this.LJLJLJ;
            c90423ZeF.LJ = new C90643Zhn(this, zz7);
            c90423ZeF.LIZ(zz7.LIZ);
        }
        C16880lQ.LLLIZZ(this, this.LJLLL);
        LJZ = new Runnable() { // from class: X.ZZ4
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    MediaNotificationService.this.stopSelf(i2);
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        return 2;
    }
}
