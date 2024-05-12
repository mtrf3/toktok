package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K72 implements Comparable<K72> {
    public static final long LJLIL = C30581Hy.LJIIL(4611686018427387903L);
    public static final long LJLILLLLZI = C30581Hy.LJIIL(-4611686018427387903L);
    public static final /* synthetic */ int LJLJI = 0;

    public final int hashCode() {
        return (int) 0;
    }

    public final String toString() {
        return "0s";
    }

    public static int LIZLLL(long j) {
        long j2 = j ^ 0;
        if (j2 < 0 || (((int) j2) & 1) == 0) {
            return o.LJIIL(j, 0L);
        }
        int i = (((int) j) & 1) - (((int) 0) & 1);
        if (j < 0) {
            return -i;
        }
        return i;
    }

    public static final long LJ(long j) {
        if ((((int) j) & 1) == 1 && (!LJFF(j))) {
            return j >> 1;
        }
        return LJI(j, K74.MILLISECONDS);
    }

    public static final boolean LJFF(long j) {
        if (j == LJLIL || j == LJLILLLLZI) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(K72 k72) {
        k72.getClass();
        return LIZLLL(0L);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof K72)) {
            return false;
        }
        obj.getClass();
        return true;
    }

    public static final long LIZJ(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (new UIW(-4611686018426L, 4611686018426L).LJIIIZ(j5)) {
            return ((j5 * j3) + (j2 - (j4 * j3))) << 1;
        }
        return C30581Hy.LJIIL(C78842Uww.LJIILIIL(j5, -4611686018427387903L, 4611686018427387903L));
    }

    public static final long LJI(long j, K74 unit) {
        K74 sourceUnit;
        o.LJIIIZ(unit, "unit");
        if (j == LJLIL) {
            return Long.MAX_VALUE;
        }
        if (j == LJLILLLLZI) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            sourceUnit = K74.NANOSECONDS;
        } else {
            sourceUnit = K74.MILLISECONDS;
        }
        o.LJIIIZ(sourceUnit, "sourceUnit");
        return unit.getTimeUnit$kotlin_stdlib().convert(j2, sourceUnit.getTimeUnit$kotlin_stdlib());
    }
}
