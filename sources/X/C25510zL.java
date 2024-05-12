package X;

/* renamed from: X.0zL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25510zL {
    public final int LIZ;
    public int LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public int LJ = 1;
    public int LJFF;

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZLLL);
        LIZ.append(",");
        LIZ.append(this.LIZ);
        LIZ.append(",");
        LIZ.append(this.LJ);
        LIZ.append(",");
        LIZ.append(this.LIZIZ);
        LIZ.append(",");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C25510zL) {
            C25510zL c25510zL = (C25510zL) obj;
            if (c25510zL.LIZ == this.LIZ && c25510zL.LIZLLL == this.LIZLLL) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C25510zL(int i, int i2, long j, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZLLL = i3;
        this.LIZJ = j;
    }
}
