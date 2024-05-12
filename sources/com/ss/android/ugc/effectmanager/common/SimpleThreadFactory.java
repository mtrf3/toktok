package com.ss.android.ugc.effectmanager.common;

import X.C40084FoG;
import X.X1D;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class SimpleThreadFactory implements ThreadFactory {
    public boolean ignoreStatusCheck;
    public String threadName;
    public AtomicInteger threadSeq;

    public SimpleThreadFactory(String str) {
        this(str, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        int incrementAndGet = this.threadSeq.incrementAndGet();
        StringBuilder LIZ = X1D.LIZ();
        PthreadThread pthreadThread = new PthreadThread(runnable, C40084FoG.LIZ(LIZ, this.threadName, "-", incrementAndGet, LIZ));
        if (!this.ignoreStatusCheck) {
            if (pthreadThread.isDaemon()) {
                pthreadThread.setDaemon(false);
            }
            if (pthreadThread.getPriority() != 5) {
                pthreadThread.setPriority(5);
            }
        }
        return pthreadThread;
    }

    public SimpleThreadFactory(String str, boolean z) {
        this.threadSeq = new AtomicInteger();
        this.threadName = str;
        this.ignoreStatusCheck = z;
    }
}
