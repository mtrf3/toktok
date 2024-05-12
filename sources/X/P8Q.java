package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes12.dex */
public class P8Q implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "LockMonitorManager$1");
        pthreadThread.setName("lock_handler_time");
        return pthreadThread;
    }
}
