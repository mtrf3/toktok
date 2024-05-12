package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.FOi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ThreadFactoryC38896FOi implements ThreadFactory {
    public static final AtomicInteger LJLJJI = new AtomicInteger(1);
    public final ThreadGroup LJLIL;
    public final AtomicInteger LJLILLLLZI = new AtomicInteger(1);
    public final String LJLJI;

    public ThreadFactoryC38896FOi() {
        ThreadGroup threadGroup;
        String str;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
            str = "s.threadGroup";
        } else {
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            o.LJFF(LLLLIIIILLL, "Thread.currentThread()");
            threadGroup = LLLLIIIILLL.getThreadGroup();
            str = "Thread.currentThread().threadGroup";
        }
        o.LJFF(threadGroup, str);
        this.LJLIL = threadGroup;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pool-jedi-core-");
        LIZ.append(LJLJJI.getAndIncrement());
        LIZ.append("-thread-");
        this.LJLJI = X1D.LIZIZ(LIZ);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r) {
        o.LJIIJ(r, "r");
        ThreadGroup threadGroup = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJI);
        PthreadThread pthreadThread = new PthreadThread(threadGroup, r, C47135Ieh.LIZJ(this.LJLILLLLZI, LIZ, LIZ), 0L);
        if (pthreadThread.isDaemon()) {
            pthreadThread.setDaemon(false);
        }
        if (pthreadThread.getPriority() != 5) {
            pthreadThread.setPriority(5);
        }
        return pthreadThread;
    }
}
