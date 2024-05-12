package X;

import defpackage.b0;

/* loaded from: classes5.dex */
public final class AIA {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIA)) {
            return false;
        }
        AIA aia = (AIA) obj;
        return this.LIZ == aia.LIZ && this.LIZIZ == aia.LIZIZ && this.LIZJ == aia.LIZJ && this.LIZLLL == aia.LIZLLL && this.LJ == aia.LJ && this.LJFF == aia.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextColor(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", destructiveTitle=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", subtitle=");
        LIZ.append(this.LIZJ);
        LIZ.append(", icon=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", destructiveIcon=");
        LIZ.append(this.LJ);
        LIZ.append(", disable=");
        return b0.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public AIA(int i, int i2, int i3, int i4, int i5, int i6) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = i6;
    }
}
