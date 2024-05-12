package com.bytedance.realx.video;

import X.C03880Dg;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C39519Ff9;
import X.C40684Fxw;
import X.C65300Pk0;
import X.C84763XOl;
import X.X1D;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.text.TextUtils;
import com.bytedance.realx.audio.ScreenAudioCaptureAndroidManager;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.video.RXScreenCaptureService;
import java.io.PrintStream;

/* loaded from: classes33.dex */
public class RXScreenCaptureService extends Service {
    public String mContentText;
    public Handler mHandler;
    public HandlerThread mHandlerThread;
    public String mLaunchActivity;
    public MediaProjection mMediaProjection;
    public MediaProjectionManager mMediaProjectionManager;
    public Intent mPermissionReulstData;
    public boolean mPicoCreateMediaProjection;
    public int mLargeIcon = -1;
    public int mSmallIcon = -1;

    public static MediaProjection com_bytedance_realx_video_RXScreenCaptureService_android_media_projection_MediaProjectionManager_getMediaProjection(MediaProjectionManager mediaProjectionManager, int i, Intent intent) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(102101, "android/media/projection/MediaProjectionManager", "getMediaProjection", mediaProjectionManager, new Object[]{Integer.valueOf(i), intent}, "android.media.projection.MediaProjection", new C65300Pk0(false, "(ILandroid/content/Intent;)Landroid/media/projection/MediaProjection;", "-2701150226657853028"));
        return LIZJ.LIZ ? (MediaProjection) LIZJ.LIZIZ : mediaProjectionManager.getMediaProjection(i, intent);
    }

    public static void com_bytedance_realx_video_RXScreenCaptureService_android_media_projection_MediaProjection_stop(MediaProjection mediaProjection) {
        if (new C03880Dg(2).LIZJ(102102, "android/media/projection/MediaProjection", "stop", mediaProjection, new Object[0], "void", new C65300Pk0(false, "()V", "-2701150226657853028")).LIZ) {
            return;
        }
        mediaProjection.stop();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_bytedance_realx_video_RXScreenCaptureService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_bytedance_realx_video_RXScreenCaptureService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void audioDispose() {
        this.mHandler.post(new Runnable() { // from class: X.ZUh
            @Override // java.lang.Runnable
            public final void run() {
                RXScreenCaptureService.lambda$audioDispose$6();
            }
        });
    }

    private void createNotificationChannel() {
        int i;
        try {
            Class<?> cls = Class.forName(this.mLaunchActivity);
            if (cls != null) {
                Context applicationContext = getApplicationContext();
                if (C38891fp.LJLJI && applicationContext == null) {
                    applicationContext = C38891fp.LJLILLLLZI;
                }
                Notification.Builder builder = new Notification.Builder(applicationContext);
                Intent intent = new Intent(this, cls);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 > 30) {
                    i = 201326592;
                } else {
                    i = 134217728;
                }
                builder.setContentIntent(PendingIntent.getActivity(this, 0, intent, i)).setLargeIcon(BitmapFactory.decodeResource(getResources(), this.mLargeIcon)).setSmallIcon(this.mSmallIcon).setContentText(this.mContentText).setWhen(System.currentTimeMillis());
                if (i2 >= 26) {
                    builder.setChannelId("notification_id");
                    ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("notification_id", "notification_name", 2));
                }
                Notification build = builder.build();
                build.defaults = 1;
                if (C40684Fxw.LIZ()) {
                    PrintStream printStream = System.err;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("service info---->:");
                    LIZ.append(getClass().getCanonicalName());
                    printStream.println(X1D.LIZIZ(LIZ));
                }
                startForeground(110, build);
            }
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    private void stop() {
        this.mHandler.post(new Runnable() { // from class: X.ZUq
            @Override // java.lang.Runnable
            public final void run() {
                RXScreenCaptureService.this.lambda$stop$7();
            }
        });
    }

    private void stopAudioCapture() {
        this.mHandler.post(new Runnable() { // from class: X.ZUg
            @Override // java.lang.Runnable
            public final void run() {
                RXScreenCaptureService.lambda$stopAudioCapture$5();
            }
        });
    }

    private void stopMediaProjection() {
        MediaProjection mediaProjection = this.mMediaProjection;
        if (mediaProjection != null) {
            com_bytedance_realx_video_RXScreenCaptureService_android_media_projection_MediaProjection_stop(mediaProjection);
            this.mMediaProjection = null;
        }
    }

    private void createOrGetMediaProjection() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (this.mMediaProjection == null) {
            if (this.mMediaProjectionManager == null && applicationContext != null) {
                this.mMediaProjectionManager = (MediaProjectionManager) C16880lQ.LLILL(applicationContext, "media_projection");
            }
            MediaProjectionManager mediaProjectionManager = this.mMediaProjectionManager;
            if (mediaProjectionManager != null) {
                this.mMediaProjection = com_bytedance_realx_video_RXScreenCaptureService_android_media_projection_MediaProjectionManager_getMediaProjection(mediaProjectionManager, -1, this.mPermissionReulstData);
            }
            if (this.mMediaProjection == null && this.mPicoCreateMediaProjection) {
                try {
                    this.mMediaProjection = (MediaProjection) MediaProjectionManager.class.getMethod("createMediaProjection", new Class[0]).invoke(this.mMediaProjectionManager, new Object[0]);
                } catch (Exception unused) {
                    this.mMediaProjection = null;
                }
            }
        }
    }

    public static /* synthetic */ void lambda$audioDispose$6() {
        ScreenAudioCaptureAndroidManager.INSTANCE().dispose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startAudioCapture$4() {
        ScreenAudioCaptureAndroidManager.INSTANCE().startAudioCapture(this.mMediaProjection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$7() {
        stopMediaProjection();
        stopForeground(true);
        stopSelf();
    }

    public static /* synthetic */ void lambda$stopAudioCapture$5() {
        ScreenAudioCaptureAndroidManager.INSTANCE().stopAudioCapture();
    }

    public static /* synthetic */ void lambda$stopCapture$1() {
        ScreenCaptureAndroidManager.INSTANCE().stopCapture();
    }

    private void startAudioCapture() {
        createOrGetMediaProjection();
        this.mHandler.post(new Runnable() { // from class: X.ZUd
            @Override // java.lang.Runnable
            public final void run() {
                RXScreenCaptureService.this.lambda$startAudioCapture$4();
            }
        });
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("RXScreenCaptureService");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mHandlerThread.getLooper());
    }

    private void changeCaptureFormat(Intent intent) {
        Intent data = getData(intent);
        if (data == null) {
            return;
        }
        final int intExtra = data.getIntExtra("w", 0);
        final int intExtra2 = data.getIntExtra("h", 0);
        final int intExtra3 = data.getIntExtra("if", 0);
        this.mHandler.post(new Runnable() { // from class: X.ZUa
            @Override // java.lang.Runnable
            public final void run() {
                RXScreenCaptureService.lambda$changeCaptureFormat$2(intExtra, intExtra2, intExtra3);
            }
        });
    }

    private void dispose(Intent intent) {
        Intent data = getData(intent);
        if (data == null) {
            return;
        }
        final int intExtra = data.getIntExtra("hc", 0);
        this.mHandler.post(new Runnable() { // from class: X.ZUk
            @Override // java.lang.Runnable
            public final void run() {
                RXScreenCaptureService.lambda$dispose$3(intExtra);
            }
        });
    }

    public static int getCommand(Intent intent) {
        if (intent == null) {
            return -1;
        }
        return intent.getIntExtra("ACTION", -1);
    }

    public static Intent getData(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Intent) intent.getParcelableExtra("DATA");
    }

    public static /* synthetic */ void lambda$dispose$3(int i) {
        ScreenCaptureAndroidManager.INSTANCE().dispose(i);
    }

    private void startCapture(Intent intent) {
        Intent data = getData(intent);
        if (data == null) {
            return;
        }
        createOrGetMediaProjection();
        final int intExtra = data.getIntExtra("w", 0);
        final int intExtra2 = data.getIntExtra("h", 0);
        final int intExtra3 = data.getIntExtra("if", 0);
        final int intExtra4 = data.getIntExtra("minfr", 0);
        this.mHandler.post(new Runnable() { // from class: X.ZUn
            @Override // java.lang.Runnable
            public final void run() {
                RXScreenCaptureService.this.lambda$startCapture$0(intExtra, intExtra2, intExtra3, intExtra4);
            }
        });
    }

    private void startLaunch(Intent intent) {
        Intent data = getData(intent);
        if (data == null) {
            return;
        }
        this.mLargeIcon = data.getIntExtra("largei", -1);
        this.mSmallIcon = data.getIntExtra("largei", -1);
        this.mLaunchActivity = C16880lQ.LLJJIJIIJIL(data, "activity");
        this.mContentText = C16880lQ.LLJJIJIIJIL(data, "contentText");
        this.mPicoCreateMediaProjection = data.getBooleanExtra("pico_create_media_projection", false);
        if (!TextUtils.isEmpty(this.mLaunchActivity)) {
            int i = this.mLargeIcon;
            if (i == -1 && this.mSmallIcon == -1) {
                return;
            }
            if (this.mSmallIcon == -1) {
                this.mSmallIcon = i;
            }
            if (i == -1) {
                this.mLargeIcon = this.mSmallIcon;
            }
            this.mPermissionReulstData = (Intent) data.getParcelableExtra("PermissionResult");
            createNotificationChannel();
        }
    }

    private void stopCapture(Intent intent) {
        this.mHandler.post(new Runnable() { // from class: X.ZUt
            @Override // java.lang.Runnable
            public final void run() {
                RXScreenCaptureService.lambda$stopCapture$1();
            }
        });
    }

    public static void com_bytedance_realx_video_RXScreenCaptureService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(RXScreenCaptureService rXScreenCaptureService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        rXScreenCaptureService.com_bytedance_realx_video_RXScreenCaptureService__attachBaseContext$___twin___(context);
    }

    public static Intent getServiceIntent(Context context, int i, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) RXScreenCaptureService.class);
        intent2.putExtra("ACTION", i);
        if (intent != null) {
            intent2.putExtra("DATA", intent);
        }
        return intent2;
    }

    public static /* synthetic */ void lambda$changeCaptureFormat$2(int i, int i2, int i3) {
        ScreenCaptureAndroidManager.INSTANCE().changeCaptureFormat(i, i2, i3);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        switch (getCommand(intent)) {
            case 0:
                startLaunch(intent);
                return 2;
            case 1:
                startCapture(intent);
                return 2;
            case 2:
                stopCapture(intent);
                return 2;
            case 3:
                changeCaptureFormat(intent);
                return 2;
            case 4:
            default:
                return 2;
            case 5:
                dispose(intent);
                return 2;
            case 6:
                startAudioCapture();
                return 2;
            case 7:
                stopAudioCapture();
                return 2;
            case 8:
                audioDispose();
                return 2;
            case 9:
                stop();
                return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startCapture$0(int i, int i2, int i3, int i4) {
        ScreenCaptureAndroidManager.INSTANCE().startCapture(i, i2, i3, i4, this.mMediaProjection);
    }
}
