package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewState;
import kotlin.jvm.internal.o;

/* renamed from: X.RpV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70737RpV extends AbstractC65781Prl implements InterfaceC88472Yns<ProductReviewState, Integer> {
    public static final C70737RpV LJLIL = new C70737RpV();

    public C70737RpV() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(ProductReviewState productReviewState) {
        int i;
        ProductReviewState it = productReviewState;
        o.LJIIIZ(it, "it");
        Integer sortType = it.getSortType();
        if (sortType != null) {
            i = sortType.intValue();
        } else {
            i = 1;
        }
        return Integer.valueOf(i);
    }
}
