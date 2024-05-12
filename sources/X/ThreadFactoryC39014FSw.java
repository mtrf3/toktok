package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.FSw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ThreadFactoryC39014FSw implements ThreadFactory {
    public final String LJLIL;
    public final ThreadFactory LJLILLLLZI = Executors.defaultThreadFactory();

    public ThreadFactoryC39014FSw(String str) {
        this.LJLIL = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.LJLILLLLZI.newThread(new RunnableC04980Hm(runnable));
        newThread.setName(this.LJLIL);
        return newThread;
    }
}
