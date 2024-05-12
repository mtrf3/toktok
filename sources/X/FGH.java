package X;

import Y.ACallableS41S0000000_6;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class FGH {
    public static Callable<Boolean> LIZ = new ACallableS41S0000000_6(5);
    public static Boolean LIZIZ = null;

    public static synchronized boolean LIZ() {
        boolean z;
        Callable<Boolean> callable;
        synchronized (FGH.class) {
            if (LIZIZ == null && (callable = LIZ) != null) {
                try {
                    LIZIZ = callable.call();
                } catch (Exception unused) {
                    LIZIZ = Boolean.FALSE;
                }
            }
            Boolean bool = LIZIZ;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
        }
        return z;
    }
}
