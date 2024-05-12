package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes11.dex */
public final class OII implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "StatisticThread$1");
        pthreadThread.setName("falconx-io-thread");
        pthreadThread.setPriority(3);
        return pthreadThread;
    }
}
