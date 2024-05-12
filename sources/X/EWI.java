package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes7.dex */
public final class EWI implements ThreadFactory {
    public volatile int LJLIL;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i;
        synchronized (this) {
            i = this.LJLIL;
            this.LJLIL = i + 1;
        }
        return new PthreadThread(runnable, KMP.LJ("zoin-decode-", i));
    }
}
