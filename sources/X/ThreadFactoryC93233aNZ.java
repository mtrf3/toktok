package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.aNZ, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class ThreadFactoryC93233aNZ implements ThreadFactory {
    public final AtomicInteger LJLIL = new AtomicInteger(0);
    public final String LJLILLLLZI;

    public ThreadFactoryC93233aNZ(String str) {
        this.LJLILLLLZI = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pty-");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append("p-");
        LIZ.append(this.LJLIL.getAndIncrement());
        LIZ.append("-t");
        String name = X1D.LIZIZ(LIZ);
        o.LJIIJ(name, "name");
        PthreadThread pthreadThread = new PthreadThread(null, runnable, name, 0L);
        pthreadThread.setDaemon(false);
        pthreadThread.setPriority(5);
        return pthreadThread;
    }
}
