package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EED {
    public static final ThreadLocal<Long> LIZ = new ThreadLocal<>();
    public static final ThreadLocal<Long> LIZIZ = new ThreadLocal<>();
    public static long LIZJ;
    public static long LIZLLL;

    public static boolean LIZ() {
        if (LIZJ > 0 && LIZLLL > 50) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(long j, EE1 task) {
        o.LJIIIZ(task, "task");
        if (C36839Ed1.LIZIZ(EF7.LIZIZ())) {
            ThreadLocal<Long> threadLocal = LIZIZ;
            threadLocal.set(Long.valueOf(System.currentTimeMillis()));
            long longValue = threadLocal.get().longValue() - j;
            ThreadLocal<Long> threadLocal2 = LIZ;
            if (threadLocal2.get() == null) {
                threadLocal2.set(Long.valueOf(longValue));
                return;
            }
            Long l = threadLocal2.get();
            o.LJIIIIZZ(l, "duration.get()");
            threadLocal2.set(Long.valueOf(l.longValue() + longValue));
        }
    }

    public static void LIZJ(long j, EE1 task) {
        o.LJIIIZ(task, "task");
        if (C36839Ed1.LIZIZ(EF7.LIZIZ())) {
            ThreadLocal<Long> threadLocal = LIZ;
            Long l = threadLocal.get();
            ThreadLocal<Long> threadLocal2 = LIZIZ;
            if (threadLocal2.get() != null) {
                Long l2 = threadLocal2.get();
                o.LJIIIIZZ(l2, "lastTime.get()");
                long longValue = j - l2.longValue();
                if (0 <= longValue && longValue <= LIZJ) {
                    if (l != null && l.longValue() > LIZLLL) {
                        threadLocal.set(0L);
                        Thread.sleep(LIZJ - longValue);
                        return;
                    }
                    return;
                }
                threadLocal.set(0L);
            }
        }
    }
}
