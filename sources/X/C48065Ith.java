package X;

import android.os.Process;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* renamed from: X.Ith, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48065Ith extends PthreadThread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Process.setThreadPriority(10);
        } catch (Throwable unused) {
        }
        try {
            super.run();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C48065Ith(Runnable runnable) {
        super(runnable, "Preloader$6$1");
    }
}
