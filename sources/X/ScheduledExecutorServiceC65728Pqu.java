package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Pqu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ScheduledExecutorServiceC65728Pqu extends FSD implements ScheduledExecutorService {
    public final ScheduledExecutorService LJLILLLLZI;

    public ScheduledExecutorServiceC65728Pqu(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.LJLILLLLZI = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC84777XOz runnableFutureC84777XOz = new RunnableFutureC84777XOz(Executors.callable(runnable, null));
        return new ScheduledFutureC65726Pqs(runnableFutureC84777XOz, this.LJLILLLLZI.schedule(runnableFutureC84777XOz, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC84777XOz runnableFutureC84777XOz = new RunnableFutureC84777XOz(callable);
        return new ScheduledFutureC65726Pqs(runnableFutureC84777XOz, this.LJLILLLLZI.schedule(runnableFutureC84777XOz, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC65729Pqv runnableC65729Pqv = new RunnableC65729Pqv(runnable);
        return new ScheduledFutureC65726Pqs(runnableC65729Pqv, this.LJLILLLLZI.scheduleAtFixedRate(runnableC65729Pqv, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        RunnableC65729Pqv runnableC65729Pqv = new RunnableC65729Pqv(runnable);
        return new ScheduledFutureC65726Pqs(runnableC65729Pqv, this.LJLILLLLZI.scheduleWithFixedDelay(runnableC65729Pqv, j, j2, timeUnit));
    }
}
