package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RWJ {
    public final List<SaleProp> LIZ;
    public final SkcInfo LIZIZ;
    public final List<SkuItem> LIZJ;
    public final SkuCommonConfig LIZLLL;
    public final SizeGuide LJ;
    public final List<String> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RWJ)) {
            return false;
        }
        RWJ rwj = (RWJ) obj;
        return o.LJ(this.LIZ, rwj.LIZ) && o.LJ(this.LIZIZ, rwj.LIZIZ) && o.LJ(this.LIZJ, rwj.LIZJ) && o.LJ(this.LIZLLL, rwj.LIZLLL) && o.LJ(this.LJ, rwj.LJ) && o.LJ(this.LJFF, rwj.LJFF);
    }

    public final int hashCode() {
        List<SaleProp> list = this.LIZ;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        SkcInfo skcInfo = this.LIZIZ;
        int hashCode2 = (hashCode + (skcInfo == null ? 0 : skcInfo.hashCode())) * 31;
        List<SkuItem> list2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        SkuCommonConfig skuCommonConfig = this.LIZLLL;
        int hashCode4 = (hashCode3 + (skuCommonConfig == null ? 0 : skuCommonConfig.hashCode())) * 31;
        SizeGuide sizeGuide = this.LJ;
        int hashCode5 = (hashCode4 + (sizeGuide == null ? 0 : sizeGuide.hashCode())) * 31;
        List<String> list3 = this.LJFF;
        return hashCode5 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GlobalSkuVO2(saleProps=");
        LIZ.append(this.LIZ);
        LIZ.append(", skcInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", skuList=");
        LIZ.append(this.LIZJ);
        LIZ.append(", skuCommonConfig=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", sizeGuide=");
        LIZ.append(this.LJ);
        LIZ.append(", selectIdList=");
        return C1NE.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public RWJ(List<SaleProp> list, SkcInfo skcInfo, List<SkuItem> list2, SkuCommonConfig skuCommonConfig, SizeGuide sizeGuide, List<String> list3) {
        this.LIZ = list;
        this.LIZIZ = skcInfo;
        this.LIZJ = list2;
        this.LIZLLL = skuCommonConfig;
        this.LJ = sizeGuide;
        this.LJFF = list3;
    }

    public static RWJ LIZ(RWJ rwj, List list, SkcInfo skcInfo, List list2, List list3, int i) {
        SkuCommonConfig skuCommonConfig;
        List list4 = list3;
        List list5 = list2;
        List list6 = list;
        SkcInfo skcInfo2 = skcInfo;
        if ((i & 1) != 0) {
            list6 = rwj.LIZ;
        }
        if ((i & 2) != 0) {
            skcInfo2 = rwj.LIZIZ;
        }
        if ((i & 4) != 0) {
            list5 = rwj.LIZJ;
        }
        SizeGuide sizeGuide = null;
        if ((i & 8) != 0) {
            skuCommonConfig = rwj.LIZLLL;
        } else {
            skuCommonConfig = null;
        }
        if ((i & 16) != 0) {
            sizeGuide = rwj.LJ;
        }
        if ((i & 32) != 0) {
            list4 = rwj.LJFF;
        }
        rwj.getClass();
        return new RWJ(list6, skcInfo2, list5, skuCommonConfig, sizeGuide, list4);
    }
}
