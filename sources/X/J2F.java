package X;

import android.os.Process;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes9.dex */
public final class J2F extends PthreadThread {
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

    public J2F(Runnable runnable, String str) {
        super(runnable, str);
    }
}
