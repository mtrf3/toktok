package X;

/* renamed from: X.0w5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23490w5 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final long LIZ;

    static {
        new Object() { // from class: X.0w4
        };
    }

    public static final boolean LIZ(long j, long j2) {
        return j == j2;
    }

    public static final int LIZIZ(long j) {
        return (int) (j & 4294967295L);
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        return LIZJ(this.LIZ);
    }

    public static String LIZJ(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((int) (j >> 32));
        LIZ.append(" x ");
        LIZ.append(LIZIZ(j));
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C23490w5) || j != ((C23490w5) obj).LIZ) {
            return false;
        }
        return true;
    }
}
