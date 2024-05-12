package X;

import android.os.Handler;

/* renamed from: X.aQN, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93407aQN {
    public static Handler LIZ;
    public static long LIZIZ = System.currentTimeMillis();
    public static String LIZJ = "init";
    public static final Runnable LIZLLL = RunnableC93406aQM.LJLIL;

    public static void LIZ(String str) {
        LIZJ = str;
        Handler handler = LIZ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = LIZ;
        if (handler2 != null) {
            handler2.postDelayed(LIZLLL, 20000L);
        }
    }
}
