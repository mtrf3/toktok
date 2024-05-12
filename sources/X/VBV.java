package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes15.dex */
public final class VBV implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread;
        pthreadThread = new PthreadThread(runnable, "glide-disk-lru-cache-thread");
        pthreadThread.setPriority(1);
        return pthreadThread;
    }
}
