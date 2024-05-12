package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.Arrays;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.JAi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ThreadFactoryC48724JAi implements ThreadFactory {
    public final AtomicInteger LJLIL = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "PopupManagerConfig$Builder$executors$1");
        String LLLZ = C16880lQ.LLLZ("pop_layer_thread_%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.LJLIL.getAndIncrement())}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        pthreadThread.setName(LLLZ);
        return pthreadThread;
    }
}
