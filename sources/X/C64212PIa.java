package X;

import android.os.SystemClock;
import com.bytedance.crash.util.NativeTools;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* renamed from: X.PIa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64212PIa extends PthreadThread {
    public C64212PIa() {
        super("npth-tick");
    }

    public final void LIZLLL() {
        super.run();
        while (PIX.LIZ) {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (!V3N.LJJIIJ()) {
                    long j = 0;
                    if (PIX.LJIIL >= 0) {
                        try {
                            j = NativeTools.LJIILJJIL().LJJII(PIX.LJIIL);
                        } catch (Throwable unused) {
                        }
                    }
                    PIX.LJIILIIL = j;
                }
                PIX.LIZLLL = (uptimeMillis - PIX.LJFF) / PIX.LJ;
                long j2 = uptimeMillis - PIX.LJFF;
                long j3 = PIX.LJ;
                long j4 = j2 % j3;
                if (j4 >= 95) {
                    PIX.LIZLLL--;
                    j3 = PIX.LJ << 1;
                }
                SystemClock.sleep(j3 - j4);
            } catch (Throwable unused2) {
            }
        }
        PIX.LJIIIZ = false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZLLL();
        } finally {
            if (LIZ) {
            }
        }
    }
}
