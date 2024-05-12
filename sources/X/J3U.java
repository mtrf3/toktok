package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class J3U {
    public static ExecutorService LIZ;
    public static ScheduledExecutorService LIZIZ;

    public static ScheduledExecutorService LIZ() {
        ScheduledExecutorService scheduledExecutorService = LIZIZ;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        if (C48541J3h.LIZ != null) {
            synchronized (J3U.class) {
                if (LIZIZ == null) {
                    ScheduledExecutorService LIZIZ2 = C48541J3h.LIZ.LIZIZ();
                    LIZIZ = LIZIZ2;
                    if (LIZIZ2 == null) {
                        LIZIZ = J3V.LIZ();
                    }
                }
            }
            return LIZIZ;
        }
        return J3V.LIZ();
    }

    public static void LIZIZ(Runnable runnable) {
        LIZ().execute(runnable);
    }

    public static void LIZJ(long j, Runnable runnable) {
        if (j <= 0) {
            LIZIZ(runnable);
        } else {
            LIZ().schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
    }
}
