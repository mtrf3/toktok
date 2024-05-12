package X;

import Y.IDHandlerS27S0100000_29;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.common.MediaSessionService;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.Zub, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91437Zub implements InterfaceC91228ZrE {
    public final Context LIZ;
    public final C91419ZuJ LIZIZ;
    public final InterfaceC91227ZrD LIZJ;
    public final C91605ZxJ LIZLLL;
    public final NotificationManager LJ;
    public final C91262Zrm LJFF;
    public final C91263Zrn LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final IBinder.DeathRecipient LJIIJ;
    public final ServiceConnection LJIIJJI;
    public BinderC91098Zp8 LJIIL;

    public final void LIZIZ() {
        Object LIZ;
        if (this.LJIIL != null) {
            return;
        }
        if (MediaSessionService.LJLL < 0 && MediaSessionService.LJLLI == null) {
            MediaSessionService.LJLL = this.LIZIZ.LJLIL;
            MediaSessionService.LJLLI = this.LJFF.LIZLLL(this.LJI);
        }
        try {
            C16880lQ.LLLJL(this.LIZ, new Intent(this.LIZ, (Class<?>) MediaSessionService.class), this.LJIIJJI, 1);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
    }

    public final IDHandlerS27S0100000_29 LIZJ() {
        return (IDHandlerS27S0100000_29) this.LJIIIZ.getValue();
    }

    public final void LIZLLL() {
        if (this.LJIIIIZZ) {
            LIZJ().removeMessages(-2);
            LIZJ().removeMessages(-1);
            LIZJ().sendMessageDelayed(Message.obtain(LIZJ(), -2), 300L);
        }
    }

    public final void LJ() {
        Object LIZ;
        try {
            BinderC91098Zp8 binderC91098Zp8 = this.LJIIL;
            if (binderC91098Zp8 != null) {
                try {
                    binderC91098Zp8.LJLIL.stopForeground(true);
                    binderC91098Zp8.LJLILLLLZI = false;
                } catch (Throwable unused) {
                }
            }
            this.LJ.cancel(this.LIZIZ.LJLIL);
            this.LJIIIIZZ = false;
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
    }

    @Override // X.InterfaceC91228ZrE
    public final void release() {
        Object LIZ;
        LJ();
        try {
            BinderC91098Zp8 binderC91098Zp8 = this.LJIIL;
            if (binderC91098Zp8 != null) {
                binderC91098Zp8.unlinkToDeath(this.LJIIJ, 0);
            }
            this.LIZ.unbindService(this.LJIIJJI);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
    }

    public final void LJFF(boolean z) {
        long j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notification, show needDelay = ");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        if (this.LJII) {
            if (o.LJ(this.LJI.LIZ, Boolean.TRUE) || this.LJIIIIZZ) {
                LIZJ().removeMessages(-2);
                LIZJ().removeMessages(-1);
                IDHandlerS27S0100000_29 LIZJ = LIZJ();
                Message obtain = Message.obtain(LIZJ(), -1);
                if (z) {
                    j = 300;
                } else {
                    j = 0;
                }
                LIZJ.sendMessageDelayed(obtain, j);
                return;
            }
            return;
        }
        LIZLLL();
    }

    public C91437Zub(Context appContext, C91419ZuJ config, InterfaceC91227ZrD interfaceC91227ZrD, C91605ZxJ c91605ZxJ, MediaSessionCompat.Token token, ComponentName componentName) {
        o.LJIIIZ(appContext, "appContext");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(componentName, "componentName");
        this.LIZ = appContext;
        this.LIZIZ = config;
        this.LIZJ = interfaceC91227ZrD;
        this.LIZLLL = c91605ZxJ;
        Object LLILL = C16880lQ.LLILL(appContext, "notification");
        o.LJII(LLILL, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) LLILL;
        this.LJ = notificationManager;
        this.LJFF = new C91262Zrm(appContext, config, token, componentName);
        this.LJI = new C91263Zrn();
        this.LJIIIIZZ = true;
        this.LJIIIZ = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 76));
        this.LJIIJ = new C91260Zrk(this);
        this.LJIIJJI = new ServiceConnectionC91259Zrj(this);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(config.LJLJJLL, config.LJLJJI, 2);
            notificationChannel.setSound(null, null);
            notificationChannel.enableVibration(false);
            notificationChannel.setVibrationPattern(null);
            notificationChannel.setDescription(config.LJLJJL);
            notificationChannel.setLockscreenVisibility(1);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        LIZIZ();
    }
}
