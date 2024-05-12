package X;

/* renamed from: X.0av, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10370av {
    public static final long LIZIZ = C78923UyF.LIZ(0.0f, 0.0f);
    public static final long LIZJ = C78923UyF.LIZ(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final long LIZLLL = C78923UyF.LIZ(Float.NaN, Float.NaN);
    public static final /* synthetic */ int LJ = 0;
    public final long LIZ;

    public static final boolean LIZIZ(long j, long j2) {
        return j == j2;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        return LJIIIIZZ(this.LIZ);
    }

    public /* synthetic */ C10370av(long j) {
        this.LIZ = j;
    }

    public static final float LIZJ(long j) {
        return (float) Math.sqrt((LJ(j) * LJ(j)) + (LIZLLL(j) * LIZLLL(j)));
    }

    public static final float LIZLLL(long j) {
        if (j != LIZLLL) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        "Offset is unspecified".toString();
        throw new IllegalStateException("Offset is unspecified");
    }

    public static final float LJ(long j) {
        if (j != LIZLLL) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        "Offset is unspecified".toString();
        throw new IllegalStateException("Offset is unspecified");
    }

    public static String LJIIIIZZ(long j) {
        if (C78923UyF.LJIILL(j)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Offset(");
            LIZ.append(C87277YNd.LJJJJIZL(LIZLLL(j)));
            LIZ.append(", ");
            LIZ.append(C87277YNd.LJJJJIZL(LJ(j)));
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }
        return "Offset.Unspecified";
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C10370av) || j != ((C10370av) obj).LIZ) {
            return false;
        }
        return true;
    }

    public static long LIZ(long j, int i) {
        float f;
        float f2 = 0.0f;
        if ((i & 1) != 0) {
            f = LIZLLL(j);
        } else {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = LJ(j);
        }
        return C78923UyF.LIZ(f, f2);
    }

    public static final long LJFF(long j, long j2) {
        return C78923UyF.LIZ(LIZLLL(j) - LIZLLL(j2), LJ(j) - LJ(j2));
    }

    public static final long LJI(long j, long j2) {
        return C78923UyF.LIZ(LIZLLL(j2) + LIZLLL(j), LJ(j2) + LJ(j));
    }

    public static final long LJII(float f, long j) {
        return C78923UyF.LIZ(LIZLLL(j) * f, LJ(j) * f);
    }
}
