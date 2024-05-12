package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Iks, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class ThreadFactoryC47518Iks implements ThreadFactory {
    public final AtomicInteger LJLIL = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new PthreadThread(runnable, C16880lQ.LLLZ("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.LJLIL.getAndIncrement())}));
    }
}
