package X;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes16.dex */
public abstract class XP4<V> extends AbstractC84773XOv<V> {
    @Override // X.AbstractC84773XOv, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.LJLIL instanceof XPA;
    }

    @Override // X.AbstractC84773XOv, java.util.concurrent.Future
    public final V get() {
        return (V) super.get();
    }

    @Override // X.AbstractC84773XOv, java.util.concurrent.Future
    public final boolean isDone() {
        return super.isDone();
    }

    @Override // X.AbstractC84773XOv, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return super.cancel(z);
    }

    @Override // X.AbstractC84773XOv, X.C76L
    public final void LJFF(Runnable runnable, Executor executor) {
        super.LJFF(runnable, executor);
    }

    @Override // X.AbstractC84773XOv, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return (V) super.get(j, timeUnit);
    }
}
