package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;

/* renamed from: X.Rzt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71381Rzt {
    public static void LIZ(ActivityC45651qj activityC45651qj, ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment, boolean z) {
        float f = activityC45651qj.getResources().getDisplayMetrics().heightPixels * 0.85f;
        ASL LIZ = C249109q6.LIZ(1);
        if (z) {
            LIZ.LIZ.LJLLLLLL = (int) f;
        }
        LIZ.LIZIZ(eCommerceAnchorPanelFragment);
        LIZ.LJ(eCommerceAnchorPanelFragment);
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LLD = true;
        tuxSheet.LJZL = false;
        tuxSheet.LJLLJ = true;
        tuxSheet.LJZI = false;
        C1DG.LJII(activityC45651qj, "it.supportFragmentManager", tuxSheet, "ECommerceAnchorPanelFragment");
        ECommerceAnchorPanelFragment.LLIIL = true;
    }
}
