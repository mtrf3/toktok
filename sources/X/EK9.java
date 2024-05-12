package X;

import java.io.PrintStream;

/* loaded from: classes7.dex */
public final class EK9 {
    public static volatile boolean LIZ;

    public static boolean LIZ() {
        if (LIZ) {
            return true;
        }
        synchronized (EK9.class) {
            if (LIZ) {
                return true;
            }
            try {
                C16880lQ.LLJJJIL("EffectEditorABTestJni");
                LIZ = true;
            } catch (Throwable th) {
                PrintStream printStream = System.err;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Native code library failed to load.\n");
                LIZ2.append(th);
                printStream.println(X1D.LIZIZ(LIZ2));
                LIZ = false;
            }
            return LIZ;
        }
    }
}
