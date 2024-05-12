package X;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.o;

/* renamed from: X.Ea9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36661Ea9 extends AbstractC65755PrL {
    @Override // X.AbstractC65755PrL
    public final Random LIZ() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        o.LJIIIIZZ(current, "current()");
        return current;
    }

    @Override // X.V0Q
    public final double nextDouble(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    @Override // X.V0Q
    public final long nextLong(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // X.V0Q
    public final int nextInt(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // X.V0Q
    public final long nextLong(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
