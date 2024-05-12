package X;

import defpackage.b1;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class FOV implements ThreadFactory {
    public static final AtomicInteger LJLJJI = new AtomicInteger(1);
    public final ThreadGroup LJLIL;
    public final AtomicInteger LJLILLLLZI = new AtomicInteger(1);
    public final String LJLJI;

    public FOV() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            threadGroup = C16880lQ.LLLLIIIILLL().getThreadGroup();
        }
        this.LJLIL = threadGroup;
        StringBuilder LIZJ = b1.LIZJ("TTBackgroundExecutors", "-");
        LIZJ.append(LJLJJI.getAndIncrement());
        LIZJ.append("-Thread-");
        this.LJLJI = X1D.LIZIZ(LIZJ);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJI);
        FOW fow = new FOW(threadGroup, runnable, C47135Ieh.LIZJ(this.LJLILLLLZI, LIZ, LIZ));
        if (fow.isDaemon()) {
            fow.setDaemon(false);
        }
        return fow;
    }
}
