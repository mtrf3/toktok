package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewState;
import kotlin.jvm.internal.o;

/* renamed from: X.RpU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70736RpU extends AbstractC65781Prl implements InterfaceC88472Yns<ProductReviewState, Integer> {
    public static final C70736RpU LJLIL = new C70736RpU();

    public C70736RpU() {
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
