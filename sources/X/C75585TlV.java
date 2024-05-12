package X;

import android.os.SystemClock;

/* renamed from: X.TlV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75585TlV {
    public static long LIZ = -1;
    public static OSZ<Long, Long> LIZIZ = new OSZ<>(0L, -1L);
    public static OSZ<Long, Long> LIZJ = new OSZ<>(0L, -1L);
    public static int LIZLLL;

    public static void LIZ() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (LIZIZ.getSecond().longValue() > 0) {
            LIZIZ = new OSZ<>(Long.valueOf((elapsedRealtime - LIZIZ.getSecond().longValue()) + LIZIZ.getFirst().longValue()), 0L);
        }
        if (LIZJ.getSecond().longValue() > 0) {
            LIZJ = new OSZ<>(Long.valueOf((elapsedRealtime - LIZJ.getSecond().longValue()) + LIZJ.getFirst().longValue()), 0L);
        }
    }

    public static void LIZIZ(int i, long j) {
        if (i > 2) {
            LIZIZ = new OSZ<>(LIZIZ.getFirst(), 0L);
            LIZJ = new OSZ<>(LIZJ.getFirst(), Long.valueOf(j));
        } else {
            LIZIZ = new OSZ<>(LIZIZ.getFirst(), Long.valueOf(j));
            LIZJ = new OSZ<>(LIZJ.getFirst(), 0L);
        }
    }
}
