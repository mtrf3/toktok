package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageCard;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Agc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26870Agc implements InterfaceC27632Asu {
    public final Float LJLIL;
    public final Integer LJLILLLLZI;
    public final List<ReviewFilterStruct> LJLJI;
    public final String LJLJJI;
    public final List<ReviewAspectPercentageCard> LJLJJL;
    public final ProductDetailReview LJLJJLL;
    public final int LJLJL = EnumC27721AuL.REVIEW.getValue();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26870Agc)) {
            return false;
        }
        C26870Agc c26870Agc = (C26870Agc) obj;
        return o.LJ(this.LJLIL, c26870Agc.LJLIL) && o.LJ(this.LJLILLLLZI, c26870Agc.LJLILLLLZI) && o.LJ(this.LJLJI, c26870Agc.LJLJI) && o.LJ(this.LJLJJI, c26870Agc.LJLJJI) && o.LJ(this.LJLJJL, c26870Agc.LJLJJL) && o.LJ(this.LJLJJLL, c26870Agc.LJLJJLL);
    }

    public final int hashCode() {
        Float f = this.LJLIL;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<ReviewFilterStruct> list = this.LJLJI;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<ReviewAspectPercentageCard> list2 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ProductDetailReview productDetailReview = this.LJLJJLL;
        return hashCode5 + (productDetailReview != null ? productDetailReview.hashCode() : 0);
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpReviewTitleVO(rating=");
        LIZ.append(this.LJLIL);
        LIZ.append(", reviewCount=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", reviewFilters=");
        LIZ.append(this.LJLJI);
        LIZ.append(", reviewCountStr=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", reviewAspectPercentageCard=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", productDetailReview=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLJL;
    }

    public C26870Agc(Float f, Integer num, List<ReviewFilterStruct> list, String str, List<ReviewAspectPercentageCard> list2, ProductDetailReview productDetailReview) {
        this.LJLIL = f;
        this.LJLILLLLZI = num;
        this.LJLJI = list;
        this.LJLJJI = str;
        this.LJLJJL = list2;
        this.LJLJJLL = productDetailReview;
    }
}
