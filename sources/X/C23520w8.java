package X;

/* renamed from: X.0w8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23520w8 {
    public static final C23540wA[] LIZIZ = {new C23540wA(0), new C23540wA(4294967296L), new C23540wA(8589934592L)};
    public static final long LIZJ = C79043V0l.LJIJ(Float.NaN, 0);
    public final long LIZ;

    public static final boolean LIZ(long j, long j2) {
        return j == j2;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        return LIZLLL(this.LIZ);
    }

    public static final long LIZIZ(long j) {
        return LIZIZ[(int) ((j & 1095216660480L) >>> 32)].LIZ;
    }

    public static final float LIZJ(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String LIZLLL(long j) {
        long LIZIZ2 = LIZIZ(j);
        if (C23540wA.LIZ(LIZIZ2, 0L)) {
            return "Unspecified";
        }
        if (C23540wA.LIZ(LIZIZ2, 4294967296L)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LIZJ(j));
            LIZ.append(".sp");
            return X1D.LIZIZ(LIZ);
        }
        if (C23540wA.LIZ(LIZIZ2, 8589934592L)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZJ(j));
            LIZ2.append(".em");
            return X1D.LIZIZ(LIZ2);
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C23520w8) || j != ((C23520w8) obj).LIZ) {
            return false;
        }
        return true;
    }
}
