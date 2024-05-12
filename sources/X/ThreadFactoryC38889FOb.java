package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.FOb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class ThreadFactoryC38889FOb implements ThreadFactory {
    public final ThreadGroup LJLIL;
    public final AtomicInteger LJLILLLLZI = new AtomicInteger(1);
    public final String LJLJI;

    public ThreadFactoryC38889FOb() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            threadGroup = C16880lQ.LLLLIIIILLL().getThreadGroup();
        }
        this.LJLIL = threadGroup;
        this.LJLJI = "live-stream-strategy-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJI);
        PthreadThread pthreadThread = new PthreadThread(threadGroup, runnable, C47135Ieh.LIZJ(this.LJLILLLLZI, LIZ, LIZ), 0L);
        if (pthreadThread.isDaemon()) {
            pthreadThread.setDaemon(false);
        }
        if (pthreadThread.getPriority() != 1) {
            pthreadThread.setPriority(1);
        }
        return pthreadThread;
    }
}
