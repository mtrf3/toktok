package X;

import Y.IDHandlerS25S0100000_15;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import com.ss.android.ugc.aweme.feed.background.AudioMediaSessionService;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XNz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84751XNz {
    public final Context LIZ;
    public final InterfaceC80022Vas LIZIZ;
    public final InterfaceC84737XNl LIZJ;
    public final InterfaceC80025Vav LIZLLL;
    public final InterfaceC80020Vaq LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final NotificationManager LJII;
    public final XO7 LJIIIIZZ;
    public XNV LJIIIZ;
    public final XOB LJIIJ;
    public final XO2 LJIIJJI;
    public XOD LJIIL;
    public final C62822Ol8 LJIILIIL;

    public final void LIZ() {
        if (this.LJIIL != null) {
            return;
        }
        try {
            C16880lQ.LLLJL(this.LIZ, new Intent(this.LIZ, (Class<?>) AudioMediaSessionService.class), this.LJIIJJI, 1);
        } catch (Throwable th) {
            J7Z.LIZ("NotificationController", th.getMessage());
        }
    }

    public final IDHandlerS25S0100000_15 LIZIZ() {
        return (IDHandlerS25S0100000_15) this.LJFF.getValue();
    }

    public final XNY LIZJ() {
        return (XNY) this.LJI.getValue();
    }

    public final void LIZLLL() {
        try {
            XOD xod = this.LJIIL;
            if (xod != null) {
                try {
                    xod.LJLIL.stopForeground(true);
                } catch (Throwable unused) {
                }
            }
            this.LJII.cancel(((Number) this.LJIILIIL.getValue()).intValue());
            LIZJ().LIZIZ = false;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("hideImmediate: ");
            LIZ.append(android.util.Log.getStackTraceString(th));
            J7Z.LIZ("NotificationController", X1D.LIZIZ(LIZ));
        }
    }

    public final void LJ() {
        LIZLLL();
        try {
            XOD xod = this.LJIIL;
            if (xod != null) {
                xod.unlinkToDeath(this.LJIIJ, 0);
            }
            this.LIZ.unbindService(this.LJIIJJI);
        } catch (Throwable th) {
            J7Z.LIZ("NotificationController", th.getMessage());
        }
    }

    public final void LJFF(XNV xnv) {
        if (o.LJ(xnv.LIZ, Boolean.TRUE) || LIZJ().LIZIZ) {
            LIZIZ().removeMessages(1);
            LIZIZ().removeMessages(2);
            LIZIZ().sendMessageDelayed(Message.obtain(LIZIZ(), 1, xnv), 150L);
        }
    }

    public C84751XNz(Context appContext, MediaSessionCompat.Token token, C48649J7l musicPlayer, C48652J7o musicPlayerQueueController, InterfaceC80025Vav musicQueue, ComponentName notificationReceiverComponentName, C81176VtU c81176VtU, int i) {
        o.LJIIIZ(appContext, "appContext");
        o.LJIIIZ(musicPlayer, "musicPlayer");
        o.LJIIIZ(musicPlayerQueueController, "musicPlayerQueueController");
        o.LJIIIZ(musicQueue, "musicQueue");
        o.LJIIIZ(notificationReceiverComponentName, "notificationReceiverComponentName");
        this.LIZ = appContext;
        this.LIZIZ = musicPlayer;
        this.LIZJ = musicPlayerQueueController;
        this.LIZLLL = musicQueue;
        this.LJ = c81176VtU;
        this.LJFF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 864));
        this.LJI = C221108m2.LIZIZ(XNZ.LJLIL);
        Object LLILL = C16880lQ.LLILL(appContext, "notification");
        o.LJII(LLILL, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) LLILL;
        this.LJII = notificationManager;
        this.LJIIIZ = new XNV();
        this.LJIIJ = new XOB(this);
        this.LJIIJJI = new XO2(this);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("X_AUDIO_DEFAULT_PLAY_SERVICE", "X_AUDIO_DEFAULT_PLAY_SERVICE_CHANNEL", 2);
            notificationChannel.setSound(null, null);
            notificationChannel.enableVibration(false);
            notificationChannel.setVibrationPattern(null);
            notificationChannel.setDescription("X_AUDIO_DEFAULT_PLAY_SERVICE");
            notificationChannel.setLockscreenVisibility(1);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        this.LJIIIIZZ = new XO7(appContext, token, notificationReceiverComponentName, i);
        LIZ();
        this.LJIILIIL = C221108m2.LIZIZ(DIA.LJLIL);
    }
}
