package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes12.dex */
public final class PRB {
    public static volatile PThreadScheduledThreadPoolExecutor LIZ;

    public static ScheduledThreadPoolExecutor LIZ() {
        if (LIZ != null) {
            return LIZ;
        }
        synchronized (PRB.class) {
            if (LIZ != null) {
                return LIZ;
            }
            LIZ = new PThreadScheduledThreadPoolExecutor(0, new DefaultThreadFactory("EEScheduledThreadPool"));
            return LIZ;
        }
    }
}
