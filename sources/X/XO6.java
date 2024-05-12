package X;

import Y.IDHandlerS25S0100000_15;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.MediaSessionService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XO6 {
    public final C62822Ol8 LIZ;
    public final C62822Ol8 LIZIZ;
    public final NotificationManager LIZJ;
    public final XO9 LIZLLL;
    public C84747XNv LJ;
    public final XOA LJFF;
    public final XO5 LJI;
    public BinderC40677Fxp LJII;
    public final Context LJIIIIZZ;
    public final InterfaceC80025Vav LJIIIZ;
    public final InterfaceC80020Vaq LJIIJ;

    public final IDHandlerS25S0100000_15 LIZIZ() {
        return (IDHandlerS25S0100000_15) this.LIZ.getValue();
    }

    public final C84732XNg LIZJ() {
        return (C84732XNg) this.LIZIZ.getValue();
    }

    public final void LIZ() {
        if (this.LJII != null) {
            return;
        }
        try {
            C16880lQ.LLLJL(this.LJIIIIZZ, new Intent(this.LJIIIIZZ, (Class<?>) MediaSessionService.class), this.LJI, 1);
        } catch (Throwable th) {
            J7Z.LIZ("NotificationController", th.getMessage());
        }
    }

    public final void LIZLLL() {
        try {
            BinderC40677Fxp binderC40677Fxp = this.LJII;
            if (binderC40677Fxp != null) {
                try {
                    binderC40677Fxp.LJLIL.stopForeground(true);
                } catch (Throwable unused) {
                }
            }
            this.LIZJ.cancel(R.string.txy);
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
            BinderC40677Fxp binderC40677Fxp = this.LJII;
            if (binderC40677Fxp != null) {
                binderC40677Fxp.unlinkToDeath(this.LJFF, 0);
            }
            this.LJIIIIZZ.unbindService(this.LJI);
        } catch (Throwable th) {
            J7Z.LIZ("NotificationController", th.getMessage());
        }
        this.LJ = null;
    }

    public final void LJFF(C84747XNv c84747XNv) {
        if (o.LJ(c84747XNv.LIZ, Boolean.TRUE) || LIZJ().LIZIZ) {
            LIZIZ().removeMessages(1);
            LIZIZ().removeMessages(2);
            LIZIZ().sendMessageDelayed(Message.obtain(LIZIZ(), 1, c84747XNv), 150L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.app.Notification] */
    public final void LJI(C84747XNv c84747XNv) {
        int i;
        int i2;
        int i3;
        XO9 xo9 = this.LIZLLL;
        xo9.getClass();
        String str = "NotificationFactory";
        Boolean bool = null;
        try {
            Context context = xo9.LJII;
            if (xo9.LJIIIZ != -1) {
                C022406y c022406y = new C022406y(context, "X_AUDIO_DEFAULT_PLAY_SERVICE");
                c022406y.LIZLLL(false);
                c022406y.LJJIIJ.icon = xo9.LJIIIZ;
                c022406y.LJIIIZ(null);
                c022406y.LJIIJJI = false;
                ((XOR) xo9.LJI.getValue()).LIZ();
                c022406y.LJJ = 1;
                c022406y.LJI = (PendingIntent) xo9.LIZJ.getValue();
                String str2 = c84747XNv.LIZLLL;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                c022406y.LJFF(str2);
                String str4 = c84747XNv.LJ;
                if (str4 == null) {
                    str4 = "";
                }
                c022406y.LJ(str4);
                String str5 = c84747XNv.LJFF;
                if (str5 != null) {
                    str3 = str5;
                }
                c022406y.LJIILIIL = C022406y.LIZJ(str3);
                c022406y.LJII(2, o.LJ(c84747XNv.LIZ, Boolean.TRUE));
                c022406y.LJJIIJ.deleteIntent = (PendingIntent) xo9.LIZ.getValue();
                c022406y.LJIIZILJ = "x_audio_default_player_service";
                Bitmap bitmap = c84747XNv.LJI;
                if (bitmap != null && bitmap.isRecycled()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("coverBitmap(");
                    LIZ.append(c84747XNv.LJI);
                    LIZ.append(") already recycled.");
                    J7Z.LIZJ("NotificationFactory", X1D.LIZIZ(LIZ));
                } else {
                    c022406y.LJIIIIZZ(c84747XNv.LJI);
                }
                Boolean bool2 = c84747XNv.LIZIZ;
                if (bool2 != null && bool2.booleanValue()) {
                    i = R.drawable.dey;
                } else {
                    i = R.drawable.dez;
                }
                c022406y.LIZ(i, "SkipToPrevious", (PendingIntent) xo9.LIZLLL.getValue());
                Boolean bool3 = c84747XNv.LIZ;
                if (bool3 != null && bool3.booleanValue()) {
                    i2 = R.drawable.dex;
                } else {
                    i2 = R.drawable.deu;
                }
                c022406y.LIZ(i2, "PlayOrPause", (PendingIntent) xo9.LJ.getValue());
                Boolean bool4 = c84747XNv.LIZJ;
                if (bool4 != null && bool4.booleanValue()) {
                    i3 = R.drawable.dev;
                } else {
                    i3 = R.drawable.dew;
                }
                c022406y.LIZ(i3, "SkipToNext", (PendingIntent) xo9.LJFF.getValue());
                C33081Ro c33081Ro = new C33081Ro();
                c33081Ro.LJ = new int[]{0, 1, 2};
                c33081Ro.LJFF = xo9.LJIIIIZZ;
                c022406y.LJIIJ(c33081Ro);
                str = c022406y.LIZIZ();
                if (str != 0) {
                    try {
                        C84747XNv c84747XNv2 = this.LJ;
                        if (c84747XNv2 != null) {
                            bool = c84747XNv2.LIZ;
                        }
                        if (o.LJ(bool, Boolean.TRUE)) {
                            BinderC40677Fxp binderC40677Fxp = this.LJII;
                            if (binderC40677Fxp != 0) {
                                binderC40677Fxp.LIZ(str);
                            }
                        } else {
                            this.LIZJ.notify(R.string.txy, str);
                        }
                        LIZJ().LIZIZ = true;
                    } catch (Throwable th) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("showImmediate: ");
                        LIZ2.append(android.util.Log.getStackTraceString(th));
                        J7Z.LIZ("NotificationController", X1D.LIZIZ(LIZ2));
                    }
                }
            }
        } catch (Exception e) {
            J7Z.LIZ(str, e.getMessage());
        }
    }

    public XO6(Context mAppContext, MediaSessionCompat.Token token, InterfaceC80025Vav mMusicQueue, ComponentName notificationReceiverComponentName, InterfaceC80020Vaq interfaceC80020Vaq, int i) {
        o.LJIIJ(mAppContext, "mAppContext");
        o.LJIIJ(mMusicQueue, "mMusicQueue");
        o.LJIIJ(notificationReceiverComponentName, "notificationReceiverComponentName");
        this.LJIIIIZZ = mAppContext;
        this.LJIIIZ = mMusicQueue;
        this.LJIIJ = interfaceC80020Vaq;
        this.LIZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 928));
        this.LIZIZ = C221108m2.LIZIZ(C84738XNm.LJLIL);
        Object LLILL = C16880lQ.LLILL(mAppContext, "notification");
        if (LLILL != null) {
            NotificationManager notificationManager = (NotificationManager) LLILL;
            this.LIZJ = notificationManager;
            this.LJFF = new XOA(this);
            this.LJI = new XO5(this);
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("X_AUDIO_DEFAULT_PLAY_SERVICE", "X_AUDIO_DEFAULT_PLAY_SERVICE_CHANNEL", 2);
                notificationChannel.setSound(null, null);
                notificationChannel.enableVibration(false);
                notificationChannel.setVibrationPattern(null);
                notificationChannel.setDescription("X_AUDIO_DEFAULT_PLAY_SERVICE");
                notificationChannel.setLockscreenVisibility(1);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            this.LIZLLL = new XO9(mAppContext, token, notificationReceiverComponentName, i);
            LIZ();
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.app.NotificationManager");
    }
}
