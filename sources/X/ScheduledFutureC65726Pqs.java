package X;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Pqs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ScheduledFutureC65726Pqs<V> extends AbstractC65725Pqr<V> implements ScheduledFuture {
    public final ScheduledFuture<?> LJLILLLLZI;

    @Override // X.AbstractFutureC65723Pqp, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.LJLILLLLZI.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.LJLILLLLZI.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.LJLILLLLZI.getDelay(timeUnit);
    }

    public ScheduledFutureC65726Pqs(AbstractC84773XOv abstractC84773XOv, ScheduledFuture scheduledFuture) {
        super(abstractC84773XOv);
        this.LJLILLLLZI = scheduledFuture;
    }
}
