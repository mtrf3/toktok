package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HJU {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final float LJI;
    public final int LJII;
    public final int LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HJU)) {
            return false;
        }
        HJU hju = (HJU) obj;
        return o.LJ(this.LIZ, hju.LIZ) && o.LJ(this.LIZIZ, hju.LIZIZ) && this.LIZJ == hju.LIZJ && this.LIZLLL == hju.LIZLLL && this.LJ == hju.LJ && this.LJFF == hju.LJFF && Float.compare(this.LJI, hju.LJI) == 0 && this.LJII == hju.LJII && this.LJIIIIZZ == hju.LJIIIIZZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((C47959Irz.LIZIZ(this.LJI, (((((((LJ + i) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31, 31) + this.LJII) * 31) + this.LJIIIIZZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CompressMediaData(srcPath=");
        LIZ.append(this.LIZ);
        LIZ.append(", dstPath=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isVideoType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", duration=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", startTime=");
        LIZ.append(this.LJ);
        LIZ.append(", endTime=");
        LIZ.append(this.LJFF);
        LIZ.append(", speed=");
        LIZ.append(this.LJI);
        LIZ.append(", width=");
        LIZ.append(this.LJII);
        LIZ.append(", height=");
        return b0.LIZJ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public HJU(String str, String dstPath, boolean z, int i, int i2, int i3, float f, int i4, int i5) {
        o.LJIIIZ(dstPath, "dstPath");
        this.LIZ = str;
        this.LIZIZ = dstPath;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = f;
        this.LJII = i4;
        this.LJIIIIZZ = i5;
    }
}
