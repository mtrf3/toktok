package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.AoS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27356AoS<T> {
    public final T LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final Integer LJFF;
    public final Integer LJI;
    public final Integer LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27356AoS)) {
            return false;
        }
        C27356AoS c27356AoS = (C27356AoS) obj;
        return o.LJ(this.LIZ, c27356AoS.LIZ) && o.LJ(this.LIZIZ, c27356AoS.LIZIZ) && o.LJ(this.LIZJ, c27356AoS.LIZJ) && o.LJ(this.LIZLLL, c27356AoS.LIZLLL) && this.LJ == c27356AoS.LJ && o.LJ(this.LJFF, c27356AoS.LJFF) && o.LJ(this.LJI, c27356AoS.LJI) && o.LJ(this.LJII, c27356AoS.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        T t = this.LIZ;
        int i = 0;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LIZIZ, hashCode * 31, 31);
        String str = this.LIZJ;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.LIZLLL, (LJ + hashCode2) * 31, 31);
        boolean z = this.LJ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LJ2 + i2) * 31;
        Integer num = this.LJFF;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num2 = this.LJI;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num3 = this.LJII;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchResult(rawData=");
        LIZ.append(this.LIZ);
        LIZ.append(", showFirstText=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", showSecondText=");
        LIZ.append(this.LIZJ);
        LIZ.append(", keyword=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", clickable=");
        LIZ.append(this.LJ);
        LIZ.append(", firstColor=");
        LIZ.append(this.LJFF);
        LIZ.append(", secondColor=");
        LIZ.append(this.LJI);
        LIZ.append(", firstHighLightColor=");
        return s0.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public /* synthetic */ C27356AoS(Object obj, String str, String str2, String str3, boolean z, Integer num, int i) {
        this(obj, str, str2, str3, z, (i & 32) != 0 ? null : num, null, null);
    }

    public C27356AoS(T t, String showFirstText, String str, String keyword, boolean z, Integer num, Integer num2, Integer num3) {
        o.LJIIIZ(showFirstText, "showFirstText");
        o.LJIIIZ(keyword, "keyword");
        this.LIZ = t;
        this.LIZIZ = showFirstText;
        this.LIZJ = str;
        this.LIZLLL = keyword;
        this.LJ = z;
        this.LJFF = num;
        this.LJI = num2;
        this.LJII = num3;
    }
}
