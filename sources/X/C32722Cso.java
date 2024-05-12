package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Cso, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32722Cso {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32722Cso)) {
            return false;
        }
        C32722Cso c32722Cso = (C32722Cso) obj;
        return o.LJ(this.LIZ, c32722Cso.LIZ) && this.LIZIZ == c32722Cso.LIZIZ && this.LIZJ == c32722Cso.LIZJ && this.LIZLLL == c32722Cso.LIZLLL && this.LJ == c32722Cso.LJ && this.LJFF == c32722Cso.LJFF && this.LJI == c32722Cso.LJI && this.LJII == c32722Cso.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31;
        boolean z = this.LJII;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BasicInfo(from=");
        LIZ.append(this.LIZ);
        LIZ.append(", status=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isFromCache=");
        LIZ.append(this.LIZJ);
        LIZ.append(", loadingViewCount=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", firstScreenCount=");
        LIZ.append(this.LJ);
        LIZ.append(", firstScreenSuccessCount=");
        LIZ.append(this.LJFF);
        LIZ.append(", firstScreenCacheCount=");
        LIZ.append(this.LJI);
        LIZ.append(", isLandscapeMode=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public C32722Cso(String from, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        o.LJIIIZ(from, "from");
        this.LIZ = from;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = i5;
        this.LJI = i6;
        this.LJII = z;
    }
}
