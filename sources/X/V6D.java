package X;

/* loaded from: classes14.dex */
public final class V6D {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V6D)) {
            return false;
        }
        V6D v6d = (V6D) obj;
        return C23390vv.LIZJ(this.LIZ, v6d.LIZ) && C23390vv.LIZJ(this.LIZIZ, v6d.LIZIZ) && C23390vv.LIZJ(this.LIZJ, v6d.LIZJ) && C23390vv.LIZJ(this.LIZLLL, v6d.LIZLLL);
    }

    static {
        new V6D(0.0f, 0.0f, 15);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZLLL) + C47959Irz.LIZIZ(this.LIZJ, C47959Irz.LIZIZ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DelegateRect(left=");
        C0SV.LIZ(this.LIZ, LIZ, ", top=");
        C0SV.LIZ(this.LIZIZ, LIZ, ", right=");
        C0SV.LIZ(this.LIZJ, LIZ, ", bottom=");
        LIZ.append((Object) C23390vv.LIZLLL(this.LIZLLL));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public V6D(float f, float f2, int i) {
        float f3;
        if ((i & 1) != 0) {
            f3 = 0;
        } else {
            f3 = 0.0f;
        }
        f = (i & 2) != 0 ? 0 : f;
        float f4 = (i & 4) != 0 ? 0 : 0.0f;
        f2 = (i & 8) != 0 ? 0 : f2;
        this.LIZ = f3;
        this.LIZIZ = f;
        this.LIZJ = f4;
        this.LIZLLL = f2;
    }
}
