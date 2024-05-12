package X;

import defpackage.b0;

/* loaded from: classes9.dex */
public final class JYC {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JYC)) {
            return false;
        }
        JYC jyc = (JYC) obj;
        return this.LIZ == jyc.LIZ && this.LIZIZ == jyc.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VerticalRange(top=");
        LIZ.append(this.LIZ);
        LIZ.append(", bottom=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public JYC(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = (i + i2) / 2;
    }
}
