package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aRZ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93481aRZ {
    public final Integer LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final List<C93482aRa> LJFF;
    public final boolean LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public C93481aRZ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93481aRZ)) {
            return false;
        }
        C93481aRZ c93481aRZ = (C93481aRZ) obj;
        return o.LJ(this.LIZ, c93481aRZ.LIZ) && o.LJ(this.LIZIZ, c93481aRZ.LIZIZ) && o.LJ(this.LIZJ, c93481aRZ.LIZJ) && o.LJ(this.LIZLLL, c93481aRZ.LIZLLL) && o.LJ(this.LJ, c93481aRZ.LJ) && o.LJ(this.LJFF, c93481aRZ.LJFF) && this.LJI == c93481aRZ.LJI && o.LJ(this.LJII, c93481aRZ.LJII) && o.LJ(this.LJIIIIZZ, c93481aRZ.LJIIIIZZ);
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
        List<C93482aRa> list = this.LJFF;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.LJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode6 + i) * 31;
        String str5 = this.LJII;
        int hashCode7 = (i2 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.LJIIIIZZ;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
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
        LIZ.append(", stepList=");
        LIZ.append(this.LJFF);
        LIZ.append(", showClose=");
        LIZ.append(this.LJI);
        LIZ.append(", cancelContent=");
        LIZ.append(this.LJII);
        LIZ.append(", confirmContent=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C93481aRZ(Integer num, String str, List stepList, String str2) {
        o.LJIIIZ(stepList, "stepList");
        this.LIZ = num;
        this.LIZIZ = null;
        this.LIZJ = str;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = stepList;
        this.LJI = true;
        this.LJII = null;
        this.LJIIIIZZ = str2;
    }
}
