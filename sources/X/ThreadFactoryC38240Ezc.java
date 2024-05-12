package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.Ezc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ThreadFactoryC38240Ezc implements ThreadFactory {
    public final String LJLIL;
    public final EnumC38242Eze LJLILLLLZI;
    public final AtomicInteger LJLJI;

    public ThreadFactoryC38240Ezc() {
        EnumC38242Eze threadPriority = EnumC38242Eze.NORMAL;
        o.LJIIIZ(threadPriority, "threadPriority");
        this.LJLIL = "TTImmediateExecutors";
        this.LJLILLLLZI = threadPriority;
        this.LJLJI = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append('-');
        LIZ.append(this.LJLJI.incrementAndGet());
        return new C38241Ezd(runnable, X1D.LIZIZ(LIZ), this);
    }
}
