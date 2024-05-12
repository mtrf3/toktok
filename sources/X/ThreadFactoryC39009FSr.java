package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.FSr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class ThreadFactoryC39009FSr implements ThreadFactory {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ AtomicLong LJLILLLLZI;

    public /* synthetic */ ThreadFactoryC39009FSr(String str, AtomicLong atomicLong) {
        this.LJLIL = str;
        this.LJLILLLLZI = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.LJLIL;
        AtomicLong atomicLong = this.LJLILLLLZI;
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(atomicLong.getAndIncrement());
        newThread.setName(X1D.LIZIZ(LIZ));
        return newThread;
    }
}
