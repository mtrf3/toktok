package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.37z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C789537z {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final long LJII;

    public final C789537z LIZ() {
        if (((ArrayList) ORY.LJJIJLIJ(new String[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI})).isEmpty()) {
            return null;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C789537z)) {
            return false;
        }
        C789537z c789537z = (C789537z) obj;
        return o.LJ(this.LIZ, c789537z.LIZ) && o.LJ(this.LIZIZ, c789537z.LIZIZ) && o.LJ(this.LIZJ, c789537z.LIZJ) && o.LJ(this.LIZLLL, c789537z.LIZLLL) && o.LJ(this.LJ, c789537z.LJ) && o.LJ(this.LJFF, c789537z.LJFF) && o.LJ(this.LJI, c789537z.LJI) && this.LJII == c789537z.LJII;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
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
        String str3 = this.LJ;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.LJFF;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.LJI;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJII) + ((i5 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MafInfo(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", recType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", recReason=");
        LIZ.append(this.LIZJ);
        LIZ.append(", relationType=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", socialInfo=");
        LIZ.append(this.LJ);
        LIZ.append(", mutualStruct=");
        LIZ.append(this.LJFF);
        LIZ.append(", externalRecReason=");
        LIZ.append(this.LJI);
        LIZ.append(", version=");
        return C47135Ieh.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public C789537z(String uid, String recType, long j, String str, String str2, String str3, String str4, String str5) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(recType, "recType");
        this.LIZ = uid;
        this.LIZIZ = recType;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = j;
    }
}
