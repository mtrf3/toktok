package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Ufs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77784Ufs {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77784Ufs)) {
            return false;
        }
        C77784Ufs c77784Ufs = (C77784Ufs) obj;
        return o.LJ(this.LIZ, c77784Ufs.LIZ) && o.LJ(this.LIZIZ, c77784Ufs.LIZIZ) && o.LJ(this.LIZJ, c77784Ufs.LIZJ) && o.LJ(this.LIZLLL, c77784Ufs.LIZLLL) && o.LJ(this.LJ, c77784Ufs.LJ) && o.LJ(this.LJFF, c77784Ufs.LJFF) && o.LJ(this.LJI, c77784Ufs.LJI) && o.LJ(this.LJII, c77784Ufs.LJII);
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
        String str6 = this.LJFF;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJI;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJII;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GameJumpParamModel(deepLink=");
        LIZ.append(this.LIZ);
        LIZ.append(", appID=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", roomID=");
        LIZ.append(this.LIZJ);
        LIZ.append(", taskID=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", anchorID=");
        LIZ.append(this.LJ);
        LIZ.append(", gameID=");
        LIZ.append(this.LJFF);
        LIZ.append(", gameName=");
        LIZ.append(this.LJI);
        LIZ.append(", packageName=");
        return q.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public C77784Ufs(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
    }
}
