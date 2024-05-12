package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0R2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0R2 {
    public final AtomicInteger LIZ;

    public final int LIZ() {
        return this.LIZ.decrementAndGet();
    }

    public final int LIZIZ() {
        return this.LIZ.get();
    }

    public final int LIZJ() {
        return this.LIZ.incrementAndGet();
    }

    public C0R2(int i) {
        this.LIZ = new AtomicInteger(i);
    }
}
