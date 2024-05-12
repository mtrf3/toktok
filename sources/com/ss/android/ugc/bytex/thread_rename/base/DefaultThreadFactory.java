package com.ss.android.ugc.bytex.thread_rename.base;

import X.C16880lQ;
import X.C47135Ieh;
import X.X1D;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class DefaultThreadFactory implements ThreadFactory {
    public final ThreadGroup group;
    public final String namePrefix;
    public final AtomicInteger threadNumber = new AtomicInteger(1);

    public DefaultThreadFactory(String str) {
        SecurityManager securityManager = System.getSecurityManager();
        this.group = securityManager != null ? securityManager.getThreadGroup() : C16880lQ.LLLLIIIILLL().getThreadGroup();
        this.namePrefix = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.group;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.namePrefix);
        PthreadThread pthreadThread = new PthreadThread(threadGroup, runnable, C47135Ieh.LIZJ(this.threadNumber, LIZ, LIZ), 0L);
        if (pthreadThread.isDaemon()) {
            pthreadThread.setDaemon(false);
        }
        if (pthreadThread.getPriority() != 5) {
            pthreadThread.setPriority(5);
        }
        return pthreadThread;
    }
}
