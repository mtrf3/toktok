package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.FSu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ThreadFactoryC39012FSu implements ThreadFactory {
    public final String LJLIL;
    public final AtomicInteger LJLILLLLZI = new AtomicInteger();
    public final ThreadFactory LJLJI = Executors.defaultThreadFactory();

    public ThreadFactoryC39012FSu(String str) {
        this.LJLIL = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.LJLJI.newThread(new RunnableC04980Hm(runnable));
        String str = this.LJLIL;
        int andIncrement = this.LJLILLLLZI.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
