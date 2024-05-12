package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentReviewDetailsFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9zF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254779zF {
    public static void LIZ(ActivityC45651qj activityC45651qj, CollectionDetailModel collectionDetailModel, String str, boolean z) {
        o.LJIIIZ(collectionDetailModel, "collectionDetailModel");
        PaidContentReviewDetailsFragment.LJLJJI = collectionDetailModel;
        SmartRoute buildRoute = SmartRouter.buildRoute(activityC45651qj, "//sdp/reviews");
        buildRoute.withParam("enter_from", str);
        if (!z) {
            buildRoute.withAnimation(R.anim.eg, R.anim.eg);
        }
        buildRoute.open();
        activityC45651qj.overridePendingTransition(0, 0);
    }
}
