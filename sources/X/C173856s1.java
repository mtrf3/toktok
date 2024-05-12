package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.6s1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173856s1 {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;

    public C173856s1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C173856s1)) {
            return false;
        }
        C173856s1 c173856s1 = (C173856s1) obj;
        return o.LJ(this.LIZ, c173856s1.LIZ) && o.LJ(this.LIZIZ, c173856s1.LIZIZ) && this.LIZJ == c173856s1.LIZJ && this.LIZLLL == c173856s1.LIZLLL && this.LJ == c173856s1.LJ && this.LJFF == c173856s1.LJFF && this.LJI == c173856s1.LJI && this.LJII == c173856s1.LJII && this.LJIIIIZZ == c173856s1.LJIIIIZZ && this.LJIIIZ == c173856s1.LJIIIZ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return ((((((((((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoMetaInfo(mimeType=");
        LIZ.append((Object) this.LIZ);
        LIZ.append(", createTime=");
        LIZ.append((Object) this.LIZIZ);
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
        return b0.LIZJ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public /* synthetic */ C173856s1(int i) {
        this(0, 0, 0, 0, 0, 0, 0, 0, null, null);
    }

    public C173856s1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
        this.LJI = i5;
        this.LJII = i6;
        this.LJIIIIZZ = i7;
        this.LJIIIZ = i8;
    }
}
