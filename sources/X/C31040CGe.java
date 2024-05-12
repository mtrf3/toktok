package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CGe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31040CGe {
    public final long LIZ;
    public final long LIZIZ;
    public final List<Long> LIZJ = FII.LIZ();

    public final boolean LIZ() {
        if (this.LIZJ.isEmpty()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<Long> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            o.LJIIIIZZ(next, "each.next()");
            if (currentTimeMillis - next.longValue() > this.LIZ * 1000) {
                it.remove();
            }
        }
        if (this.LIZJ.size() < this.LIZIZ) {
            return false;
        }
        return true;
    }

    public C31040CGe(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
