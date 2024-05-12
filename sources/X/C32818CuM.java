package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CuM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32818CuM {
    public final List<Long> LIZ;
    public final List<Integer> LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final String LJI;
    public final C15900jq LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32818CuM)) {
            return false;
        }
        C32818CuM c32818CuM = (C32818CuM) obj;
        return o.LJ(this.LIZ, c32818CuM.LIZ) && o.LJ(this.LIZIZ, c32818CuM.LIZIZ) && this.LIZJ == c32818CuM.LIZJ && this.LIZLLL == c32818CuM.LIZLLL && o.LJ(this.LJ, c32818CuM.LJ) && this.LJFF == c32818CuM.LJFF && o.LJ(this.LJI, c32818CuM.LJI) && o.LJ(this.LJII, c32818CuM.LJII);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftBoxEventParam(giftIdSet=");
        LIZ.append(this.LIZ);
        LIZ.append(", giftPriceSet=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", giftBoxId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", giftBoxPrice=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", sendClickFrom=");
        LIZ.append(this.LJ);
        LIZ.append(", giftCnt=");
        LIZ.append(this.LJFF);
        LIZ.append(", giftBoxEnterFrom=");
        LIZ.append(this.LJI);
        LIZ.append(", jsbGiftEventData=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        List<Long> list = this.LIZ;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        List<Integer> list2 = this.LIZIZ;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int LIZJ = (JBR.LIZJ(this.LIZJ, (i2 + hashCode2) * 31, 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i3 = (((LIZJ + hashCode3) * 31) + this.LJFF) * 31;
        String str2 = this.LJI;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        C15900jq c15900jq = this.LJII;
        if (c15900jq != null) {
            i = c15900jq.hashCode();
        }
        return i4 + i;
    }

    public C32818CuM(List<Long> list, List<Integer> list2, long j, int i, String str, int i2, String str2, C15900jq c15900jq) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = j;
        this.LIZLLL = i;
        this.LJ = str;
        this.LJFF = i2;
        this.LJI = str2;
        this.LJII = c15900jq;
    }
}
