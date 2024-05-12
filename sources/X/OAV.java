package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes11.dex */
public final class OAV implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "DefaultUpdateExecutor$1");
        pthreadThread.setName("gecko-update-thread");
        pthreadThread.setPriority(3);
        return pthreadThread;
    }
}
