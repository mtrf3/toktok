package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import defpackage.b1;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class FOU implements ThreadFactory {
    public static final AtomicInteger LJLJJI = new AtomicInteger(1);
    public final ThreadGroup LJLIL;
    public final AtomicInteger LJLILLLLZI = new AtomicInteger(1);
    public final String LJLJI;

    public FOU(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            this.LJLIL = securityManager.getThreadGroup();
        } else {
            this.LJLIL = C16880lQ.LLLLIIIILLL().getThreadGroup();
        }
        StringBuilder LIZJ = b1.LIZJ(str, "-");
        LIZJ.append(LJLJJI.getAndIncrement());
        LIZJ.append("-Thread-");
        this.LJLJI = X1D.LIZIZ(LIZJ);
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
        if (pthreadThread.getPriority() != 5) {
            pthreadThread.setPriority(5);
        }
        return pthreadThread;
    }
}