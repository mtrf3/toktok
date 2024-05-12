package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.notification.AudioMediaSessionService;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.notification.IActivityMonitorImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XO0 {
    public final Context LIZ;
    public C85068Xa4 LIZIZ;
    public final InterfaceC80020Vaq LIZJ;
    public Aweme LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final NotificationManager LJII;
    public final XO8 LJIIIIZZ;
    public C84729XNd LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public XOC LJIIJJI;
    public final XO4 LJIIL;
    public final XO1 LJIILIIL;

    public final void LIZ() {
        if (this.LJIIJJI != null) {
            return;
        }
        try {
            C16880lQ.LLLJL(this.LIZ, new Intent(this.LIZ, (Class<?>) AudioMediaSessionService.class), this.LJIILIIL, 1);
        } catch (Throwable th) {
            J7Z.LIZ("NotificationController", th.getMessage());
        }
    }

    public final C84726XNa LIZIZ() {
        return (C84726XNa) this.LJI.getValue();
    }

    public final void LIZJ() {
        try {
            XOC xoc = this.LJIIJJI;
            if (xoc != null) {
                try {
                    xoc.LJLIL.stopForeground(true);
                } catch (Throwable unused) {
                }
            }
            this.LJII.cancel(((Number) this.LJIIJ.getValue()).intValue());
            LIZIZ().LIZIZ = false;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("hideImmediate: ");
            LIZ.append(android.util.Log.getStackTraceString(th));
            J7Z.LIZ("NotificationController", X1D.LIZIZ(LIZ));
        }
    }

    public final void LIZLLL() {
        LIZJ();
        try {
            XOC xoc = this.LJIIJJI;
            if (xoc != null) {
                xoc.unlinkToDeath(this.LJIIL, 0);
            }
            this.LIZ.unbindService(this.LJIILIIL);
        } catch (Throwable th) {
            J7Z.LIZ("NotificationController", th.getMessage());
        }
    }

    public final void LJ(C84729XNd c84729XNd) {
        if (o.LJ(c84729XNd.LIZ, Boolean.TRUE) || LIZIZ().LIZIZ) {
            ((Handler) this.LJFF.getValue()).removeMessages(1);
            ((Handler) this.LJFF.getValue()).removeMessages(2);
            ((Handler) this.LJFF.getValue()).sendMessageDelayed(Message.obtain((Handler) this.LJFF.getValue(), 1, c84729XNd), 150L);
        }
    }

    public XO0(Context appContext, MediaSessionCompat.Token token, C85068Xa4 mediaPlayerController, ComponentName notificationReceiverComponentName, IActivityMonitorImpl iActivityMonitorImpl, int i, Aweme aweme, AqS165S0100000_15 aqS165S0100000_15) {
        o.LJIIIZ(appContext, "appContext");
        o.LJIIIZ(mediaPlayerController, "mediaPlayerController");
        o.LJIIIZ(notificationReceiverComponentName, "notificationReceiverComponentName");
        this.LIZ = appContext;
        this.LIZIZ = mediaPlayerController;
        this.LIZJ = iActivityMonitorImpl;
        this.LIZLLL = aweme;
        this.LJ = aqS165S0100000_15;
        this.LJFF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 795));
        this.LJI = C221108m2.LIZIZ(C84727XNb.LJLIL);
        Object LLILL = C16880lQ.LLILL(appContext, "notification");
        o.LJII(LLILL, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) LLILL;
        this.LJII = notificationManager;
        this.LJIIIZ = new C84729XNd();
        this.LJIIJ = C221108m2.LIZIZ(DI9.LJLIL);
        this.LJIIL = new XO4(this);
        this.LJIILIIL = new XO1(this);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("X_AUDIO_DEFAULT_PLAY_SERVICE", "X_AUDIO_DEFAULT_PLAY_SERVICE_CHANNEL", 2);
            notificationChannel.setSound(null, null);
            notificationChannel.enableVibration(false);
            notificationChannel.setVibrationPattern(null);
            notificationChannel.setDescription("X_AUDIO_DEFAULT_PLAY_SERVICE");
            notificationChannel.setLockscreenVisibility(1);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        this.LJIIIIZZ = new XO8(appContext, token, notificationReceiverComponentName, i);
        LIZ();
    }
}
