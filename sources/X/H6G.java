package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.UUID;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes8.dex */
public final class H6G implements ThreadFactory {
    public static final H6G LJLIL = new H6G();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "WaveNet$Builder$build$1$2");
        pthreadThread.setName("wave-task" + UUID.randomUUID().toString());
        return pthreadThread;
    }
}
