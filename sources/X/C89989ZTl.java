package X;

/* renamed from: X.ZTl, reason: case insensitive filesystem */
/* loaded from: classes19.dex */
public final class C89989ZTl {
    public int LIZ;
    public byte[] LIZIZ;
    public int[] LIZJ;
    public long LIZLLL;
    public long LJ;
    public boolean LJFF;
    public boolean LJI;

    public final boolean LIZ() {
        int i = this.LIZ;
        if (i == 17) {
            int[] iArr = this.LIZJ;
            if (iArr != null && iArr.length == 3) {
                return true;
            }
            return false;
        }
        if (i == 16 || i == 14 || i == 15) {
            int[] iArr2 = this.LIZJ;
            if (iArr2 != null && iArr2.length > 0) {
                return true;
            }
            return false;
        }
        if (this.LIZIZ != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Format: ");
        LIZ.append(this.LIZ);
        LIZ.append("; PTS: ");
        LIZ.append(this.LIZLLL);
        LIZ.append("; DTS: ");
        LIZ.append(this.LJ);
        LIZ.append("; isEOF: ");
        LIZ.append(this.LJI);
        LIZ.append("; isKeyFrame: ");
        LIZ.append(this.LJFF);
        return X1D.LIZIZ(LIZ);
    }
}
