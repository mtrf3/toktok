package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.XJb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84623XJb {
    public static final /* synthetic */ AtomicReferenceFieldUpdater LIZIZ = AtomicReferenceFieldUpdater.newUpdater(C84623XJb.class, Object.class, "lastScheduledTask");
    public static final /* synthetic */ AtomicIntegerFieldUpdater LIZJ = AtomicIntegerFieldUpdater.newUpdater(C84623XJb.class, "producerIndex");
    public static final /* synthetic */ AtomicIntegerFieldUpdater LIZLLL = AtomicIntegerFieldUpdater.newUpdater(C84623XJb.class, "consumerIndex");
    public static final /* synthetic */ AtomicIntegerFieldUpdater LJ = AtomicIntegerFieldUpdater.newUpdater(C84623XJb.class, "blockingTasksInBuffer");
    public final AtomicReferenceArray<X9P> LIZ = new AtomicReferenceArray<>(128);
    public volatile /* synthetic */ Object lastScheduledTask = null;
    public volatile /* synthetic */ int producerIndex = 0;
    public volatile /* synthetic */ int consumerIndex = 0;
    public volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final int LIZJ() {
        if (this.lastScheduledTask != null) {
            return (this.producerIndex - this.consumerIndex) + 1;
        }
        return this.producerIndex - this.consumerIndex;
    }

    public final X9P LIZLLL() {
        X9P andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (LIZLLL.compareAndSet(this, i, i + 1) && (andSet = this.LIZ.getAndSet(i2, null)) != null) {
                if (andSet.LJLILLLLZI.LJJIJIIJIL() == 1) {
                    LJ.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final X9P LIZIZ(X9P x9p) {
        if (x9p.LJLILLLLZI.LJJIJIIJIL() == 1) {
            LJ.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return x9p;
        }
        int i = this.producerIndex & 127;
        while (this.LIZ.get(i) != null) {
            Thread.yield();
        }
        this.LIZ.lazySet(i, x9p);
        LIZJ.incrementAndGet(this);
        return null;
    }

    public final long LJ(C84623XJb c84623XJb) {
        int i = c84623XJb.producerIndex;
        AtomicReferenceArray<X9P> atomicReferenceArray = c84623XJb.LIZ;
        for (int i2 = c84623XJb.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (c84623XJb.blockingTasksInBuffer == 0) {
                break;
            }
            X9P x9p = atomicReferenceArray.get(i3);
            if (x9p != null) {
                if (x9p.LJLILLLLZI.LJJIJIIJIL() != 1) {
                    continue;
                }
                while (!atomicReferenceArray.compareAndSet(i3, x9p, null)) {
                    if (atomicReferenceArray.get(i3) != x9p) {
                        break;
                    }
                }
                LJ.decrementAndGet(c84623XJb);
                LIZ(x9p, false);
                return -1L;
            }
        }
        return LJFF(c84623XJb, true);
    }

    public final X9P LIZ(X9P x9p, boolean z) {
        if (z) {
            return LIZIZ(x9p);
        }
        X9P x9p2 = (X9P) LIZIZ.getAndSet(this, x9p);
        if (x9p2 == null) {
            return null;
        }
        return LIZIZ(x9p2);
    }

    public final long LJFF(C84623XJb c84623XJb, boolean z) {
        while (true) {
            X9P x9p = (X9P) c84623XJb.lastScheduledTask;
            if (x9p == null) {
                return -2L;
            }
            if (z && x9p.LJLILLLLZI.LJJIJIIJIL() != 1) {
                return -2L;
            }
            V8B.LJ.getClass();
            long nanoTime = System.nanoTime() - x9p.LJLIL;
            long j = V8B.LIZ;
            if (nanoTime < j) {
                return j - nanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LIZIZ;
            while (!atomicReferenceFieldUpdater.compareAndSet(c84623XJb, x9p, null)) {
                if (atomicReferenceFieldUpdater.get(c84623XJb) != x9p) {
                    break;
                }
            }
            LIZ(x9p, false);
            return -1L;
        }
    }
}
