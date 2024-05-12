package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragmentV1;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Rop, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70695Rop {
    public static ECBaseJediFragment LIZ() {
        String LIZ = C70293RiL.LIZ();
        if (o.LJ(LIZ, "us")) {
            return new ReviewFragmentV1();
        }
        if (o.LJ(LIZ, "global")) {
            return new ReviewFragment();
        }
        return new ProductReviewFragment();
    }
}
