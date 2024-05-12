package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import kotlin.jvm.internal.o;

/* renamed from: X.RWu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69692RWu {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final PdpShipping LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final PDPShippingModule LJI;
    public final PdpPaymentModule LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69692RWu)) {
            return false;
        }
        C69692RWu c69692RWu = (C69692RWu) obj;
        return o.LJ(this.LIZ, c69692RWu.LIZ) && o.LJ(this.LIZIZ, c69692RWu.LIZIZ) && o.LJ(this.LIZJ, c69692RWu.LIZJ) && o.LJ(this.LIZLLL, c69692RWu.LIZLLL) && o.LJ(this.LJ, c69692RWu.LJ) && o.LJ(this.LJFF, c69692RWu.LJFF) && o.LJ(this.LJI, c69692RWu.LJI) && o.LJ(this.LJII, c69692RWu.LJII);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZJ;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        PdpShipping pdpShipping = this.LIZLLL;
        int hashCode4 = (hashCode3 + (pdpShipping == null ? 0 : pdpShipping.hashCode())) * 31;
        String str2 = this.LJ;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.LJFF;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        PDPShippingModule pDPShippingModule = this.LJI;
        int hashCode7 = (hashCode6 + (pDPShippingModule == null ? 0 : pDPShippingModule.hashCode())) * 31;
        PdpPaymentModule pdpPaymentModule = this.LJII;
        return hashCode7 + (pdpPaymentModule != null ? pdpPaymentModule.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PackSkuInfoCache(skuId=");
        LIZ.append(this.LIZ);
        LIZ.append(", addressId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", skuStatus=");
        LIZ.append(this.LIZJ);
        LIZ.append(", shipping=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", bottomBarAreaId=");
        LIZ.append(this.LJ);
        LIZ.append(", unavailableInfoId=");
        LIZ.append(this.LJFF);
        LIZ.append(", pdpShippingModule=");
        LIZ.append(this.LJI);
        LIZ.append(", pdpPaymentModule=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C69692RWu(String str, String str2, Integer num, PdpShipping pdpShipping, String str3, Integer num2, PDPShippingModule pDPShippingModule) {
        this(str, str2, num, pdpShipping, str3, num2, pDPShippingModule, null);
    }

    public C69692RWu(String skuId, String str, Integer num, PdpShipping pdpShipping, String str2, Integer num2, PDPShippingModule pDPShippingModule, PdpPaymentModule pdpPaymentModule) {
        o.LJIIIZ(skuId, "skuId");
        this.LIZ = skuId;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = pdpShipping;
        this.LJ = str2;
        this.LJFF = num2;
        this.LJI = pDPShippingModule;
        this.LJII = pdpPaymentModule;
    }
}
