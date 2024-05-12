package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0mU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17540mU {
    public final String LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final C34331Wj LJFF;
    public final long LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;

    public final int hashCode() {
        return C16880lQ.LLJILJIL(this.LJIIIIZZ) + ((C06540Nm.LIZ(this.LJI, (this.LJFF.hashCode() + C47959Irz.LIZIZ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, C47959Irz.LIZIZ(this.LIZJ, C47959Irz.LIZIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31), 31)) * 31, 31) + this.LJII) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17540mU)) {
            return false;
        }
        C17540mU c17540mU = (C17540mU) obj;
        if (o.LJ(this.LIZ, c17540mU.LIZ) && C23390vv.LIZJ(this.LIZIZ, c17540mU.LIZIZ) && C23390vv.LIZJ(this.LIZJ, c17540mU.LIZJ) && this.LIZLLL == c17540mU.LIZLLL && this.LJ == c17540mU.LJ && o.LJ(this.LJFF, c17540mU.LJFF) && C11850dJ.LIZJ(this.LJI, c17540mU.LJI) && this.LJII == c17540mU.LJII && this.LJIIIIZZ == c17540mU.LJIIIIZZ) {
            return true;
        }
        return false;
    }

    public C17540mU(String str, float f, float f2, float f3, float f4, C34331Wj c34331Wj, long j, int i, boolean z) {
        this.LIZ = str;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = c34331Wj;
        this.LJI = j;
        this.LJII = i;
        this.LJIIIIZZ = z;
    }
}
