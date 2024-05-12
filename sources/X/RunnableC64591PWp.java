package X;

import Y.ARunnableS9S0101000_5;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.PWp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC64591PWp implements Runnable {
    public static final PThreadScheduledThreadPoolExecutor LJLJJL = new PThreadScheduledThreadPoolExecutor(1, Executors.defaultThreadFactory());
    public final C64582PWg LJLIL;
    public final PThreadPoolExecutor LJLILLLLZI = new PThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("CleanupRunnable"));
    public final ARunnableS9S0101000_5 LJLJI = new ARunnableS9S0101000_5(7, this, 8);
    public Future<?> LJLJJI = null;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        long LIZ2;
        do {
            try {
                LIZ2 = this.LJLIL.LIZ(System.nanoTime());
                if (LIZ2 == -1) {
                    return;
                }
            } finally {
                if (LIZ) {
                }
            }
        } while (LIZ2 <= 0);
        synchronized (this.LJLIL) {
            this.LJLJJI = LJLJJL.schedule(this.LJLJI, LIZ2, TimeUnit.NANOSECONDS);
        }
    }

    public RunnableC64591PWp(C64582PWg c64582PWg) {
        this.LJLIL = c64582PWg;
    }
}
