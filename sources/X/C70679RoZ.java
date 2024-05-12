package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.DefaultReviewInnerPageCellStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.IReviewInnerPageCellStyle;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.review.style.GlobalReviewInnerPageCellStyle;

/* renamed from: X.RoZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70679RoZ extends AbstractC65781Prl implements InterfaceC65784Pro<IReviewInnerPageCellStyle> {
    public static final C70679RoZ LJLIL = new C70679RoZ();

    public C70679RoZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IReviewInnerPageCellStyle invoke() {
        C53571L0t.LIZ.getClass();
        if (C53571L0t.LIZ()) {
            return new GlobalReviewInnerPageCellStyle();
        }
        return new DefaultReviewInnerPageCellStyle();
    }
}
