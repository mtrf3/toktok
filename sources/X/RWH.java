package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RWH {
    public final List<SaleProp> LIZ;
    public final List<SkuItem> LIZIZ;
    public final SkuCommonConfig LIZJ;
    public final SizeGuide LIZLLL;
    public final List<String> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RWH)) {
            return false;
        }
        RWH rwh = (RWH) obj;
        return o.LJ(this.LIZ, rwh.LIZ) && o.LJ(this.LIZIZ, rwh.LIZIZ) && o.LJ(this.LIZJ, rwh.LIZJ) && o.LJ(this.LIZLLL, rwh.LIZLLL) && o.LJ(this.LJ, rwh.LJ);
    }

    public final int hashCode() {
        List<SaleProp> list = this.LIZ;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<SkuItem> list2 = this.LIZIZ;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        SkuCommonConfig skuCommonConfig = this.LIZJ;
        int hashCode3 = (hashCode2 + (skuCommonConfig == null ? 0 : skuCommonConfig.hashCode())) * 31;
        SizeGuide sizeGuide = this.LIZLLL;
        int hashCode4 = (hashCode3 + (sizeGuide == null ? 0 : sizeGuide.hashCode())) * 31;
        List<String> list3 = this.LJ;
        return hashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GlobalSkuVO(saleProps=");
        LIZ.append(this.LIZ);
        LIZ.append(", skuList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", skuCommonConfig=");
        LIZ.append(this.LIZJ);
        LIZ.append(", sizeGuide=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", selectIdList=");
        return C1NE.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public RWH(List<SaleProp> list, List<SkuItem> list2, SkuCommonConfig skuCommonConfig, SizeGuide sizeGuide, List<String> list3) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = skuCommonConfig;
        this.LIZLLL = sizeGuide;
        this.LJ = list3;
    }
}
