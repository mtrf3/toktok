package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.J0w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48478J0w extends BroadcastReceiver {
    public final /* synthetic */ J14 LIZ;

    public C48478J0w(J14 j14) {
        this.LIZ = j14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        if (r1 <= 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.content.Intent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r1 = r4.getAction()     // Catch: java.lang.Exception -> L4b
            java.lang.String r0 = "android.media.VOLUME_CHANGED_ACTION"
            boolean r2 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Exception -> L4b
            java.lang.String r1 = "android.media.EXTRA_VOLUME_STREAM_TYPE"
            r0 = -1
            int r0 = r4.getIntExtra(r1, r0)     // Catch: java.lang.Exception -> L4b
            if (r2 == 0) goto L4b
            r1 = 3
            if (r0 != r1) goto L4b
            X.J14 r2 = r3.LIZ     // Catch: java.lang.Exception -> L4b
            android.media.AudioManager r0 = r2.getAudioManager()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L2c
            int r1 = r0.getStreamVolume(r1)     // Catch: java.lang.Throwable -> L40
        L27:
            boolean r0 = r2.LJLJJLL     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L31
            goto L2e
        L2c:
            r1 = 0
            goto L27
        L2e:
            if (r1 > 0) goto L33
            goto L3a
        L31:
            if (r1 > 0) goto L3a
        L33:
            r0 = r0 ^ 1
            r2.LJLJJLL = r0     // Catch: java.lang.Throwable -> L40
            r2.LIZJ()     // Catch: java.lang.Throwable -> L40
        L3a:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L40
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L40
            goto L48
        L40:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)     // Catch: java.lang.Exception -> L4b
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Exception -> L4b
        L48:
            X.C3C5.m10exceptionOrNullimpl(r0)     // Catch: java.lang.Exception -> L4b
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48478J0w.LIZ(android.content.Intent):void");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C38523F9z.LIZ();
            LIZ(intent);
        }
    }
}
