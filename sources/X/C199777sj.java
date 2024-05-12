package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_compliance_subscription")
/* renamed from: X.7sj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199777sj extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final int LJLILLLLZI;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLILLLLZI;
    }

    public C199777sj(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = 133;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(LIZJ, "//commercialize/compliance/subscription/subscription_page");
            buildRoute.withParam("enter_from", 1);
            buildRoute.open();
        }
    }
}
