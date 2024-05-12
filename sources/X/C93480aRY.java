package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aRY, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93480aRY {
    public final Integer LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93480aRY)) {
            return false;
        }
        C93480aRY c93480aRY = (C93480aRY) obj;
        return o.LJ(this.LIZ, c93480aRY.LIZ) && o.LJ(this.LIZIZ, c93480aRY.LIZIZ) && o.LJ(this.LIZJ, c93480aRY.LIZJ) && o.LJ(this.LIZLLL, c93480aRY.LIZLLL) && o.LJ(this.LJ, c93480aRY.LJ) && this.LJFF == c93480aRY.LJFF && o.LJ(this.LJI, c93480aRY.LJI) && o.LJ(this.LJII, c93480aRY.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.LJ;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.LJFF;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        String str5 = this.LJI;
        int hashCode6 = (i2 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.LJII;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Info(iconDrawable=");
        LIZ.append(this.LIZ);
        LIZ.append(", iconUrl=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", title=");
        LIZ.append(this.LIZJ);
        LIZ.append(", subTitle=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", message=");
        LIZ.append(this.LJ);
        LIZ.append(", showClose=");
        LIZ.append(this.LJFF);
        LIZ.append(", cancelContent=");
        LIZ.append(this.LJI);
        LIZ.append(", confirmContent=");
        LIZ.append(this.LJII);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C93480aRY(String str, String str2, String str3, boolean z, String str4, int i) {
        str3 = (i & 16) != 0 ? null : str3;
        this.LIZ = null;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = null;
        this.LJ = str3;
        this.LJFF = z;
        this.LJI = null;
        this.LJII = str4;
    }
}
