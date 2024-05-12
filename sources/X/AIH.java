package X;

import defpackage.b0;

/* loaded from: classes5.dex */
public final class AIH {
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
        if (!(obj instanceof AIH)) {
            return false;
        }
        AIH aih = (AIH) obj;
        return this.LIZ == aih.LIZ && this.LIZIZ == aih.LIZIZ && this.LIZJ == aih.LIZJ && this.LIZLLL == aih.LIZLLL && this.LJ == aih.LJ && this.LJFF == aih.LJFF;
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

    public AIH(int i, int i2, int i3, int i4, int i5, int i6) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = i6;
    }
}
