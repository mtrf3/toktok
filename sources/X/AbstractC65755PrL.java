package X;

import java.util.Random;
import kotlin.jvm.internal.o;

/* renamed from: X.PrL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65755PrL extends V0Q {
    public abstract Random LIZ();

    @Override // X.V0Q
    public final boolean nextBoolean() {
        return LIZ().nextBoolean();
    }

    @Override // X.V0Q
    public final double nextDouble() {
        return LIZ().nextDouble();
    }

    @Override // X.V0Q
    public final float nextFloat() {
        return LIZ().nextFloat();
    }

    @Override // X.V0Q
    public final int nextInt() {
        return LIZ().nextInt();
    }

    @Override // X.V0Q
    public final long nextLong() {
        return LIZ().nextLong();
    }

    @Override // X.V0Q
    public final int nextBits(int i) {
        return ((-i) >> 31) & (LIZ().nextInt() >>> (32 - i));
    }

    @Override // X.V0Q
    public final byte[] nextBytes(byte[] array) {
        o.LJIIIZ(array, "array");
        LIZ().nextBytes(array);
        return array;
    }

    @Override // X.V0Q
    public final int nextInt(int i) {
        return LIZ().nextInt(i);
    }
}
