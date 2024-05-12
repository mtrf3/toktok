package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;

/* renamed from: X.S0a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71388S0a implements VTX {
    public final /* synthetic */ ECommerceAnchorPanelFragment LIZ;

    public C71388S0a(ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment) {
        this.LIZ = eCommerceAnchorPanelFragment;
    }

    @Override // X.VTY
    public final void LIZ(C80217Ve1 c80217Ve1, int i) {
        ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = this.LIZ;
        if (!eCommerceAnchorPanelFragment.LLIIII || i == 0) {
            return;
        }
        int i2 = eCommerceAnchorPanelFragment.LLII;
        if (i2 == 0) {
            eCommerceAnchorPanelFragment.LLII = i;
        } else {
            eCommerceAnchorPanelFragment.LLIFFJFJJ = i2 - i;
        }
        C7A9 c7a9 = eCommerceAnchorPanelFragment.LLIIIJ;
        if (c7a9 != null) {
            c7a9.LIZIZ();
        }
        this.LIZ.Ll();
    }
}
