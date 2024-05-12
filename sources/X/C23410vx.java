package X;

/* renamed from: X.0vx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23410vx {
    public static final long LIZIZ;
    public static final /* synthetic */ int LIZJ = 0;
    public final long LIZ;

    static {
        float f = 0;
        C78963Uyt.LIZ(f, f);
        LIZIZ = C78963Uyt.LIZ(Float.NaN, Float.NaN);
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        long j = this.LIZ;
        if (j != LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('(');
            LIZ.append((Object) C23390vv.LIZLLL(LIZ(j)));
            LIZ.append(", ");
            LIZ.append((Object) C23390vv.LIZLLL(LIZIZ(j)));
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }
        return "DpOffset.Unspecified";
    }

    public static final float LIZ(long j) {
        if (j != LIZIZ) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        "DpOffset is unspecified".toString();
        throw new IllegalStateException("DpOffset is unspecified");
    }

    public static final float LIZIZ(long j) {
        if (j != LIZIZ) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        "DpOffset is unspecified".toString();
        throw new IllegalStateException("DpOffset is unspecified");
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C23410vx) || j != ((C23410vx) obj).LIZ) {
            return false;
        }
        return true;
    }
}
