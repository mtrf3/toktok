package X;

import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.5jj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143235jj {
    public int LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final VEAlgorithmPath LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;
    public final Integer LJI;
    public final String LJII;
    public String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C143235jj)) {
            return false;
        }
        C143235jj c143235jj = (C143235jj) obj;
        return this.LIZ == c143235jj.LIZ && o.LJ(this.LIZIZ, c143235jj.LIZIZ) && o.LJ(this.LIZJ, c143235jj.LIZJ) && o.LJ(this.LIZLLL, c143235jj.LIZLLL) && o.LJ(this.LJ, c143235jj.LJ) && o.LJ(this.LJFF, c143235jj.LJFF) && o.LJ(this.LJI, c143235jj.LJI) && o.LJ(this.LJII, c143235jj.LJII) && o.LJ(this.LJIIIIZZ, c143235jj.LJIIIIZZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZJ;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        VEAlgorithmPath vEAlgorithmPath = this.LIZLLL;
        int hashCode3 = (hashCode2 + (vEAlgorithmPath == null ? 0 : vEAlgorithmPath.hashCode())) * 31;
        Integer num2 = this.LJ;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LJFF;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LJI;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.LJII;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIIIIZZ;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickPointResult(retCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", musicPath=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", length=");
        LIZ.append(this.LIZJ);
        LIZ.append(", veAlgorithmPath=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", musicStart=");
        LIZ.append(this.LJ);
        LIZ.append(", trimOut=");
        LIZ.append(this.LJFF);
        LIZ.append(", musicLength=");
        LIZ.append(this.LJI);
        LIZ.append(", syncType=");
        LIZ.append(this.LJII);
        LIZ.append(", extraInfo=");
        return q.LIZIZ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public C143235jj(int i, String str, Integer num, VEAlgorithmPath vEAlgorithmPath, Integer num2, Integer num3, Integer num4, String str2, String str3, int i2) {
        str = (i2 & 2) != 0 ? null : str;
        num = (i2 & 4) != 0 ? null : num;
        vEAlgorithmPath = (i2 & 8) != 0 ? null : vEAlgorithmPath;
        num2 = (i2 & 16) != 0 ? null : num2;
        num3 = (i2 & 32) != 0 ? null : num3;
        num4 = (i2 & 64) != 0 ? null : num4;
        str2 = (i2 & 128) != 0 ? null : str2;
        str3 = (i2 & 256) != 0 ? null : str3;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = vEAlgorithmPath;
        this.LJ = num2;
        this.LJFF = num3;
        this.LJI = num4;
        this.LJII = str2;
        this.LJIIIIZZ = str3;
    }
}
