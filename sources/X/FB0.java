package X;

/* loaded from: classes7.dex */
public final class FB0 {
    public static volatile boolean LIZ;
    public static boolean LIZIZ;
    public static final ThreadLocal<Long> LIZJ = new ThreadLocal<>();

    public static void LIZ() {
        Long l = 0L;
        if (LIZ) {
            try {
                ThreadLocal<Long> threadLocal = LIZJ;
                Long l2 = threadLocal.get();
                if (l2 == null) {
                    threadLocal.set(l);
                } else {
                    l = l2;
                }
                if (l.longValue() < 100) {
                    Thread.sleep(100L);
                } else {
                    LIZ = false;
                }
                threadLocal.set(Long.valueOf(l.longValue() + 1));
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        LIZJ.set(l);
    }
}
