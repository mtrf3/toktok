package X;

import android.os.Handler;

/* renamed from: X.0jN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15610jN {
    public static Handler LIZ;

    public static Handler LIZ() {
        if (LIZ == null) {
            synchronized (C15610jN.class) {
                if (LIZ == null) {
                    LIZ = new Handler(C16880lQ.LLJJJJ());
                }
            }
        }
        return LIZ;
    }

    public static void LIZIZ(Runnable runnable) {
        LIZ().post(runnable);
    }

    public static void LIZLLL(Object obj) {
        LIZ().removeCallbacksAndMessages(obj);
    }

    public static void LIZJ(Runnable runnable, long j) {
        if (runnable == null) {
            return;
        }
        LIZ().postDelayed(runnable, Math.max(j, 0L));
    }
}
