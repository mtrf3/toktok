package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("age_gate_ban")
/* renamed from: X.FuJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40459FuJ extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC40458FuI LJLILLLLZI;
    public final int LJLJI;

    public C40459FuJ() {
        this((ActivityC45651qj) null, 3);
    }

    @Override // X.M74
    public final boolean canShow() {
        if (!AV1.LJIIL()) {
            return false;
        }
        IComplianceDependService LIZ = C54936LhE.LIZ();
        if (LIZ != null && LIZ.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        Context LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            LJIIIIZZ = this.LJLIL;
        }
        if (LJIIIIZZ instanceof ActivityC45651qj) {
            return C54081LKj.LIZ(LJIIIIZZ, (LifecycleOwner) LJIIIIZZ);
        }
        return null;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJI;
    }

    public C40459FuJ(ActivityC45651qj activityC45651qj, InterfaceC40458FuI interfaceC40458FuI) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = interfaceC40458FuI;
        this.LJLJI = 90;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        FMX.LJIIL("age_gate_ban", new C188727au().LIZ);
        SmartRoute buildRoute = SmartRouter.buildRoute(context.LIZJ(), "aweme://hyd_action/account_banned");
        buildRoute.withParam("enter_from", "account_ban");
        buildRoute.open();
    }

    @Override // X.M74
    public final void onPopupStateChanged(M7A fromState, M7A toState) {
        InterfaceC40458FuI interfaceC40458FuI;
        o.LJIIIZ(fromState, "fromState");
        o.LJIIIZ(toState, "toState");
        super.onPopupStateChanged(fromState, toState);
        if (toState == M7A.SHOWED) {
            InterfaceC40458FuI interfaceC40458FuI2 = this.LJLILLLLZI;
            if (interfaceC40458FuI2 != null) {
                interfaceC40458FuI2.LIZIZ();
                return;
            }
            return;
        }
        if (toState != M7A.DISMISSED || (interfaceC40458FuI = this.LJLILLLLZI) == null) {
            return;
        }
        interfaceC40458FuI.LIZ();
    }

    public /* synthetic */ C40459FuJ(ActivityC45651qj activityC45651qj, int i) {
        this((i & 1) != 0 ? null : activityC45651qj, (InterfaceC40458FuI) null);
    }
}
