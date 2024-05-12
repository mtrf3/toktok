package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes7.dex */
public class EWJ implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "iskLruCache$1");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiskLruCache-cleanup-");
        LIZ.append(pthreadThread.getId());
        pthreadThread.setName(X1D.LIZIZ(LIZ));
        pthreadThread.setDaemon(true);
        return pthreadThread;
    }
}
