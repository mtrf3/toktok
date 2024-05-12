package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HI4 {

    @GPV
    public String LIZ;

    @GPV
    public String LIZIZ;

    @GPV
    public boolean LIZJ;

    @GPV
    public int LIZLLL;

    @GPV
    public String LJ;

    @GPV
    public String LJFF;

    @GPV
    public int LJI;

    @GPV
    public boolean LJII;

    public HI4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HI4)) {
            return false;
        }
        HI4 hi4 = (HI4) obj;
        return o.LJ(this.LIZ, hi4.LIZ) && o.LJ(this.LIZIZ, hi4.LIZIZ) && this.LIZJ == hi4.LIZJ && this.LIZLLL == hi4.LIZLLL && o.LJ(this.LJ, hi4.LJ) && o.LJ(this.LJFF, hi4.LJFF) && this.LJI == hi4.LJI && this.LJII == hi4.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode2 + i) * 31) + this.LIZLLL) * 31;
        String str3 = this.LJ;
        int hashCode3 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        return ((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.LJI) * 31) + (this.LJII ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VQCompileDataModel(compileResolution=");
        LIZ.append(this.LIZ);
        LIZ.append(", compileBitrate=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isReencode=");
        LIZ.append(this.LIZJ);
        LIZ.append(", notRemuxErrorCode=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", watermarkResolution=");
        LIZ.append(this.LJ);
        LIZ.append(", watermarkBitrate=");
        LIZ.append(this.LJFF);
        LIZ.append(", encodeStand=");
        LIZ.append(this.LJI);
        LIZ.append(", haveWatermark=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public HI4(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = false;
        this.LIZLLL = 0;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = -1;
        this.LJII = false;
    }
}
