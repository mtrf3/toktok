package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Wm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59842Wm {
    public final String LIZ = "";
    public final String LIZIZ = "";
    public final String LIZJ = "";
    public final float LIZLLL = 0.0f;
    public final String LJ = "";
    public final String LJFF = "";
    public final String LJI = "";
    public final String LJII = "";
    public final String LJIIIIZZ = null;
    public final int LJIIIZ = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59842Wm)) {
            return false;
        }
        C59842Wm c59842Wm = (C59842Wm) obj;
        return o.LJ(this.LIZ, c59842Wm.LIZ) && o.LJ(this.LIZIZ, c59842Wm.LIZIZ) && o.LJ(this.LIZJ, c59842Wm.LIZJ) && Float.compare(this.LIZLLL, c59842Wm.LIZLLL) == 0 && o.LJ(this.LJ, c59842Wm.LJ) && o.LJ(this.LJFF, c59842Wm.LJFF) && o.LJ(this.LJI, c59842Wm.LJI) && o.LJ(this.LJII, c59842Wm.LJII) && o.LJ(this.LJIIIIZZ, c59842Wm.LJIIIIZZ) && this.LJIIIZ == c59842Wm.LJIIIZ;
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJII, C79062V1e.LJ(this.LJI, C79062V1e.LJ(this.LJFF, C79062V1e.LJ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        String str = this.LJIIIIZZ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((LJ + hashCode) * 31) + this.LJIIIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextEffectInfo(name='");
        return JBR.LJFF(LIZ, this.LJFF, "')", LIZ);
    }
}
