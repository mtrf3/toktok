package X;

import kotlin.jvm.internal.o;

/* renamed from: X.RlD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70471RlD {
    public final int LIZ;
    public final Integer LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;
    public final int LJ;
    public final float LJFF;
    public final int LJI;
    public final Integer LJII;
    public final float LJIIIIZZ;
    public final int LJIIIZ;
    public final float LJIIJ;

    public C70471RlD() {
        this(null, null, 0, 0.0f, null, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70471RlD)) {
            return false;
        }
        C70471RlD c70471RlD = (C70471RlD) obj;
        return this.LIZ == c70471RlD.LIZ && o.LJ(this.LIZIZ, c70471RlD.LIZIZ) && this.LIZJ == c70471RlD.LIZJ && o.LJ(this.LIZLLL, c70471RlD.LIZLLL) && this.LJ == c70471RlD.LJ && Float.compare(this.LJFF, c70471RlD.LJFF) == 0 && this.LJI == c70471RlD.LJI && o.LJ(this.LJII, c70471RlD.LJII) && Float.compare(this.LJIIIIZZ, c70471RlD.LJIIIIZZ) == 0 && this.LJIIIZ == c70471RlD.LJIIIZ && Float.compare(this.LJIIJ, c70471RlD.LJIIJ) == 0;
    }

    public final String toString() {
        return "BackgroundConfig(solidColor=" + this.LIZ + ", solidColorRes=" + this.LIZIZ + ", strokeColor=" + this.LIZJ + ", strokeColorRes=" + this.LIZLLL + ", strokeWidth=" + this.LJ + ", radius=" + this.LJFF + ", dashColor=" + this.LJI + ", dashColorRes=" + this.LJII + ", dashGap=" + this.LJIIIIZZ + ", dashHeight=" + this.LJIIIZ + ", dashWidth=" + this.LJIIJ + ')';
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = this.LIZ * 31;
        Integer num = this.LIZIZ;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i3 = (((i + hashCode) * 31) + this.LIZJ) * 31;
        Integer num2 = this.LIZLLL;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int LIZIZ = (C47959Irz.LIZIZ(this.LJFF, (((i3 + hashCode2) * 31) + this.LJ) * 31, 31) + this.LJI) * 31;
        Integer num3 = this.LJII;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        return Float.floatToIntBits(this.LJIIJ) + ((C47959Irz.LIZIZ(this.LJIIIIZZ, (LIZIZ + i2) * 31, 31) + this.LJIIIZ) * 31);
    }

    public C70471RlD(Integer num, Integer num2, int i, float f, Integer num3, int i2) {
        int i3;
        int i4;
        float f2;
        if ((i2 & 1) != 0) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        num = (i2 & 2) != 0 ? null : num;
        if ((i2 & 4) != 0) {
            i4 = -1;
        } else {
            i4 = 0;
        }
        num2 = (i2 & 8) != 0 ? null : num2;
        i = (i2 & 16) != 0 ? -1 : i;
        f = (i2 & 32) != 0 ? -1.0f : f;
        int i5 = (i2 & 64) == 0 ? 0 : -1;
        num3 = (i2 & 128) != 0 ? null : num3;
        if ((i2 & 256) != 0) {
            f2 = C45804HyK.LJJ(4);
        } else {
            f2 = 0.0f;
        }
        int LJJ = (i2 & 512) != 0 ? (int) C45804HyK.LJJ(1) : 0;
        float LJJ2 = (i2 & 1024) != 0 ? C45804HyK.LJJ(2) : 0.0f;
        this.LIZ = i3;
        this.LIZIZ = num;
        this.LIZJ = i4;
        this.LIZLLL = num2;
        this.LJ = i;
        this.LJFF = f;
        this.LJI = i5;
        this.LJII = num3;
        this.LJIIIIZZ = f2;
        this.LJIIIZ = LJJ;
        this.LJIIJ = LJJ2;
    }
}
