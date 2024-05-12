package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V63 {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final C08370Un LIZLLL;
    public final float LJ;
    public final float LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V63)) {
            return false;
        }
        V63 v63 = (V63) obj;
        return C23390vv.LIZJ(this.LIZ, v63.LIZ) && C23390vv.LIZJ(this.LIZIZ, v63.LIZIZ) && C23390vv.LIZJ(this.LIZJ, v63.LIZJ) && o.LJ(this.LIZLLL, v63.LIZLLL) && C23390vv.LIZJ(this.LJ, v63.LJ) && C23390vv.LIZJ(this.LJFF, v63.LJFF);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LJFF) + C47959Irz.LIZIZ(this.LJ, C67981Qm9.LIZ(this.LIZLLL, C47959Irz.LIZIZ(this.LIZJ, C47959Irz.LIZIZ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TuxButtonSizeScheme(minWidthDp=");
        C0SV.LIZ(this.LIZ, LIZ, ", maxWidthDp=");
        C0SV.LIZ(this.LIZIZ, LIZ, ", minHeightDp=");
        C0SV.LIZ(this.LIZJ, LIZ, ", tuxFont=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", iconWidthDp=");
        C0SV.LIZ(this.LJ, LIZ, ", iconHeightDp=");
        LIZ.append((Object) C23390vv.LIZLLL(this.LJFF));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public V63(float f, float f2, float f3, C08370Un c08370Un, float f4, float f5) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = c08370Un;
        this.LJ = f4;
        this.LJFF = f5;
    }
}
