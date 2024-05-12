package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0eD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12410eD {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final List<String> LJ;
    public final java.util.Map<String, String> LJFF;
    public final String LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final C12410eD LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12410eD)) {
            return false;
        }
        C12410eD c12410eD = (C12410eD) obj;
        return o.LJ(this.LIZ, c12410eD.LIZ) && o.LJ(this.LIZIZ, c12410eD.LIZIZ) && o.LJ(this.LIZJ, c12410eD.LIZJ) && o.LJ(this.LIZLLL, c12410eD.LIZLLL) && o.LJ(this.LJ, c12410eD.LJ) && o.LJ(this.LJFF, c12410eD.LJFF) && o.LJ(this.LJI, c12410eD.LJI) && o.LJ(this.LJII, c12410eD.LJII) && this.LJIIIIZZ == c12410eD.LJIIIIZZ && o.LJ(this.LJIIIZ, c12410eD.LJIIIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PageInfo(pageID=");
        LIZ.append(this.LIZ);
        LIZ.append(", btm=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", btmPre=");
        LIZ.append(this.LIZJ);
        LIZ.append(", btmPPre=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", btmChain=");
        LIZ.append(this.LJ);
        LIZ.append(", pageLogData=");
        LIZ.append(this.LJFF);
        LIZ.append(", btmOfLastStayPage=");
        LIZ.append(this.LJI);
        LIZ.append(", className=");
        LIZ.append(this.LJII);
        LIZ.append(", isBack=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", subpage=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.LIZLLL;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<String> list = this.LJ;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int LIZ = C12400eC.LIZ(this.LJFF, (i3 + hashCode3) * 31, 31);
        String str3 = this.LJI;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i4 = (LIZ + hashCode4) * 31;
        String str4 = this.LJII;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i5 = (((i4 + hashCode5) * 31) + this.LJIIIIZZ) * 31;
        C12410eD c12410eD = this.LJIIIZ;
        if (c12410eD != null) {
            i = c12410eD.hashCode();
        }
        return i5 + i;
    }

    public C12410eD(String pageID, String str, String str2, String str3, ORV orv, java.util.Map map, String str4, String str5, int i, C12410eD c12410eD) {
        o.LJIIIZ(pageID, "pageID");
        this.LIZ = pageID;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = orv;
        this.LJFF = map;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = i;
        this.LJIIIZ = c12410eD;
    }
}
