package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes11.dex */
public final class OAK implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "PiecemealSerialExecutor$1");
        pthreadThread.setName("gecko-piecemeal-thread");
        return pthreadThread;
    }
}
