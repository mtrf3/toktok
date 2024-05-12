package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RXV {
    public final List<SaleProp> LIZ;
    public final List<SkuItem> LIZIZ;
    public final SkcInfo LIZJ;
    public final List<String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RXV)) {
            return false;
        }
        RXV rxv = (RXV) obj;
        return o.LJ(this.LIZ, rxv.LIZ) && o.LJ(this.LIZIZ, rxv.LIZIZ) && o.LJ(this.LIZJ, rxv.LIZJ) && o.LJ(this.LIZLLL, rxv.LIZLLL);
    }

    public final int hashCode() {
        List<SaleProp> list = this.LIZ;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<SkuItem> list2 = this.LIZIZ;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        SkcInfo skcInfo = this.LIZJ;
        return this.LIZLLL.hashCode() + ((hashCode2 + (skcInfo != null ? skcInfo.hashCode() : 0)) * 31);
    }

    public final boolean LIZ() {
        String str;
        List<SaleProp> list;
        SkcInfo skcInfo = this.LIZJ;
        if (skcInfo != null) {
            str = skcInfo.skcPropertyId;
        } else {
            str = null;
        }
        if (str == null || ujb.o.LJJJJJL(str) || (list = this.LIZ) == null || list.size() <= 1) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ() {
        String str;
        SkcInfo skcInfo;
        List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc> list;
        SkcInfo skcInfo2 = this.LIZJ;
        if (skcInfo2 != null) {
            str = skcInfo2.skcPropertyId;
        } else {
            str = null;
        }
        if (str == null || ujb.o.LJJJJJL(str) || (skcInfo = this.LIZJ) == null || (list = skcInfo.skcList) == null || list.size() <= 1) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TtfSkuVO(saleProps=");
        LIZ.append(this.LIZ);
        LIZ.append(", skuList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", skcInfo=");
        LIZ.append(this.LIZJ);
        LIZ.append(", selectedIdList=");
        return C1NE.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public RXV(List<SaleProp> list, List<SkuItem> list2, SkcInfo skcInfo, List<String> selectedIdList) {
        o.LJIIIZ(selectedIdList, "selectedIdList");
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = skcInfo;
        this.LIZLLL = selectedIdList;
    }
}
