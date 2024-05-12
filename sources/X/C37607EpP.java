package X;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.EpP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37607EpP<T> {
    public final AtomicReference<BQ6<T>> LIZ = new AtomicReference<>();
    public final ConcurrentLinkedQueue<T> LIZIZ = new ConcurrentLinkedQueue<>();
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public volatile boolean LIZLLL = false;

    public final void LIZIZ() {
        if (this.LIZ.get() != null && this.LIZJ.compareAndSet(false, true)) {
            while (!this.LIZIZ.isEmpty()) {
                T poll = this.LIZIZ.poll();
                if (poll != null) {
                    this.LIZ.get().accept(poll);
                }
            }
            this.LIZJ.set(false);
        }
    }

    public final void LIZ(T t) {
        if (this.LIZLLL) {
            return;
        }
        this.LIZIZ.offer(t);
        LIZIZ();
    }

    public final void LIZJ(BQ6<T> bq6) {
        if (this.LIZLLL) {
            return;
        }
        AtomicReference<BQ6<T>> atomicReference = this.LIZ;
        while (!atomicReference.compareAndSet(null, bq6) && atomicReference.get() == null) {
        }
        LIZIZ();
    }
}
