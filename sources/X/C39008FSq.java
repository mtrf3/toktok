package X;

import android.os.Process;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* renamed from: X.FSq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39008FSq extends PthreadThread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Process.setThreadPriority(19);
            synchronized (this) {
                while (true) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public C39008FSq(ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
    }
}
