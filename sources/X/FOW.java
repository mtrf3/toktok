package X;

import android.os.Process;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes7.dex */
public final class FOW extends PthreadThread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Process.setThreadPriority(10);
            super.run();
        } finally {
            if (LIZ) {
            }
        }
    }

    public FOW(ThreadGroup threadGroup, Runnable runnable, String str) {
        super(threadGroup, runnable, str, 0L);
    }
}
