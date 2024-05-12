package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import kotlin.jvm.internal.o;

/* renamed from: X.Arz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27575Arz implements InterfaceC27632Asu {
    public final Float LJLIL;
    public final Integer LJLILLLLZI;
    public final String LJLJI;
    public final Integer LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final ProductDetailReview LJLJL;
    public final String LJLJLJ;
    public final boolean LJLJLLL;
    public final int LJLL = EnumC27721AuL.REVIEW.getValue();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27575Arz)) {
            return false;
        }
        C27575Arz c27575Arz = (C27575Arz) obj;
        return o.LJ(this.LJLIL, c27575Arz.LJLIL) && o.LJ(this.LJLILLLLZI, c27575Arz.LJLILLLLZI) && o.LJ(this.LJLJI, c27575Arz.LJLJI) && o.LJ(this.LJLJJI, c27575Arz.LJLJJI) && o.LJ(this.LJLJJL, c27575Arz.LJLJJL) && o.LJ(this.LJLJJLL, c27575Arz.LJLJJLL) && o.LJ(this.LJLJL, c27575Arz.LJLJL) && o.LJ(this.LJLJLJ, c27575Arz.LJLJLJ) && this.LJLJLLL == c27575Arz.LJLJLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Float f = this.LJLIL;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LJLJI;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJJLL;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ProductDetailReview productDetailReview = this.LJLJL;
        int hashCode7 = (hashCode6 + (productDetailReview == null ? 0 : productDetailReview.hashCode())) * 31;
        String str4 = this.LJLJLJ;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.LJLJLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode8 + i;
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UsPdpReviewTitleVO(rating=");
        LIZ.append(this.LJLIL);
        LIZ.append(", reviewCount=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", reviewCountStr=");
        LIZ.append(this.LJLJI);
        LIZ.append(", shopReviewCount=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", shopReviewCountStr=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", shopSchema=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", productDetailReview=");
        LIZ.append(this.LJLJL);
        LIZ.append(", reviewCountStrV2=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", haveReviewItems=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJLLL, ')', LIZ);
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLL;
    }

    public C27575Arz(Float f, Integer num, String str, Integer num2, String str2, String str3, ProductDetailReview productDetailReview, String str4, boolean z) {
        this.LJLIL = f;
        this.LJLILLLLZI = num;
        this.LJLJI = str;
        this.LJLJJI = num2;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
        this.LJLJL = productDetailReview;
        this.LJLJLJ = str4;
        this.LJLJLLL = z;
    }
}
