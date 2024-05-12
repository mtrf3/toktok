package X;

/* loaded from: classes7.dex */
public final class EEF {
    public static int LIZ;
    public static volatile boolean LIZIZ;
    public static final ThreadLocal<Integer> LIZJ;

    static {
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        LIZJ = threadLocal;
        threadLocal.set(0);
    }

    public static void LIZ() {
        Integer num = 0;
        if (LIZIZ) {
            try {
                ThreadLocal<Integer> threadLocal = LIZJ;
                Integer num2 = threadLocal.get();
                if (num2 != null) {
                    num = num2;
                }
                if (num.intValue() < 10) {
                    Thread.sleep(300L);
                } else {
                    LIZIZ = false;
                }
                num.intValue();
                threadLocal.set(num);
                return;
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        LIZJ.set(num);
    }
}
