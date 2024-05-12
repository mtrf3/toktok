package X;

/* renamed from: X.Pnn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65535Pnn<E> {
    public static int LIZ(int i, int i2) {
        if (i2 >= 0) {
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1) << 1;
                if (highestOneBit < 0) {
                    return Integer.MAX_VALUE;
                }
                return highestOneBit;
            }
            return i3;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }
}
