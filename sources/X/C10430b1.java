package X;

/* renamed from: X.0b1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10430b1 {
    public static final long LIZIZ = C1DF.LIZIZ(0.0f, 0.0f);
    public static final long LIZJ = C1DF.LIZIZ(Float.NaN, Float.NaN);
    public static final /* synthetic */ int LIZLLL = 0;
    public final long LIZ;

    public static final boolean LIZ(long j, long j2) {
        return j == j2;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        return LJFF(this.LIZ);
    }

    public /* synthetic */ C10430b1(long j) {
        this.LIZ = j;
    }

    public static final float LIZIZ(long j) {
        if (j != LIZJ) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        "Size is unspecified".toString();
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float LIZJ(long j) {
        return Math.min(Math.abs(LIZLLL(j)), Math.abs(LIZIZ(j)));
    }

    public static final float LIZLLL(long j) {
        if (j != LIZJ) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        "Size is unspecified".toString();
        throw new IllegalStateException("Size is unspecified");
    }

    public static final boolean LJ(long j) {
        if (LIZLLL(j) <= 0.0f || LIZIZ(j) <= 0.0f) {
            return true;
        }
        return false;
    }

    public static String LJFF(long j) {
        if (j != LIZJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Size(");
            LIZ.append(C87277YNd.LJJJJIZL(LIZLLL(j)));
            LIZ.append(", ");
            LIZ.append(C87277YNd.LJJJJIZL(LIZIZ(j)));
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }
        return "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C10430b1) || j != ((C10430b1) obj).LIZ) {
            return false;
        }
        return true;
    }
}
