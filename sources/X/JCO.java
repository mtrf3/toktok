package X;

/* loaded from: classes9.dex */
public final class JCO {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JCO)) {
            return false;
        }
        JCO jco = (JCO) obj;
        return this.LIZ == jco.LIZ && this.LIZIZ == jco.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DisplayMetric(width=");
        LIZ.append(this.LIZ);
        LIZ.append(", height=");
        return C08380Uo.LIZ(LIZ, this.LIZIZ, ")", LIZ);
    }

    public JCO(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
