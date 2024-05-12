package X;

import Y.ARunnableS25S0200000_6;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* renamed from: X.EiA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37158EiA {
    public static C37157Ei9 LIZ() {
        ThreadLocal<C37157Ei9> threadLocal = C37157Ei9.LIZIZ;
        C37157Ei9 c37157Ei9 = threadLocal.get();
        if (c37157Ei9 == null) {
            C37157Ei9 c37157Ei92 = new C37157Ei9();
            threadLocal.set(c37157Ei92);
            return c37157Ei92;
        }
        return c37157Ei9;
    }

    public static void LIZIZ(Runnable command, Executor executor) {
        o.LJIIIZ(executor, "executor");
        o.LJIIIZ(command, "command");
        executor.execute(new ARunnableS25S0200000_6(command, new HashMap(LIZ().LIZ), 0));
    }
}
