package X;

/* renamed from: X.0SD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SD {
    public static final C0SD LJI;
    public static final C0SD LJII;
    public final boolean LIZ;
    public final long LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    static {
        long j = C23430vz.LIZJ;
        LJI = new C0SD(false, j, Float.NaN, Float.NaN, true, false);
        LJII = new C0SD(true, j, Float.NaN, Float.NaN, true, false);
    }

    public final int hashCode() {
        return C16880lQ.LLJILJIL(this.LJFF) + C07250Qf.LIZ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, C47959Irz.LIZIZ(this.LIZJ, JBR.LIZJ(this.LIZIZ, C16880lQ.LLJILJIL(this.LIZ) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        if (this.LIZ) {
            return "MagnifierStyle.TextDefault";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MagnifierStyle(size=");
        LIZ.append((Object) C23430vz.LIZJ(this.LIZIZ));
        LIZ.append(", cornerRadius=");
        C0SV.LIZ(this.LIZJ, LIZ, ", elevation=");
        C0SV.LIZ(this.LIZLLL, LIZ, ", clippingEnabled=");
        LIZ.append(this.LJ);
        LIZ.append(", fishEyeEnabled=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SD)) {
            return false;
        }
        C0SD c0sd = (C0SD) obj;
        if (this.LIZ == c0sd.LIZ && this.LIZIZ == c0sd.LIZIZ && C23390vv.LIZJ(this.LIZJ, c0sd.LIZJ) && C23390vv.LIZJ(this.LIZLLL, c0sd.LIZLLL) && this.LJ == c0sd.LJ && this.LJFF == c0sd.LJFF) {
            return true;
        }
        return false;
    }

    public C0SD(boolean z, long j, float f, float f2, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = z2;
        this.LJFF = z3;
    }
}
