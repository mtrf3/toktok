package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.UUID;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes8.dex */
public final class H6F implements ThreadFactory {
    public static final H6F LJLIL = new H6F();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "WaveNet$Builder$build$1$1");
        pthreadThread.setName("wave-schedule" + UUID.randomUUID().toString());
        return pthreadThread;
    }
}
