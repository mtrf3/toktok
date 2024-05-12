package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.Otc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class ThreadFactoryC63348Otc implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "ExecutorFactory$1");
        pthreadThread.setPriority(10);
        return pthreadThread;
    }
}
