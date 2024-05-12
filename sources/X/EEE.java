package X;

/* loaded from: classes7.dex */
public final class EEE {
    public static volatile boolean LIZ;
    public static final ThreadLocal<Integer> LIZIZ = new ThreadLocal<>();

    public static void LIZ() {
        if (!((Boolean) EIH.LIZLLL.getValue()).booleanValue()) {
            return;
        }
        if (LIZ) {
            try {
                ThreadLocal<Integer> threadLocal = LIZIZ;
                Integer num = threadLocal.get();
                if (num == null) {
                    num = 0;
                }
                if (num.intValue() < 10) {
                    Thread.sleep(300L);
                } else {
                    LIZ = false;
                }
                num.intValue();
                threadLocal.set(num);
                return;
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        LIZIZ.set(0);
    }
}
