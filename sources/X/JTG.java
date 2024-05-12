package X;

import android.os.SystemClock;

/* loaded from: classes9.dex */
public final class JTG {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(JTH.LJLIL);
    public static long LIZIZ;

    public static final boolean LIZ() {
        if (((Number) LIZ.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ() {
        if (!LIZ()) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - LIZIZ <= 1200) {
            return true;
        }
        LIZIZ = elapsedRealtime;
        return false;
    }
}
