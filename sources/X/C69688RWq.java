package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductLogo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RWq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69688RWq {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final List<ProductLogo> LJ;
    public final ProductDetailReview LJFF;
    public final CombinedSalesVolume LJI;
    public final RVG LJII;
    public final Boolean LJIIIIZZ;
    public final Integer LJIIIZ;
    public final boolean LJIIJ;
    public final List<String> LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69688RWq)) {
            return false;
        }
        C69688RWq c69688RWq = (C69688RWq) obj;
        return o.LJ(this.LIZ, c69688RWq.LIZ) && o.LJ(this.LIZIZ, c69688RWq.LIZIZ) && o.LJ(this.LIZJ, c69688RWq.LIZJ) && o.LJ(this.LIZLLL, c69688RWq.LIZLLL) && o.LJ(this.LJ, c69688RWq.LJ) && o.LJ(this.LJFF, c69688RWq.LJFF) && o.LJ(this.LJI, c69688RWq.LJI) && o.LJ(this.LJII, c69688RWq.LJII) && o.LJ(this.LJIIIIZZ, c69688RWq.LJIIIIZZ) && o.LJ(this.LJIIIZ, c69688RWq.LJIIIZ) && this.LJIIJ == c69688RWq.LJIIJ && o.LJ(this.LJIIJJI, c69688RWq.LJIIJJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<ProductLogo> list = this.LJ;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ProductDetailReview productDetailReview = this.LJFF;
        int hashCode6 = (hashCode5 + (productDetailReview == null ? 0 : productDetailReview.hashCode())) * 31;
        CombinedSalesVolume combinedSalesVolume = this.LJI;
        int hashCode7 = (hashCode6 + (combinedSalesVolume == null ? 0 : combinedSalesVolume.hashCode())) * 31;
        RVG rvg = this.LJII;
        int hashCode8 = (hashCode7 + (rvg == null ? 0 : rvg.hashCode())) * 31;
        Boolean bool = this.LJIIIIZZ;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.LJIIIZ;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.LJIIJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode10 + i) * 31;
        List<String> list2 = this.LJIIJJI;
        return i2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "UsProductInfoVO(title=" + this.LIZ + ", realPrice=" + this.LIZIZ + ", originPrice=" + this.LIZJ + ", purchaseLimit=" + this.LIZLLL + ", productLogos=" + this.LJ + ", review=" + this.LJFF + ", combinedSalesVolume=" + this.LJI + ", promotionActivityInfoModel=" + this.LJII + ", isFavorite=" + this.LJIIIIZZ + ", soldCount=" + this.LJIIIZ + ", needDivider=" + this.LJIIJ + ", sortList=" + this.LJIIJJI + ')';
    }

    public C69688RWq(String str, String str2, String str3, String str4, List<ProductLogo> list, ProductDetailReview productDetailReview, CombinedSalesVolume combinedSalesVolume, RVG rvg, Boolean bool, Integer num, boolean z, List<String> list2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = list;
        this.LJFF = productDetailReview;
        this.LJI = combinedSalesVolume;
        this.LJII = rvg;
        this.LJIIIIZZ = bool;
        this.LJIIIZ = num;
        this.LJIIJ = z;
        this.LJIIJJI = list2;
    }
}
