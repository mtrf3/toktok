package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_private_account_prompt")
/* renamed from: X.9ui, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251969ui extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI = LiveTryModeCountDownThresholdSetting.DEFAULT;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJI;
    }

    public C251969ui(ActivityC45651qj activityC45651qj, String str) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = str;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(LIZJ, "//private_account_prompt");
            buildRoute.withParam("enter_position", this.LJLILLLLZI);
            buildRoute.open();
        }
    }
}
