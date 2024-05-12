package X;

import android.os.Process;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes12.dex */
public class P8P implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "LockMonitorManager$2");
        Process.setThreadPriority(-20);
        pthreadThread.setName("lock_stack_fetch");
        return pthreadThread;
    }
}
