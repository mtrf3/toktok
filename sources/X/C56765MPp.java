package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.MPp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56765MPp extends C56766MPq implements MSP {
    @Override // X.MSP
    public final void e7() {
        ActivityC45651qj LJIIJ = LJIIJ();
        User curUser = HG3.LJIILL().getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://user/qna/profile/");
        LIZ.append(curUser.getUid());
        SmartRoute buildRoute = SmartRouter.buildRoute(LJIIJ, X1D.LIZIZ(LIZ));
        buildRoute.withParam("enter_from", "notification_page");
        buildRoute.withParam("enter_method", "click_turn_on_qna");
        buildRoute.open();
    }
}
