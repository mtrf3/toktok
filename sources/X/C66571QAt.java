package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.QAt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66571QAt {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public final String LIZLLL;
    public String LJ;
    public Integer LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;

    public C66571QAt() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66571QAt)) {
            return false;
        }
        C66571QAt c66571QAt = (C66571QAt) obj;
        return o.LJ(this.LIZ, c66571QAt.LIZ) && o.LJ(this.LIZIZ, c66571QAt.LIZIZ) && o.LJ(this.LIZJ, c66571QAt.LIZJ) && o.LJ(this.LIZLLL, c66571QAt.LIZLLL) && o.LJ(this.LJ, c66571QAt.LJ) && o.LJ(this.LJFF, c66571QAt.LJFF) && o.LJ(this.LJI, c66571QAt.LJI) && o.LJ(this.LJII, c66571QAt.LJII) && o.LJ(this.LJIIIIZZ, c66571QAt.LJIIIIZZ) && o.LJ(this.LJIIIZ, c66571QAt.LJIIIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJ;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.LJFF;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.LJI;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJII;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIIIIZZ;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIIIZ;
        return hashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTPContext(domain=");
        LIZ.append(this.LIZ);
        LIZ.append(", captchaDomain=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", deviceRedirectInfo=");
        LIZ.append(this.LIZJ);
        LIZ.append(", countryCode=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", hashedId=");
        LIZ.append(this.LJ);
        LIZ.append(", type=");
        LIZ.append(this.LJFF);
        LIZ.append(", platformAppId=");
        LIZ.append(this.LJI);
        LIZ.append(", secUid=");
        LIZ.append(this.LJII);
        LIZ.append(", screenName=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", path=");
        return q.LIZIZ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public /* synthetic */ C66571QAt(int i) {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public static C66571QAt LIZ(C66571QAt c66571QAt) {
        return new C66571QAt(c66571QAt.LIZ, c66571QAt.LIZIZ, c66571QAt.LIZJ, c66571QAt.LIZLLL, c66571QAt.LJ, c66571QAt.LJI, c66571QAt.LJII, c66571QAt.LJIIIIZZ, c66571QAt.LJIIIZ, c66571QAt.LJFF);
    }

    public C66571QAt(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = num;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
    }
}
