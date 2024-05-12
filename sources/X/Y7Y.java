package X;

import Y.ACallableS118S0100000_15;
import Y.ARunnableS34S0200000_15;
import android.os.Handler;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y7Y {
    public final synchronized void LIZ(Runnable runnable) {
        o.LJIIJ(runnable, "runnable");
        C10K.LIZJ(new ACallableS118S0100000_15(runnable, 9));
    }

    public final synchronized void LIZIZ(long j, Runnable runnable) {
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS34S0200000_15(this, runnable, 34), j);
    }
}
