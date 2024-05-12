package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Agd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26871Agd implements InterfaceC27632Asu {
    public final Float LJLIL;
    public final Integer LJLILLLLZI;
    public final List<ReviewFilterStruct> LJLJI;
    public final String LJLJJI;
    public final ProductDetailReview LJLJJL;
    public final int LJLJJLL = EnumC27721AuL.REVIEW.getValue();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26871Agd)) {
            return false;
        }
        C26871Agd c26871Agd = (C26871Agd) obj;
        return o.LJ(this.LJLIL, c26871Agd.LJLIL) && o.LJ(this.LJLILLLLZI, c26871Agd.LJLILLLLZI) && o.LJ(this.LJLJI, c26871Agd.LJLJI) && o.LJ(this.LJLJJI, c26871Agd.LJLJJI) && o.LJ(this.LJLJJL, c26871Agd.LJLJJL);
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
        ProductDetailReview productDetailReview = this.LJLJJL;
        return hashCode4 + (productDetailReview != null ? productDetailReview.hashCode() : 0);
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GlobalProductReviewTitleVO(rating=");
        LIZ.append(this.LJLIL);
        LIZ.append(", reviewCount=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", reviewFilters=");
        LIZ.append(this.LJLJI);
        LIZ.append(", reviewCountStr=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", productDetailReview=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLJJLL;
    }

    public C26871Agd(Float f, Integer num, List<ReviewFilterStruct> list, String str, ProductDetailReview productDetailReview) {
        this.LJLIL = f;
        this.LJLILLLLZI = num;
        this.LJLJI = list;
        this.LJLJJI = str;
        this.LJLJJL = productDetailReview;
    }
}
