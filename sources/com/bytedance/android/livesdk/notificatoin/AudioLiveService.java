package com.bytedance.android.livesdk.notificatoin;

import X.AnonymousClass078;
import X.B44;
import X.B57;
import X.BKC;
import X.BKH;
import X.BPD;
import X.BZI;
import X.C022406y;
import X.C03880Dg;
import X.C05170If;
import X.C0NB;
import X.C0Y4;
import X.C15380j0;
import X.C28202B5a;
import X.C28787BRn;
import X.C29044Baa;
import X.C31665Cbl;
import X.C31811Ce7;
import X.C33081Ro;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C38995FSd;
import X.C39519Ff9;
import X.C40684Fxw;
import X.C62705OjF;
import X.C65300Pk0;
import X.C66163Pxv;
import X.C73943T0h;
import X.C84763XOl;
import X.CN1;
import X.InterfaceC28738BPq;
import X.InterfaceC92693kP;
import X.RunnableC28741BPt;
import X.X1D;
import Y.AfS0S0230000_15;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.IBinder;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.dataChannel.PlayerStatusChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBackstageTrafficOpt;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.io.PrintStream;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AudioLiveService extends Service {
    public static final BPD Companion = new BPD();
    public static boolean isRunning;
    public static boolean isStopping;
    public InterfaceC92693kP bitmapDisposable;
    public Notification notification;
    public NotificationManager notificationManager;
    public Room roomCache;

    public static List com_bytedance_android_livesdk_notificatoin_AudioLiveService_android_content_pm_PackageManager_queryIntentActivities(PackageManager packageManager, Intent intent, int i) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, Integer.valueOf(i)}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "-7113883509639533864"));
        return LIZJ.LIZ ? (List) LIZJ.LIZIZ : packageManager.queryIntentActivities(intent, i);
    }

    private final int getPlaySwitchBitmap(boolean z, boolean z2, boolean z3) {
        return z3 ? R.drawable.cy7 : (z2 || !z) ? R.drawable.cy8 : R.drawable.cy9;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_bytedance_android_livesdk_notificatoin_AudioLiveService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_bytedance_android_livesdk_notificatoin_AudioLiveService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    private final void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("audio_live_notify_associated_2", "Audio Live", 3);
            notificationChannel.setSound(null, null);
            notificationChannel.enableVibration(false);
            notificationChannel.setLockscreenVisibility(1);
            NotificationManager notificationManager = this.notificationManager;
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    private final void hideNotification() {
        C0NB.LIZIZ("AudioLiveService", "hideNotification begin");
        Notification LIZIZ = new C022406y(this, "audio_live_notify_associated_2").LIZIZ();
        o.LJIIIIZZ(LIZIZ, "Builder(this, AUDIO_NOTIFY_CHANNEL_ID).build()");
        tryStartForeground(LIZIZ);
        try {
            stopForeground(true);
            new AnonymousClass078(this).LIZJ(101, null);
        } catch (Throwable th) {
            C0NB.LJI("AudioLiveService", th);
        }
        C0NB.LIZIZ("AudioLiveService", "hideNotification end");
    }

    private final boolean isMuted() {
        String str;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomLinkSession LIZ = B57.LIZ.LIZ();
        if (LIZ != null && (enterRoomConfig = LIZ.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            str = roomsData.warmUpPlayerTag;
        } else {
            str = null;
        }
        InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(str);
        if (LIZIZ != null) {
            return LIZIZ.isMute();
        }
        return false;
    }

    private final boolean isPlaying() {
        String str;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomLinkSession LIZ = B57.LIZ.LIZ();
        if (LIZ != null && (enterRoomConfig = LIZ.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            str = roomsData.warmUpPlayerTag;
        } else {
            str = null;
        }
        InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(str);
        if (LIZIZ != null) {
            return LIZIZ.isPlaying();
        }
        return false;
    }

    private final void showNotification() {
        C0NB.LIZIZ("AudioLiveService", "showNotification begin");
        boolean isPlaying = isPlaying();
        boolean isMuted = isMuted();
        boolean z = C28202B5a.LIZ().LIZJ;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (isPlaying) {
            this.roomCache = room;
        }
        Room room2 = this.roomCache;
        if (room2 != null) {
            ImageModel cover = room2.getCover();
            if (cover == null) {
                User owner = room2.getOwner();
                if (owner != null) {
                    cover = owner.getAvatarMedium();
                } else {
                    cover = null;
                }
            }
            this.bitmapDisposable = C31665Cbl.LIZJ(cover).LJII(new C62705OjF()).LJJJLIIL(new AfS0S0230000_15(this, room2, isPlaying, isMuted, z, 0), new AfS0S0230000_15(this, room2, isPlaying, isMuted, z, 1));
        }
        C0NB.LIZIZ("AudioLiveService", "showNotification end");
    }

    @Override // android.app.Service
    public void onCreate() {
        C0NB.LIZIZ("AudioLiveService", "onCreate begin");
        super.onCreate();
        Object systemService = getSystemService("notification");
        o.LJII(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.notificationManager = (NotificationManager) systemService;
        createNotificationChannel();
        Notification LIZIZ = new C022406y(this, "audio_live_notify_associated_2").LIZIZ();
        o.LJIIIIZZ(LIZIZ, "Builder(this, AUDIO_NOTIFY_CHANNEL_ID).build()");
        tryStartForeground(LIZIZ);
        isRunning = true;
        if (isStopping) {
            C0NB.LIZIZ("AudioLiveService", "onCreate isStopping call stopService");
            Companion.getClass();
            BPD.LIZ();
            isStopping = false;
        }
        this.roomCache = null;
        C0NB.LIZIZ("AudioLiveService", "onCreate end");
    }

    @Override // android.app.Service
    public void onDestroy() {
        InterfaceC92693kP interfaceC92693kP;
        C0NB.LIZIZ("AudioLiveService", "onDestroy begin");
        super.onDestroy();
        isRunning = false;
        isStopping = false;
        this.roomCache = null;
        hideNotification();
        InterfaceC92693kP interfaceC92693kP2 = this.bitmapDisposable;
        if (interfaceC92693kP2 != null && !interfaceC92693kP2.isDisposed() && (interfaceC92693kP = this.bitmapDisposable) != null) {
            interfaceC92693kP.dispose();
        }
        C0NB.LIZIZ("AudioLiveService", "onDestroy end");
    }

    private final CharSequence getContentText(boolean z) {
        int i;
        if (z) {
            i = R.string.l0s;
        } else {
            i = R.string.kx_;
        }
        return C15380j0.LJIILJJIL(i);
    }

    private final PendingIntent retrievePlaybackAction(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(this, (Class<?>) AudioLiveService.class));
        if (Build.VERSION.SDK_INT >= 23) {
            PendingIntent service = PendingIntent.getService(this, 0, intent, 67108864);
            o.LJIIIIZZ(service, "{\n            PendingInt…FLAG_IMMUTABLE)\n        }");
            return service;
        }
        PendingIntent service2 = PendingIntent.getService(this, 0, intent, 0);
        o.LJIIIIZZ(service2, "{\n            PendingInt…, 0, intent, 0)\n        }");
        return service2;
    }

    private final void setMute(boolean z) {
        String str;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        if (((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Kd()) {
            z = true;
        }
        EnterRoomLinkSession LIZ = B57.LIZ.LIZ();
        if (LIZ != null && (enterRoomConfig = LIZ.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            str = roomsData.warmUpPlayerTag;
        } else {
            str = null;
        }
        InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(str);
        if (LIZIZ != null) {
            LIZIZ.LJJJJ(str, "notification", z);
        }
        if (!z) {
            C38995FSd.LIZIZ().submit(RunnableC28741BPt.LJLIL);
        }
    }

    private final void setPlayerStatus(boolean z) {
        BKH bkh;
        C28202B5a.LIZ().LJII(z);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        if (z) {
            bkh = BKH.STOP;
        } else {
            bkh = BKH.START;
        }
        dataChannelGlobal.tv0(PlayerStatusChannel.class, bkh);
    }

    private final void tryStartForeground(Notification notification) {
        C0NB.LIZIZ("AudioLiveService", "tryStartForeGround begin");
        try {
            if (C40684Fxw.LIZ()) {
                PrintStream printStream = System.err;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("service info---->:");
                LIZ.append(AudioLiveService.class.getCanonicalName());
                printStream.println(X1D.LIZIZ(LIZ));
            }
            startForeground(101, notification);
        } catch (Exception e) {
            C0NB.LJI("AudioLiveService", e);
        }
        C0NB.LIZIZ("AudioLiveService", "tryStartForeGround end");
    }

    public static void com_bytedance_android_livesdk_notificatoin_AudioLiveService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(AudioLiveService audioLiveService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        audioLiveService.com_bytedance_android_livesdk_notificatoin_AudioLiveService__attachBaseContext$___twin___(context);
    }

    private final Intent getAppOpenIntentByPackageName(Context context, String str) {
        ComponentName componentName;
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setFlags(270532608);
        int i = 0;
        List com_bytedance_android_livesdk_notificatoin_AudioLiveService_android_content_pm_PackageManager_queryIntentActivities = com_bytedance_android_livesdk_notificatoin_AudioLiveService_android_content_pm_PackageManager_queryIntentActivities(packageManager, intent, 0);
        o.LJIIIIZZ(com_bytedance_android_livesdk_notificatoin_AudioLiveService_android_content_pm_PackageManager_queryIntentActivities, "pkgMag.queryIntentActivities(intent, 0)");
        int size = com_bytedance_android_livesdk_notificatoin_AudioLiveService_android_content_pm_PackageManager_queryIntentActivities.size();
        while (true) {
            componentName = null;
            if (i >= size) {
                break;
            }
            ResolveInfo resolveInfo = (ResolveInfo) ListProtector.get(com_bytedance_android_livesdk_notificatoin_AudioLiveService_android_content_pm_PackageManager_queryIntentActivities, i);
            if (o.LJ(resolveInfo.activityInfo.packageName, str)) {
                String str2 = resolveInfo.activityInfo.name;
                if (str2 != null) {
                    componentName = new ComponentName(str, str2);
                }
            } else {
                i++;
            }
        }
        intent.setComponent(componentName);
        return intent;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        String action;
        String str2;
        C66163Pxv.LIZ(this, intent, i, i2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStartCommand begin ");
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        C31811Ce7.LJ(LIZ, str, LIZ, "AudioLiveService");
        if (this.notification == null) {
            this.notification = new C022406y(this, "audio_live_notify_associated_2").LIZIZ();
        }
        Notification notification = this.notification;
        o.LJI(notification);
        tryStartForeground(notification);
        if (intent != null && (action = intent.getAction()) != null) {
            int hashCode = action.hashCode();
            if (hashCode != 1121966330) {
                if (hashCode != 1462935705) {
                    if (hashCode == 1463101821 && action.equals("com.bytedance.android.livesdk.audio_action.SHOW")) {
                        showNotification();
                    }
                } else if (action.equals("com.bytedance.android.livesdk.audio_action.MUTE")) {
                    boolean isMuted = isMuted();
                    boolean isPlaying = isPlaying();
                    LiveBackstageTrafficOpt liveBackstageTrafficOpt = LiveBackstageTrafficOpt.INSTANCE;
                    if (liveBackstageTrafficOpt.getCurrentValue()) {
                        setPlayerStatus(isPlaying);
                    } else {
                        boolean z = !isMuted;
                        setMute(z);
                        C73943T0h.LIZ().LIZIZ(new B44(z, false));
                    }
                    if (!liveBackstageTrafficOpt.getCurrentValue() ? !isMuted : isPlaying) {
                        str2 = "paused";
                    } else {
                        str2 = "restart";
                    }
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_audio_player_pause_click");
                    LIZ2.LJIIZILJ();
                    LIZ2.LJIJJ(str2, "pause_click_type");
                    LIZ2.LJJIIJZLJL();
                }
            } else if (action.equals("com.bytedance.android.livesdk.audio_action.CANCEL")) {
                C0Y4.LIZ("livesdk_audio_player_close_click");
                if (LiveBackstageTrafficOpt.INSTANCE.getCurrentValue()) {
                    setPlayerStatus(true);
                } else {
                    setMute(true);
                    C73943T0h.LIZ().LIZIZ(new B44(true, false));
                }
                BKC LIZ3 = C28202B5a.LIZ();
                LIZ3.LJIIIIZZ = true;
                C0NB.LIZIZ("AudioLiveService", "PipController cancelNotification");
                LIZ3.LJIIIIZZ();
            }
        }
        C0NB.LIZIZ("AudioLiveService", "onStartCommand end");
        return 2;
    }

    public final void showDefaultNotification(Room room, boolean z, boolean z2, boolean z3, Bitmap bitmap) {
        PendingIntent activity;
        if (!isRunning) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            String packageName = getPackageName();
            o.LJIIIIZZ(packageName, "packageName");
            activity = PendingIntent.getActivity(this, 0, getAppOpenIntentByPackageName(this, packageName), 201326592);
        } else {
            String packageName2 = getPackageName();
            o.LJIIIIZZ(packageName2, "packageName");
            activity = PendingIntent.getActivity(this, 0, getAppOpenIntentByPackageName(this, packageName2), 134217728);
        }
        C022406y c022406y = new C022406y(this, "audio_live_notify_associated_2");
        c022406y.LJJIIJ.icon = R.drawable.cy_;
        c022406y.LJIIIIZZ(bitmap);
        c022406y.LJIIJ = 1;
        c022406y.LJII(2, true);
        c022406y.LJII(16, true);
        c022406y.LJJIIJ.when = System.currentTimeMillis();
        c022406y.LJIIJJI = false;
        c022406y.LJJ = 1;
        c022406y.LJIJJ = "transport";
        c022406y.LJIIIZ(null);
        c022406y.LJFF(C05170If.LIZLLL(room.getOwner()));
        c022406y.LJ(getContentText(z3));
        c022406y.LJI = activity;
        C33081Ro c33081Ro = new C33081Ro();
        c33081Ro.LJ = new int[]{0, 1};
        c022406y.LJIIJ(c33081Ro);
        c022406y.LIZ(getPlaySwitchBitmap(z, z2, z3), "", retrievePlaybackAction("com.bytedance.android.livesdk.audio_action.MUTE"));
        c022406y.LIZ(R.drawable.cy6, "", retrievePlaybackAction("com.bytedance.android.livesdk.audio_action.CANCEL"));
        Notification LIZIZ = c022406y.LIZIZ();
        this.notification = LIZIZ;
        if (LIZIZ != null) {
            try {
                Context applicationContext = getApplicationContext();
                if (C38891fp.LJLJI && applicationContext == null) {
                    applicationContext = C38891fp.LJLILLLLZI;
                }
                new AnonymousClass078(applicationContext).LIZLLL(101, LIZIZ);
            } catch (Exception e) {
                C0NB.LJI("AudioLiveService", e);
            }
        }
    }

    public static /* synthetic */ void showDefaultNotification$default(AudioLiveService audioLiveService, Room room, boolean z, boolean z2, boolean z3, Bitmap bitmap, int i, Object obj) {
        if ((i & 16) != 0) {
            bitmap = null;
        }
        audioLiveService.showDefaultNotification(room, z, z2, z3, bitmap);
    }
}
