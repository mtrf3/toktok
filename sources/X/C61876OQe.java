package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OQe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61876OQe implements Comparable<C61876OQe> {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final long LJLIL;

    public static int LIZJ(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public final int hashCode() {
        return LIZJ(this.LJLIL);
    }

    public final String toString() {
        long j = this.LJLIL;
        if (j >= 0) {
            C17N.LJIIJ(10);
            String l = Long.toString(j, 10);
            o.LJIIIIZZ(l, "toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder LIZ = X1D.LIZ();
        C17N.LJIIJ(10);
        String l2 = Long.toString(j3, 10);
        o.LJIIIIZZ(l2, "toString(this, checkRadix(radix))");
        LIZ.append(l2);
        C17N.LJIIJ(10);
        String l3 = Long.toString(j4, 10);
        o.LJIIIIZZ(l3, "toString(this, checkRadix(radix))");
        LIZ.append(l3);
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C61876OQe c61876OQe) {
        return o.LJIIL(this.LJLIL ^ Long.MIN_VALUE, c61876OQe.LJLIL ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        long j = this.LJLIL;
        if (!(obj instanceof C61876OQe) || j != ((C61876OQe) obj).LJLIL) {
            return false;
        }
        return true;
    }
}
