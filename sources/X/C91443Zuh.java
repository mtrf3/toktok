package X;

import Y.IDBReceiverS12S0100000_29;
import Y.IDRunnableS88S0100000_29;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.Zuh, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91443Zuh implements InterfaceC91228ZrE {
    public final Context LIZ;
    public final C91605ZxJ LIZIZ;
    public final C62822Ol8 LIZJ;
    public final MediaSessionCompat LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;

    public final C01P LIZJ() {
        return (C01P) this.LJFF.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r9 = this;
            X.ZxJ r8 = r9.LIZIZ
            X.ZsY r4 = r8.LJIJI()
            int[] r1 = X.C91270Zru.LIZ
            int r0 = r4.ordinal()
            r1 = r1[r0]
            r3 = 1
            r5 = 3
            if (r1 == r3) goto L1e
            r0 = 2
            if (r1 == r0) goto L1e
            if (r1 == r5) goto L8f
            r0 = 4
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 != r0) goto L91
        L1d:
            r5 = 1
        L1e:
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            r1 = 822(0x336, double:4.06E-321)
            if (r6 < r0) goto L3d
            boolean r6 = r8.LJFF()
            X.ZxJ r0 = r9.LIZIZ
            X.ZsK r0 = r0.LJIIIIZZ()
            if (r0 == 0) goto L8d
        L33:
            r0 = 1
        L34:
            if (r6 != 0) goto L38
            r1 = 790(0x316, double:3.903E-321)
        L38:
            if (r0 != 0) goto L3d
            r6 = 16
            long r1 = r1 ^ r6
        L3d:
            X.Ol8 r0 = r9.LJ
            java.lang.Object r0 = r0.getValue()
            X.01f r0 = (X.C007501f) r0
            r0.LJFF = r1
            X.ZvI r0 = r8.LJLJI
            X.Zss r1 = r0.LJLILLLLZI
            boolean r0 = r1.LJII()
            if (r0 == 0) goto L8a
            X.ZoX r1 = r1.LJIIL()
            boolean r0 = r1.LIZIZ
            if (r0 == 0) goto L8a
            com.ss.ttvideoengine.TTVideoEngine r0 = r1.LIZIZ()
            int r0 = r0.LJIJ()
            long r1 = (long) r0
        L62:
            X.Ol8 r0 = r9.LJ
            java.lang.Object r0 = r0.getValue()
            X.01f r0 = (X.C007501f) r0
            r0.LIZIZ(r5, r1)
            android.support.v4.media.session.MediaSessionCompat r1 = r9.LIZLLL
            X.Ol8 r0 = r9.LJ
            java.lang.Object r0 = r0.getValue()
            X.01f r0 = (X.C007501f) r0
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.LIZ()
            r1.LJII(r0)
            android.support.v4.media.session.MediaSessionCompat r1 = r9.LIZLLL
            X.ZsY r0 = X.EnumC91310ZsY.PLAYBACK_STATE_STOPPED
            if (r4 == r0) goto L88
        L84:
            r1.LJ(r3)
            return
        L88:
            r3 = 0
            goto L84
        L8a:
            r1 = 0
            goto L62
        L8d:
            r0 = 0
            goto L34
        L8f:
            r5 = 2
            goto L1e
        L91:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91443Zuh.LIZLLL():void");
    }

    @Override // X.InterfaceC91228ZrE
    public final void release() {
        Object LIZ;
        try {
            MediaSessionCompat mediaSessionCompat = this.LIZLLL;
            mediaSessionCompat.LJ(false);
            mediaSessionCompat.LJFF(null, null);
            mediaSessionCompat.LIZLLL();
            C16880lQ.LJJLIIIJL(this.LIZ, (IDBReceiverS12S0100000_29) this.LIZJ.getValue());
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
    }

    public final void LIZIZ() {
        ActivityC45651qj activityC45651qj;
        if (!EarphonePlayerControl.LJII().LIZIZ()) {
            return;
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (!(LJIIIIZZ instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) LJIIIIZZ) == null) {
            return;
        }
        LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(activityC45651qj);
        C91442Zug c91442Zug = new C91442Zug(this, com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj));
        if (LIZIZ != null) {
            EarphonePlayerControl.LJII().LJI(LIZIZ, c91442Zug);
        }
    }

    public C91443Zuh(Context context, C91605ZxJ c91605ZxJ, ComponentName serviceComponentName) {
        int i;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(serviceComponentName, "serviceComponentName");
        this.LIZ = context;
        this.LIZIZ = c91605ZxJ;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 77));
        this.LIZJ = LIZIZ;
        this.LJ = C221108m2.LIZIZ(C91601ZxF.LJLIL);
        this.LJFF = C221108m2.LIZIZ(C91600ZxE.LJLIL);
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "MediaSessionController", null, null);
        Intent component = new Intent("android.intent.action.MEDIA_BUTTON").setComponent(serviceComponentName);
        if (Build.VERSION.SDK_INT >= 23) {
            i = 67108864;
        } else {
            i = 0;
        }
        mediaSessionCompat.LIZ.LIZ.setMediaButtonReceiver(PendingIntent.getService(context, 0, component, i));
        mediaSessionCompat.LJFF(new C91441Zuf(mediaSessionCompat, this), new Handler(C16880lQ.LLJJJJ()));
        mediaSessionCompat.LIZ.LIZ.setFlags(3);
        this.LIZLLL = mediaSessionCompat;
        C16880lQ.LJJLIIIJILLIZJL((BroadcastReceiver) LIZIZ.getValue(), context, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            LIZIZ();
        } else {
            C1DH.LJJIJIIJI(new IDRunnableS88S0100000_29(this, 20));
        }
    }
}
