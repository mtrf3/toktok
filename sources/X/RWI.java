package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RWI {
    public final List<SaleProp> LIZ;
    public final List<SkuItem> LIZIZ;
    public final SkuCommonConfig LIZJ;
    public final SizeGuide LIZLLL;
    public final List<String> LJ;
    public final Integer LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RWI)) {
            return false;
        }
        RWI rwi = (RWI) obj;
        return o.LJ(this.LIZ, rwi.LIZ) && o.LJ(this.LIZIZ, rwi.LIZIZ) && o.LJ(this.LIZJ, rwi.LIZJ) && o.LJ(this.LIZLLL, rwi.LIZLLL) && o.LJ(this.LJ, rwi.LJ) && o.LJ(this.LJFF, rwi.LJFF);
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
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.LJFF;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UsSkuVO(saleProps=");
        LIZ.append(this.LIZ);
        LIZ.append(", skuList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", skuCommonConfig=");
        LIZ.append(this.LIZJ);
        LIZ.append(", sizeGuide=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", selectIdList=");
        LIZ.append(this.LJ);
        LIZ.append(", quantity=");
        return s0.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public RWI(List<SaleProp> list, List<SkuItem> list2, SkuCommonConfig skuCommonConfig, SizeGuide sizeGuide, List<String> list3, Integer num) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = skuCommonConfig;
        this.LIZLLL = sizeGuide;
        this.LJ = list3;
        this.LJFF = num;
    }
}
