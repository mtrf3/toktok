package X;

/* loaded from: classes10.dex */
public final class MLE {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final boolean LJFF;

    public MLE() {
        this(false, false, false, false, false, 63);
    }

    public MLE(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        int i2;
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        if ((i & 16) != 0) {
            i2 = 300;
        } else {
            i2 = 0;
        }
        z5 = (i & 32) != 0 ? false : z5;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = i2;
        this.LJFF = z5;
    }
}
