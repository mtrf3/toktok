package X;

/* loaded from: classes6.dex */
public final class CXP {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL = -1;

    public final int hashCode() {
        return ((((((629 + this.LIZ) * 37) + this.LIZIZ) * 37) + this.LIZJ) * 37) + this.LIZLLL;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CXP)) {
            return false;
        }
        CXP cxp = (CXP) obj;
        if (this.LIZIZ != cxp.LIZIZ || this.LIZJ != cxp.LIZJ || this.LIZ != cxp.LIZ || this.LIZLLL != cxp.LIZLLL) {
            return false;
        }
        return true;
    }

    public CXP(int i, int i2, int i3) {
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZ = i;
    }
}
