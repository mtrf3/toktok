package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class FQT implements ThreadFactory {
    public final String LJLIL;
    public final AtomicInteger LJLILLLLZI = new AtomicInteger();

    public FQT(String str) {
        this.LJLIL = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = this.LJLILLLLZI.incrementAndGet();
        StringBuilder LIZ = X1D.LIZ();
        PthreadThread pthreadThread = new PthreadThread(runnable, C40084FoG.LIZ(LIZ, this.LJLIL, "-", incrementAndGet, LIZ));
        if (pthreadThread.isDaemon()) {
            pthreadThread.setDaemon(false);
        }
        if (pthreadThread.getPriority() != 1) {
            pthreadThread.setPriority(1);
        }
        return pthreadThread;
    }
}
