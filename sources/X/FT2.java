package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class FT2<V> implements RunnableFuture<V>, ScheduledFuture<V> {
    public final FutureTask<V> LJLIL;

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.LJLIL.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.LJLIL.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.LJLIL.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        this.LJLIL.run();
    }

    public FT2(Callable callable) {
        this.LJLIL = new FutureTask<>(callable);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.LJLIL.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public FT2(Runnable runnable, Object obj) {
        this.LJLIL = new FutureTask<>(runnable, obj);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return this.LJLIL.get(j, timeUnit);
    }
}
