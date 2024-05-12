package X;

/* renamed from: X.BHr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28531BHr {
    public int LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public boolean LJFF;

    public C28531BHr() {
        this(0);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZJ) * 31) + this.LJ;
    }

    public /* synthetic */ C28531BHr(int i) {
        this(3, false, false, false, 3, 3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C28531BHr)) {
            return false;
        }
        C28531BHr c28531BHr = (C28531BHr) obj;
        if (this.LIZ != c28531BHr.LIZ || this.LIZJ != c28531BHr.LIZJ || this.LJ != c28531BHr.LJ) {
            return false;
        }
        return true;
    }

    public C28531BHr(int i, boolean z, boolean z2, boolean z3, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = i2;
        this.LIZLLL = z2;
        this.LJ = i3;
        this.LJFF = z3;
    }
}
