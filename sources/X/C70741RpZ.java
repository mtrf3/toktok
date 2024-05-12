package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryState;
import kotlin.jvm.internal.o;

/* renamed from: X.RpZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70741RpZ extends AbstractC65781Prl implements InterfaceC88472Yns<ReviewGalleryState, ReviewGalleryState> {
    public static final C70741RpZ LJLIL = new C70741RpZ();

    public C70741RpZ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ReviewGalleryState invoke(ReviewGalleryState reviewGalleryState) {
        ReviewGalleryState setState = reviewGalleryState;
        o.LJIIIZ(setState, "$this$setState");
        return ReviewGalleryState.copy$default(setState, null, null, null, null, null, null, 0, null, false, 0, 0, 0, null, null, !setState.getShowOtherInfo(), null, null, 114687, null);
    }
}
