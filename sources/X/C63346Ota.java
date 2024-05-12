package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Ota, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63346Ota {
    public static volatile ExecutorService LIZ;
    public static volatile ExecutorService LIZIZ;
    public static volatile ExecutorService LIZJ;
    public static volatile ExecutorService LIZLLL;
    public static final Object LJ = new Object();
    public static final Object LJFF = new Object();
    public static final Object LJI = new Object();
    public static final Object LJII = new Object();
    public static final ThreadFactoryC63348Otc LJIIIIZZ = new ThreadFactoryC63348Otc();

    public static Executor LIZ() {
        if (LIZLLL == null) {
            synchronized (LJII) {
                if (LIZLLL == null) {
                    LIZLLL = C16880lQ.LLLLZLLLI(LJIIIIZZ);
                }
            }
        }
        return LIZLLL;
    }

    public static synchronized Executor LIZIZ() {
        ExecutorService executorService;
        synchronized (C63346Ota.class) {
            int i = 4;
            if (LIZJ == null) {
                C63308Osy.LJI().LIZLLL().getClass();
                synchronized (LJI) {
                    if (LIZJ == null || LIZJ.isShutdown()) {
                        int availableProcessors = Runtime.getRuntime().availableProcessors();
                        if (availableProcessors <= 1) {
                            availableProcessors = 4;
                        }
                        LIZJ = C16880lQ.LLLLZI(availableProcessors, LJIIIIZZ);
                    }
                }
            }
            if (LIZJ.isShutdown()) {
                int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                if (availableProcessors2 > 1) {
                    i = availableProcessors2;
                }
                LIZJ = C16880lQ.LLLLZI(i, LJIIIIZZ);
            }
            executorService = LIZJ;
        }
        return executorService;
    }

    public static void LIZLLL() {
        if (LIZ != null) {
            LIZ.shutdown();
            LIZ = null;
        }
        if (LIZIZ != null) {
            LIZIZ.shutdown();
            LIZIZ = null;
        }
        if (LIZJ != null) {
            LIZJ.shutdown();
            LIZJ = null;
        }
        if (LIZLLL != null) {
            LIZLLL.shutdown();
            LIZLLL = null;
        }
    }

    public static Executor LIZJ() {
        C47922IrO.LIZ();
        if (LIZIZ == null) {
            synchronized (LJFF) {
                if (LIZIZ == null) {
                    LIZIZ = C16880lQ.LLLLZLLLI(LJIIIIZZ);
                }
            }
        }
        return LIZIZ;
    }
}
