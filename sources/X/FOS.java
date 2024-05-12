package X;

import Y.ARunnableS25S0200000_6;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FOS implements ThreadFactory {
    public final AtomicInteger LJLIL = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        o.LJIIJ(runnable, "runnable");
        ARunnableS25S0200000_6 aRunnableS25S0200000_6 = new ARunnableS25S0200000_6(runnable, this, 63);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AsyncInflate #");
        String LIZJ = C47135Ieh.LIZJ(this.LJLIL, LIZ, LIZ);
        PthreadThread pthreadThread = new PthreadThread(aRunnableS25S0200000_6, LIZJ);
        FOR.LIZLLL.put(LIZJ, new C37186Eic());
        return pthreadThread;
    }
}
