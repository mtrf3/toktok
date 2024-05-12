package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.AjX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27051AjX {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final C62562cu LJFF;
    public final Integer LJI;
    public final Integer LJII;
    public final String LJIIIIZZ;
    public final ArrayList<BillItem> LJIIIZ;
    public final String LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27051AjX)) {
            return false;
        }
        C27051AjX c27051AjX = (C27051AjX) obj;
        return o.LJ(this.LIZ, c27051AjX.LIZ) && o.LJ(this.LIZIZ, c27051AjX.LIZIZ) && o.LJ(this.LIZJ, c27051AjX.LIZJ) && o.LJ(this.LIZLLL, c27051AjX.LIZLLL) && o.LJ(this.LJ, c27051AjX.LJ) && o.LJ(this.LJFF, c27051AjX.LJFF) && o.LJ(this.LJI, c27051AjX.LJI) && o.LJ(this.LJII, c27051AjX.LJII) && o.LJ(this.LJIIIIZZ, c27051AjX.LJIIIIZZ) && o.LJ(this.LJIIIZ, c27051AjX.LJIIIZ) && o.LJ(this.LJIIJ, c27051AjX.LJIIJ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        Integer num = this.LIZJ;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        Integer num2 = this.LIZLLL;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.LJ;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        C62562cu c62562cu = this.LJFF;
        if (c62562cu == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c62562cu.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num3 = this.LJI;
        if (num3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num3.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Integer num4 = this.LJII;
        if (num4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num4.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str2 = this.LJIIIIZZ;
        if (str2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str2.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        ArrayList<BillItem> arrayList = this.LJIIIZ;
        if (arrayList == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = arrayList.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str3 = this.LJIIJ;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SummaryBillItem(itemName=");
        sb.append(this.LIZ);
        sb.append(", itemFee=");
        sb.append(this.LIZIZ);
        sb.append(", itemFeeFont=");
        sb.append(this.LIZJ);
        sb.append(", itemFeeColor=");
        sb.append(this.LIZLLL);
        sb.append(", link=");
        sb.append(this.LJ);
        sb.append(", logo=");
        sb.append(this.LJFF);
        sb.append(", itemTextColor=");
        sb.append(this.LJI);
        sb.append(", itemType=");
        sb.append(this.LJII);
        sb.append(", itemText=");
        sb.append(this.LJIIIIZZ);
        sb.append(", subItems=");
        sb.append(this.LJIIIZ);
        sb.append(", itemExplain=");
        return C07670Rv.LIZIZ(sb, this.LJIIJ, ')');
    }

    public C27051AjX(String str, String str2, Integer num, Integer num2, String str3, C62562cu c62562cu, Integer num3, Integer num4, String str4, ArrayList<BillItem> arrayList, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
        this.LIZLLL = num2;
        this.LJ = str3;
        this.LJFF = c62562cu;
        this.LJI = num3;
        this.LJII = num4;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = arrayList;
        this.LJIIJ = str5;
    }
}
