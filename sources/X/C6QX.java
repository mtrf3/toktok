package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.6QX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6QX {
    public final Boolean LIZ;
    public final Integer LIZIZ;
    public final Boolean LIZJ;
    public final Boolean LIZLLL;
    public final Boolean LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;

    public C6QX() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6QX)) {
            return false;
        }
        C6QX c6qx = (C6QX) obj;
        return o.LJ(this.LIZ, c6qx.LIZ) && o.LJ(this.LIZIZ, c6qx.LIZIZ) && o.LJ(this.LIZJ, c6qx.LIZJ) && o.LJ(this.LIZLLL, c6qx.LIZLLL) && o.LJ(this.LJ, c6qx.LJ) && this.LJFF == c6qx.LJFF && this.LJI == c6qx.LJI && this.LJII == c6qx.LJII && this.LJIIIIZZ == c6qx.LJIIIIZZ;
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.LIZIZ;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.LJ;
        return ((((((((hashCode4 + (bool4 != null ? bool4.hashCode() : 0)) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerDeleteModel(visible=");
        LIZ.append(this.LIZ);
        LIZ.append(", status=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", bgVisible=");
        LIZ.append(this.LIZJ);
        LIZ.append(", textVisible=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", coverOpen=");
        LIZ.append(this.LJ);
        LIZ.append(", left=");
        LIZ.append(this.LJFF);
        LIZ.append(", top=");
        LIZ.append(this.LJI);
        LIZ.append(", width=");
        LIZ.append(this.LJII);
        LIZ.append(", height=");
        return b0.LIZJ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public /* synthetic */ C6QX(int i) {
        this(null, null, null, null, null, 0, 0, 0, 0);
    }

    public C6QX(Boolean bool, Integer num, Boolean bool2, Boolean bool3, Boolean bool4, int i, int i2, int i3, int i4) {
        this.LIZ = bool;
        this.LIZIZ = num;
        this.LIZJ = bool2;
        this.LIZLLL = bool3;
        this.LJ = bool4;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = i3;
        this.LJIIIIZZ = i4;
    }

    public static C6QX LIZ(C6QX c6qx, Boolean bool, Integer num, Boolean bool2, Boolean bool3, Boolean bool4, int i, int i2, int i3, int i4, int i5) {
        int i6 = i4;
        int i7 = i3;
        int i8 = i2;
        Integer num2 = num;
        Boolean bool5 = bool;
        Boolean bool6 = bool2;
        Boolean bool7 = bool3;
        Boolean bool8 = bool4;
        int i9 = i;
        if ((i5 & 1) != 0) {
            bool5 = c6qx.LIZ;
        }
        if ((i5 & 2) != 0) {
            num2 = c6qx.LIZIZ;
        }
        if ((i5 & 4) != 0) {
            bool6 = c6qx.LIZJ;
        }
        if ((i5 & 8) != 0) {
            bool7 = c6qx.LIZLLL;
        }
        if ((i5 & 16) != 0) {
            bool8 = c6qx.LJ;
        }
        if ((i5 & 32) != 0) {
            i9 = c6qx.LJFF;
        }
        if ((i5 & 64) != 0) {
            i8 = c6qx.LJI;
        }
        if ((i5 & 128) != 0) {
            i7 = c6qx.LJII;
        }
        if ((i5 & 256) != 0) {
            i6 = c6qx.LJIIIIZZ;
        }
        c6qx.getClass();
        return new C6QX(bool5, num2, bool6, bool7, bool8, i9, i8, i7, i6);
    }
}
