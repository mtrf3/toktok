package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public final class T1C implements Runnable {
    public final long LJLIL;
    public final ConcurrentLinkedQueue<T1D> LJLILLLLZI;
    public final C73318Sq2 LJLJI;
    public final ScheduledExecutorService LJLJJI;
    public final Future<?> LJLJJL;
    public final ThreadFactory LJLJJLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!this.LJLILLLLZI.isEmpty()) {
                long nanoTime = System.nanoTime();
                Iterator<T1D> it = this.LJLILLLLZI.iterator();
                while (it.hasNext()) {
                    T1D next = it.next();
                    if (next.LJLJI <= nanoTime) {
                        if (this.LJLILLLLZI.remove(next)) {
                            this.LJLJI.LIZIZ(next);
                        }
                    } else {
                        return;
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public T1C(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        long j2;
        ScheduledExecutorService scheduledExecutorService;
        ScheduledFuture<?> scheduledFuture;
        if (timeUnit != null) {
            j2 = timeUnit.toNanos(j);
        } else {
            j2 = 0;
        }
        this.LJLIL = j2;
        this.LJLILLLLZI = new ConcurrentLinkedQueue<>();
        this.LJLJI = new C73318Sq2();
        this.LJLJJLL = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorService = C16880lQ.LLLLZLL(1, T1A.LIZLLL);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
        } else {
            scheduledExecutorService = null;
            scheduledFuture = null;
        }
        this.LJLJJI = scheduledExecutorService;
        this.LJLJJL = scheduledFuture;
    }
}
