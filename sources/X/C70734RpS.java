package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.DefaultReviewGalleryBottomInfoStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.IReviewGalleryBottomInfoStyle;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.review.style.GlobalReviewGalleryBottomInfoStyle;

/* renamed from: X.RpS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70734RpS extends AbstractC65781Prl implements InterfaceC65784Pro<IReviewGalleryBottomInfoStyle> {
    public static final C70734RpS LJLIL = new C70734RpS();

    public C70734RpS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IReviewGalleryBottomInfoStyle invoke() {
        C53571L0t.LIZ.getClass();
        if (C53571L0t.LIZ()) {
            return new GlobalReviewGalleryBottomInfoStyle();
        }
        return new DefaultReviewGalleryBottomInfoStyle();
    }
}
