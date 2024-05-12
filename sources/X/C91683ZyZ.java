package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ZyZ, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91683ZyZ {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;

    public final int hashCode() {
        int hashCode;
        int i = (((((this.LIZ ? 1 : 0) * 31) + (this.LIZIZ ? 1 : 0)) * 31) + this.LIZJ) * 31;
        String str = this.LJIIIZ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((((((((i + hashCode) * 31) + (this.LIZLLL ? 1 : 0)) * 31) + (this.LJ ? 1 : 0)) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(C91683ZyZ.class, obj.getClass())) {
            return false;
        }
        C91683ZyZ c91683ZyZ = (C91683ZyZ) obj;
        if (this.LIZ == c91683ZyZ.LIZ && this.LIZIZ == c91683ZyZ.LIZIZ && this.LIZJ == c91683ZyZ.LIZJ && o.LJ(this.LJIIIZ, c91683ZyZ.LJIIIZ) && this.LIZLLL == c91683ZyZ.LIZLLL && this.LJ == c91683ZyZ.LJ && this.LJFF == c91683ZyZ.LJFF && this.LJI == c91683ZyZ.LJI && this.LJII == c91683ZyZ.LJII && this.LJIIIIZZ == c91683ZyZ.LJIIIIZZ) {
            return true;
        }
        return false;
    }

    public C91683ZyZ(int i, int i2, int i3, int i4, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this(z, z2, C91718Zz8.LIZ(str).hashCode(), z3, z4, i, i2, i3, i4);
        this.LJIIIZ = str;
    }

    public C91683ZyZ(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = i;
        this.LIZLLL = z3;
        this.LJ = z4;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = i4;
        this.LJIIIIZZ = i5;
    }
}
