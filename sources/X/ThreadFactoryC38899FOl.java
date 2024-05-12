package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.FOl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ThreadFactoryC38899FOl implements ThreadFactory {
    public final String LJLIL;
    public final AtomicInteger LJLILLLLZI = new AtomicInteger();
    public final boolean LJLJI = true;

    public ThreadFactoryC38899FOl(String str) {
        this.LJLIL = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = this.LJLILLLLZI.incrementAndGet();
        StringBuilder LIZ = X1D.LIZ();
        PthreadThread pthreadThread = new PthreadThread(runnable, C40084FoG.LIZ(LIZ, this.LJLIL, "-", incrementAndGet, LIZ));
        if (!this.LJLJI) {
            if (pthreadThread.isDaemon()) {
                pthreadThread.setDaemon(false);
            }
            if (pthreadThread.getPriority() != 5) {
                pthreadThread.setPriority(5);
            }
        }
        return pthreadThread;
    }
}
