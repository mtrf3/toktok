package X;

/* renamed from: X.UNl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77093UNl {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public int LJFF;
    public boolean LJI;

    public C77093UNl() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77093UNl)) {
            return false;
        }
        C77093UNl c77093UNl = (C77093UNl) obj;
        return this.LIZ == c77093UNl.LIZ && this.LIZIZ == c77093UNl.LIZIZ && this.LIZJ == c77093UNl.LIZJ && this.LIZLLL == c77093UNl.LIZLLL && this.LJ == c77093UNl.LJ && this.LJFF == c77093UNl.LJFF && this.LJI == c77093UNl.LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = ((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        boolean z = this.LJ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return ((((i + i2) * 31) + this.LJFF) * 31) + (this.LJI ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(singleScreenLayoutId=");
        LIZ.append(this.LIZ);
        LIZ.append(", dualScreenStartLayoutId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", dualScreenEndLayoutId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", dualPortraitSingleLayoutId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isDualPortraitSingleContainer=");
        LIZ.append(this.LJ);
        LIZ.append(", dualLandscapeSingleLayoutId=");
        LIZ.append(this.LJFF);
        LIZ.append(", isDualLandscapeSingleContainer=");
        return C48339Iy7.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    public C77093UNl(int i) {
        this.LIZ = -1;
        this.LIZIZ = -1;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJ = false;
        this.LJFF = -1;
        this.LJI = false;
    }
}
