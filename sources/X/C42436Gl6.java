package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gl6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42436Gl6 {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42436Gl6)) {
            return false;
        }
        C42436Gl6 c42436Gl6 = (C42436Gl6) obj;
        return this.LIZ == c42436Gl6.LIZ && o.LJ(this.LIZIZ, c42436Gl6.LIZIZ) && o.LJ(this.LIZJ, c42436Gl6.LIZJ) && o.LJ(this.LIZLLL, c42436Gl6.LIZLLL) && o.LJ(this.LJ, c42436Gl6.LJ) && this.LJFF == c42436Gl6.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LJ = C79062V1e.LJ(this.LJ, C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ * 31, 31), 31), 31), 31);
        boolean z = this.LJFF;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SplitConfig(minDuration=");
        LIZ.append(this.LIZ);
        LIZ.append(", outputDir=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", originVideo=");
        LIZ.append(this.LIZJ);
        LIZ.append(", outAudio=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", outVideo=");
        LIZ.append(this.LJ);
        LIZ.append(", useSplitVideo=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C42436Gl6(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "outputDir", str2, "originVideo", str3, "outAudio", str4, "outVideo");
        this.LIZ = 0;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = false;
    }
}
