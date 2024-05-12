package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes12.dex */
public class PFR implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "LaunchSleepDetector$1");
        pthreadThread.setName("launch_sleep_detector");
        return pthreadThread;
    }
}
