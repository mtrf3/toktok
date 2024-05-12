package X;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VCC implements ThreadFactory {
    public final ThreadFactory LJLIL;

    public VCC(ThreadFactory threadFactory) {
        this.LJLIL = threadFactory;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r) {
        o.LJIIIZ(r, "r");
        Thread newThread = this.LJLIL.newThread(new VCD(r));
        o.LJIIIIZZ(newThread, "origin.newThread(wrappedRunnable)");
        return newThread;
    }
}
