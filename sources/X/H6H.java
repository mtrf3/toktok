package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.UUID;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes8.dex */
public final class H6H implements ThreadFactory {
    public static final H6H LJLIL = new H6H();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "WaveNet$Builder$build$1$3");
        pthreadThread.setName("wave-event" + UUID.randomUUID().toString());
        return pthreadThread;
    }
}
