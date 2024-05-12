package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.LinkedList;

/* loaded from: classes12.dex */
public final class PSJ {
    public static final Object LIZ;
    public static final Object LIZIZ;
    public static final LinkedList<Runnable> LIZJ;
    public static PSK LIZLLL;
    public static final LinkedList<Runnable> LJ;
    public static final boolean LJFF;

    static {
        C16880lQ.LJLLJ(PSJ.class);
        LIZ = new Object();
        LIZIZ = new Object();
        LIZJ = new LinkedList<>();
        LIZLLL = null;
        LJ = new LinkedList<>();
        LJFF = true;
        new PSQ();
    }

    public static Handler LIZ() {
        PSK psk;
        synchronized (LIZ) {
            if (LIZLLL == null) {
                HandlerThread handlerThread = new HandlerThread("queued-work-looper", -2);
                handlerThread.start();
                LIZLLL = new PSK(handlerThread.getLooper());
            }
            psk = LIZLLL;
        }
        return psk;
    }

    public static boolean LIZIZ() {
        boolean z;
        synchronized (LIZ) {
            if (!LJ.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static void LIZJ(PSI psi, boolean z) {
        Handler LIZ2 = LIZ();
        synchronized (LIZ) {
            LJ.add(psi);
            if (!z || !LJFF) {
                LIZ2.sendEmptyMessage(1);
            } else {
                LIZ2.sendEmptyMessageDelayed(1, 100L);
            }
        }
    }
}
