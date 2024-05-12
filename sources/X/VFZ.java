package X;

/* loaded from: classes15.dex */
public final class VFZ {
    public final int LIZ;
    public final C79422VFa LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;

    public final void LIZ() {
        C79422VFa c79422VFa = this.LIZIZ;
        if (c79422VFa != null) {
            c79422VFa.LIZIZ(this);
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[manager:");
        LIZ.append(this.LIZIZ);
        LIZ.append(",");
        LIZ.append(this.LIZ);
        LIZ.append(",");
        LIZ.append(this.LJ);
        LIZ.append(",");
        LIZ.append(this.LIZJ);
        LIZ.append(",");
        LIZ.append(this.LIZLLL);
        LIZ.append(",");
        LIZ.append(this.LJFF);
        LIZ.append(",");
        LIZ.append(this.LJI);
        LIZ.append(",");
        return C08380Uo.LIZ(LIZ, this.LJII, "]", LIZ);
    }

    public VFZ(C79422VFa c79422VFa, int i, int i2, int i3, int i4) {
        this.LIZIZ = c79422VFa;
        this.LIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
    }

    public VFZ(C79422VFa c79422VFa, int i, int i2, int i3, int i4, int i5) {
        this(c79422VFa, i, i2, i3, 3553);
        this.LJFF = i4;
        this.LJI = 6408;
        this.LJII = i5;
    }
}
