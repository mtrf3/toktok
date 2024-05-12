package X;

/* renamed from: X.0vz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23430vz {
    public static final long LIZIZ;
    public static final long LIZJ = C78963Uyt.LIZIZ(Float.NaN, Float.NaN);
    public static final /* synthetic */ int LIZLLL = 0;
    public final long LIZ;

    static {
        float f = 0;
        LIZIZ = C78963Uyt.LIZIZ(f, f);
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        return LIZJ(this.LIZ);
    }

    public static final float LIZ(long j) {
        if (j != LIZJ) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        "DpSize is unspecified".toString();
        throw new IllegalStateException("DpSize is unspecified");
    }

    public static final float LIZIZ(long j) {
        if (j != LIZJ) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        "DpSize is unspecified".toString();
        throw new IllegalStateException("DpSize is unspecified");
    }

    public static String LIZJ(long j) {
        if (j != LIZJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append((Object) C23390vv.LIZLLL(LIZIZ(j)));
            LIZ.append(" x ");
            LIZ.append((Object) C23390vv.LIZLLL(LIZ(j)));
            return X1D.LIZIZ(LIZ);
        }
        return "DpSize.Unspecified";
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C23430vz) || j != ((C23430vz) obj).LIZ) {
            return false;
        }
        return true;
    }
}
