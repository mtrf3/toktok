package X;

/* renamed from: X.0w1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23450w1 {
    public static final long LIZIZ;
    public static final /* synthetic */ int LIZJ = 0;
    public final long LIZ;

    public static final boolean LIZIZ(long j, long j2) {
        return j == j2;
    }

    public static final int LIZJ(long j) {
        return (int) (j & 4294967295L);
    }

    static {
        new Object() { // from class: X.0w0
        };
        LIZIZ = C78939UyV.LIZ(0, 0);
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        return LIZLLL(this.LIZ);
    }

    public /* synthetic */ C23450w1(long j) {
        this.LIZ = j;
    }

    public static String LIZLLL(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('(');
        LIZ.append((int) (j >> 32));
        LIZ.append(", ");
        LIZ.append(LIZJ(j));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C23450w1) || j != ((C23450w1) obj).LIZ) {
            return false;
        }
        return true;
    }

    public static long LIZ(long j, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = LIZJ(j);
        }
        return C78939UyV.LIZ(i, i2);
    }
}
