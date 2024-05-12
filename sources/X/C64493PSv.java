package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.PSv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64493PSv {
    public static volatile Executor LIZ;
    public static volatile ExecutorService LIZIZ;
    public static volatile ExecutorService LIZJ;

    public static Executor LIZ() {
        if (LIZ == null) {
            synchronized (C64493PSv.class) {
                if (LIZ == null) {
                    LIZ = LIZIZ(3, 2, "lynx-brief-io-thread");
                }
            }
        }
        return LIZ;
    }

    public static ExecutorService LIZJ() {
        if (LIZJ == null) {
            synchronized (C64493PSv.class) {
                if (LIZJ == null) {
                    LIZJ = LIZIZ(8, Runtime.getRuntime().availableProcessors(), "lynx-network-thread");
                }
            }
        }
        return LIZJ;
    }

    public static ExecutorService LIZIZ(int i, int i2, String str) {
        try {
            return C16880lQ.LLLLZI(i2, new PDL(str, i));
        } catch (Throwable unused) {
            LIZ = new ExecutorC64494PSw();
            return null;
        }
    }
}
