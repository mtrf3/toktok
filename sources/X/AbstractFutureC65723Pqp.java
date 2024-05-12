package X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Pqp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractFutureC65723Pqp<V> extends AbstractC65561PoD implements Future<V> {
    @Override // java.util.concurrent.Future
    public final V get() {
        return ((AbstractC65725Pqr) this).LJLIL.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return ((AbstractC65725Pqr) this).LJLIL.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return ((AbstractC65725Pqr) this).LJLIL.isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return ((AbstractC65725Pqr) this).LJLIL.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return ((AbstractC65725Pqr) this).LJLIL.get(j, timeUnit);
    }
}
