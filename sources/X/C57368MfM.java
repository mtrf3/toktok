package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.MfM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57368MfM {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final C57364MfI LJFF;
    public final String LJI;

    public C57368MfM() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57368MfM)) {
            return false;
        }
        C57368MfM c57368MfM = (C57368MfM) obj;
        return o.LJ(this.LIZ, c57368MfM.LIZ) && o.LJ(this.LIZIZ, c57368MfM.LIZIZ) && o.LJ(this.LIZJ, c57368MfM.LIZJ) && o.LJ(this.LIZLLL, c57368MfM.LIZLLL) && o.LJ(this.LJ, c57368MfM.LJ) && o.LJ(this.LJFF, c57368MfM.LJFF) && o.LJ(this.LJI, c57368MfM.LJI);
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
        C57364MfI c57364MfI = this.LJFF;
        int hashCode6 = (hashCode5 + (c57364MfI == null ? 0 : c57364MfI.hashCode())) * 31;
        String str6 = this.LJI;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowLogEvenParams(liveRequestId=");
        LIZ.append(this.LIZ);
        LIZ.append(", liveRoomId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", liveRoomOwnerId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", liveType=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", fromSearch=");
        LIZ.append(this.LJ);
        LIZ.append(", recommendEnterProfile=");
        LIZ.append(this.LJFF);
        LIZ.append(", position=");
        return q.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public C57368MfM(String str, String str2, String str3, String str4, String str5, C57364MfI c57364MfI, String str6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = c57364MfI;
        this.LJI = str6;
    }
}
