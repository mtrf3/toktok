package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.FjX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39791FjX implements X1E {
    public final AtomicReference<StringBuilder>[] LIZ = new AtomicReference[32];
    public final AtomicInteger LIZIZ = new AtomicInteger(-1);

    @Override // X.X1E
    public final StringBuilder get() {
        int andDecrement = this.LIZIZ.getAndDecrement();
        if (andDecrement >= 32) {
            andDecrement = 31;
        }
        if (andDecrement >= 0) {
            StringBuilder andSet = this.LIZ[andDecrement].getAndSet(null);
            if (andSet != null) {
                return andSet;
            }
        } else {
            this.LIZIZ.set(-1);
        }
        return new StringBuilder();
    }

    public C39791FjX() {
        int i = 0;
        do {
            this.LIZ[i] = new AtomicReference<>(null);
            i++;
        } while (i < 32);
    }

    @Override // X.X1E
    public final String LIZ(StringBuilder sb) {
        String sb2 = sb.toString();
        if (sb.length() > 4096) {
            return sb2;
        }
        sb.setLength(0);
        int incrementAndGet = this.LIZIZ.incrementAndGet();
        if (incrementAndGet >= 32) {
            this.LIZIZ.set(31);
        } else if (incrementAndGet >= 0) {
            this.LIZ[incrementAndGet].set(sb);
        }
        return sb2;
    }
}
