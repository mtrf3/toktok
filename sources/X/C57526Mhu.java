package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2;

/* renamed from: X.Mhu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57526Mhu implements InterfaceC57531Mhz {
    public final /* synthetic */ EmptyGuideV2 LIZ;

    public final void LIZ() {
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LIZ.LJLJLJ, "//friends/ffp");
        buildRoute.withParam("previous_page", "");
        buildRoute.open();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "homepage_follow");
        c188727au.LJIIIZ("enter_method", "click_card");
        c188727au.LJIIIZ("trigger_reason", "cold_launch_non_login");
        FMX.LJIIL("click_add_friends", c188727au.LIZ);
    }

    public C57526Mhu(EmptyGuideV2 emptyGuideV2) {
        this.LIZ = emptyGuideV2;
    }
}
