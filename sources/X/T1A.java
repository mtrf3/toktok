package X;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes13.dex */
public final class T1A extends AbstractC73946T0k {
    public static final P3I LIZJ;
    public static final P3I LIZLLL;
    public static final T1D LJI;
    public static final T1C LJII;
    public final AtomicReference<T1C> LIZIZ;
    public static final TimeUnit LJFF = TimeUnit.SECONDS;
    public static final long LJ = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        T1D t1d = new T1D(new P3I("RxCachedThreadSchedulerShutdown"));
        LJI = t1d;
        t1d.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        P3I p3i = new P3I("RxCachedThreadScheduler", max);
        LIZJ = p3i;
        LIZLLL = new P3I("RxCachedWorkerPoolEvictor", max);
        T1C t1c = new T1C(0L, null, p3i);
        LJII = t1c;
        t1c.LJLJI.dispose();
        Future<?> future = t1c.LJLJJL;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = t1c.LJLJJI;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public T1A() {
        P3I p3i = LIZJ;
        T1C t1c = LJII;
        AtomicReference<T1C> atomicReference = new AtomicReference<>(t1c);
        this.LIZIZ = atomicReference;
        T1C t1c2 = new T1C(LJ, LJFF, p3i);
        while (!atomicReference.compareAndSet(t1c, t1c2)) {
            if (atomicReference.get() != t1c) {
                t1c2.LJLJI.dispose();
                Future<?> future = t1c2.LJLJJL;
                if (future != null) {
                    future.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = t1c2.LJLJJI;
                if (scheduledExecutorService == null) {
                    return;
                }
                scheduledExecutorService.shutdownNow();
                return;
            }
        }
    }

    @Override // X.AbstractC73946T0k
    public final AbstractC73945T0j LIZ() {
        return new T1B(this.LIZIZ.get());
    }
}
