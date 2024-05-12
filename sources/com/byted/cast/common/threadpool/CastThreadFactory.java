package com.byted.cast.common.threadpool;

import X.C16880lQ;
import X.X1D;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes29.dex */
public class CastThreadFactory implements ThreadFactory {
    public final ThreadGroup mGroup;
    public final String mNamePrefix;
    public final AtomicInteger mThreadNumber = new AtomicInteger(1);

    public String getNamePrefix() {
        return this.mNamePrefix;
    }

    public CastThreadFactory(String str) {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            threadGroup = C16880lQ.LLLLIIIILLL().getThreadGroup();
        }
        this.mGroup = threadGroup;
        this.mNamePrefix = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.mGroup;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ByteCast#");
        LIZ.append(this.mNamePrefix);
        LIZ.append("#");
        LIZ.append(this.mThreadNumber.getAndIncrement());
        PthreadThread pthreadThread = new PthreadThread(threadGroup, runnable, X1D.LIZIZ(LIZ), 0L);
        if (pthreadThread.isDaemon()) {
            pthreadThread.setDaemon(false);
        }
        if (pthreadThread.getPriority() != 5) {
            pthreadThread.setPriority(5);
        }
        return pthreadThread;
    }
}
