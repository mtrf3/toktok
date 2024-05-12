package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6s7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173916s7 {
    public String LIZ;
    public String LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public final int LJFF;
    public int LJI;
    public int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;

    public C173916s7() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C173916s7)) {
            return false;
        }
        C173916s7 c173916s7 = (C173916s7) obj;
        return o.LJ(this.LIZ, c173916s7.LIZ) && o.LJ(this.LIZIZ, c173916s7.LIZIZ) && this.LIZJ == c173916s7.LIZJ && this.LIZLLL == c173916s7.LIZLLL && this.LJ == c173916s7.LJ && this.LJFF == c173916s7.LJFF && this.LJI == c173916s7.LJI && this.LJII == c173916s7.LJII && this.LJIIIIZZ == c173916s7.LJIIIIZZ && this.LJIIIZ == c173916s7.LJIIIZ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        return ((((((((((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoMetaInfo(mimeType=");
        LIZ.append(this.LIZ);
        LIZ.append(", createTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", width=");
        LIZ.append(this.LIZJ);
        LIZ.append(", height=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", duration=");
        LIZ.append(this.LJ);
        LIZ.append(", fps=");
        LIZ.append(this.LJFF);
        LIZ.append(", bitrate=");
        LIZ.append(this.LJI);
        LIZ.append(", rotateDegree=");
        LIZ.append(this.LJII);
        LIZ.append(", maxDuration=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", codec=");
        return C08380Uo.LIZ(LIZ, this.LJIIIZ, ")", LIZ);
    }

    public C173916s7(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJFF = 0;
        this.LJI = 0;
        this.LJII = 0;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = 0;
    }
}
