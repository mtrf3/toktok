package X;

import android.os.Handler;

/* renamed from: X.VEp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79411VEp {
    public static Handler LIZ;

    public static boolean LIZ() {
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            return true;
        }
        return false;
    }

    public static void LIZJ(Runnable runnable) {
        synchronized (C79411VEp.class) {
            if (LIZ == null) {
                LIZ = new Handler(C16880lQ.LLJJJJ());
            }
        }
        LIZ.post(runnable);
    }

    public static void LJ(Runnable runnable) {
        if (LIZ()) {
            runnable.run();
        } else {
            LIZJ(runnable);
        }
    }

    public static void LIZIZ(Runnable runnable, Object obj) {
        synchronized (C79411VEp.class) {
            if (LIZ == null) {
                LIZ = new Handler(C16880lQ.LLJJJJ());
            }
        }
        LIZ.removeCallbacks(runnable, obj);
    }

    public static void LIZLLL(Runnable runnable, Object obj, long j) {
        synchronized (C79411VEp.class) {
            if (LIZ == null) {
                LIZ = new Handler(C16880lQ.LLJJJJ());
            }
        }
        LIZ.postAtTime(runnable, obj, j);
    }
}
