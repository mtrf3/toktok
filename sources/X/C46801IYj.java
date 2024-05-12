package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IYj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46801IYj {
    public final int LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final int LIZLLL;
    public final Float LJ;
    public final Float LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46801IYj)) {
            return false;
        }
        C46801IYj c46801IYj = (C46801IYj) obj;
        return this.LIZ == c46801IYj.LIZ && o.LJ(this.LIZIZ, c46801IYj.LIZIZ) && o.LJ(this.LIZJ, c46801IYj.LIZJ) && this.LIZLLL == c46801IYj.LIZLLL && o.LJ(this.LJ, c46801IYj.LJ) && o.LJ(this.LJFF, c46801IYj.LJFF) && o.LJ(this.LJI, c46801IYj.LJI);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ * 31, 31);
        Integer num = this.LIZJ;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (((LJ + hashCode) * 31) + this.LIZLLL) * 31;
        Float f = this.LJ;
        if (f == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = f.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Float f2 = this.LJFF;
        if (f2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = f2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str = this.LJI;
        if (str != null) {
            i = str.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DubbedInfoModel{mediaType=");
        LIZ.append(this.LIZ);
        LIZ.append(", url=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", bitrate=");
        LIZ.append(this.LIZJ);
        LIZ.append(", infoId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", loudness=");
        LIZ.append(this.LJ);
        LIZ.append(", peak=");
        LIZ.append(this.LJFF);
        LIZ.append(", fileKey=");
        LIZ.append((Object) this.LJI);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C46801IYj(int i, String url, Integer num, int i2, Float f, Float f2, String str) {
        o.LJIIIZ(url, "url");
        this.LIZ = i;
        this.LIZIZ = url;
        this.LIZJ = num;
        this.LIZLLL = i2;
        this.LJ = f;
        this.LJFF = f2;
        this.LJI = str;
    }
}
