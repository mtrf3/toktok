package X;

/* renamed from: X.UtQ */
/* loaded from: classes14.dex */
public abstract class AbstractC78624UtQ extends XKW {
    public boolean shared;
    public C78625UtR<XKU<?>> unconfinedQueue;
    public long useCount;

    private final long delta(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public boolean shouldBeProcessedFromContext() {
        return false;
    }

    public void shutdown() {
    }

    public long getNextTime() {
        C78625UtR<XKU<?>> c78625UtR = this.unconfinedQueue;
        if (c78625UtR == null || c78625UtR.LIZIZ == c78625UtR.LIZJ) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final boolean isActive() {
        if (this.useCount > 0) {
            return true;
        }
        return false;
    }

    public final boolean isUnconfinedLoopActive() {
        if (this.useCount >= delta(true)) {
            return true;
        }
        return false;
    }

    public final boolean isUnconfinedQueueEmpty() {
        C78625UtR<XKU<?>> c78625UtR = this.unconfinedQueue;
        if (c78625UtR == null || c78625UtR.LIZIZ == c78625UtR.LIZJ) {
            return true;
        }
        return false;
    }

    public final boolean processUnconfinedEvent() {
        C78625UtR<XKU<?>> c78625UtR = this.unconfinedQueue;
        if (c78625UtR == null) {
            return false;
        }
        int i = c78625UtR.LIZIZ;
        Object obj = null;
        if (i != c78625UtR.LIZJ) {
            Object[] objArr = c78625UtR.LIZ;
            Object obj2 = objArr[i];
            objArr[i] = null;
            c78625UtR.LIZIZ = (i + 1) & (objArr.length - 1);
            if (obj2 != null) {
                obj = obj2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
        }
        XKU xku = (XKU) obj;
        if (xku == null) {
            return false;
        }
        xku.run();
        return true;
    }

    public boolean isEmpty() {
        return isUnconfinedQueueEmpty();
    }

    public long processNextEvent() {
        if (!processUnconfinedEvent()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final void decrementUseCount(boolean z) {
        long delta = this.useCount - delta(z);
        this.useCount = delta;
        if (delta <= 0 && this.shared) {
            shutdown();
        }
    }

    public final void dispatchUnconfined(XKU<?> xku) {
        C78625UtR<XKU<?>> c78625UtR = this.unconfinedQueue;
        if (c78625UtR == null) {
            c78625UtR = new C78625UtR<>();
            this.unconfinedQueue = c78625UtR;
        }
        Object[] objArr = c78625UtR.LIZ;
        int i = c78625UtR.LIZJ;
        objArr[i] = xku;
        int length = (objArr.length - 1) & (i + 1);
        c78625UtR.LIZJ = length;
        int i2 = c78625UtR.LIZIZ;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            C61898ORa.LJIJJ(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = c78625UtR.LIZ;
            int length3 = objArr3.length;
            int i3 = c78625UtR.LIZIZ;
            C61898ORa.LJIJJ(objArr3, objArr2, length3 - i3, 0, i3, 4);
            c78625UtR.LIZ = objArr2;
            c78625UtR.LIZIZ = 0;
            c78625UtR.LIZJ = length2;
        }
    }

    public final void incrementUseCount(boolean z) {
        this.useCount += delta(z);
        if (!z) {
            this.shared = true;
        }
    }

    public static /* synthetic */ void decrementUseCount$default(AbstractC78624UtQ abstractC78624UtQ, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            abstractC78624UtQ.decrementUseCount(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    public static /* synthetic */ void incrementUseCount$default(AbstractC78624UtQ abstractC78624UtQ, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            abstractC78624UtQ.incrementUseCount(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }
}
