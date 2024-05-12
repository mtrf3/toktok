package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RUs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69638RUs {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final List<Voucher> LJ;
    public final Boolean LJFF;
    public final Boolean LJI;
    public final Boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69638RUs)) {
            return false;
        }
        C69638RUs c69638RUs = (C69638RUs) obj;
        return this.LIZ == c69638RUs.LIZ && o.LJ(this.LIZIZ, c69638RUs.LIZIZ) && o.LJ(this.LIZJ, c69638RUs.LIZJ) && o.LJ(this.LIZLLL, c69638RUs.LIZLLL) && o.LJ(this.LJ, c69638RUs.LJ) && o.LJ(this.LJFF, c69638RUs.LJFF) && o.LJ(this.LJI, c69638RUs.LJI) && o.LJ(this.LJII, c69638RUs.LJII);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJ, C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ * 31, 31), 31), 31), 31);
        Boolean bool = this.LJFF;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        Boolean bool2 = this.LJI;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool3 = this.LJII;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CouponsInfoVO(style=");
        LIZ.append(this.LIZ);
        LIZ.append(", title=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", schema=");
        LIZ.append(this.LIZJ);
        LIZ.append(", discountPrice=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", discounts=");
        LIZ.append(this.LJ);
        LIZ.append(", hideEntrance=");
        LIZ.append(this.LJFF);
        LIZ.append(", needDivider=");
        LIZ.append(this.LJI);
        LIZ.append(", hasPromotionEntrance=");
        return C78920UyC.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public C69638RUs(int i, String str, String str2, String str3, List<Voucher> list, Boolean bool, Boolean bool2, Boolean bool3) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = list;
        this.LJFF = bool;
        this.LJI = bool2;
        this.LJII = bool3;
    }
}
