package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import kotlin.jvm.internal.o;

/* renamed from: X.G1y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40862G1y extends G0N<C76800UCe, InterfaceC40782FzW> {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(G21.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(G22.LJLIL);

    @Override // X.InterfaceC40768FzI
    public final void LIZIZ(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        ActivityC45651qj activityC45651qj = dependencies.LJJLL().invoke().get();
        if (activityC45651qj == null || activityC45651qj.isFinishing()) {
            return;
        }
        if (GuestModeServiceImpl.LJIIJJI().LJ()) {
            AccountService.LJIJ().LJI().showFTCCreateAccountView(activityC45651qj, true);
            return;
        }
        Bundle loginActivityBundle = ((IMandatoryLoginService) this.LIZIZ.getValue()).getLoginActivityBundle();
        loginActivityBundle.putBoolean("is_from_new_user_journey", true);
        loginActivityBundle.putBoolean("is_skippable_dialog", false);
        loginActivityBundle.putBoolean("is_express_login", dependencies.vu());
        G23.LIZ.storeLong("mandatory_login_shown_millis", System.currentTimeMillis());
        C78450Uqc c78450Uqc = new C78450Uqc();
        c78450Uqc.LIZ = activityC45651qj;
        c78450Uqc.LIZIZ = "cold_launch";
        c78450Uqc.LIZJ = "welcome_screen";
        if (dependencies.vu()) {
            c78450Uqc.LIZIZ = "click_login";
        }
        c78450Uqc.LIZLLL = loginActivityBundle;
        c78450Uqc.LJ = new G02(this, activityC45651qj, dependencies);
        AccountService.LJIJ().LJI().showLoginAndRegisterView(new C78451Uqd(c78450Uqc));
    }

    @Override // X.InterfaceC40768FzI
    public final Object LIZLLL(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC40768FzI
    public final boolean LJ(ComponentDependencies componentDependencies) {
        boolean z;
        if (componentDependencies.Uo0()) {
            return false;
        }
        if (componentDependencies.Y() && !((IAccountService) this.LIZ.getValue()).LJFF().isLogin()) {
            z = true;
        } else {
            z = false;
        }
        boolean shouldShowForcedLogin = ((IMandatoryLoginService) this.LIZIZ.getValue()).shouldShowForcedLogin(true);
        boolean LJ = GuestModeServiceImpl.LJIIJJI().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("shouldHandle requireDeeplinkLogin:");
        LIZ.append(z);
        LIZ.append(",requireMandatoryLogin:");
        LIZ.append(shouldShowForcedLogin);
        LIZ.append(',');
        LIZ.append(LJ);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        if (!z && !shouldShowForcedLogin && !LJ) {
            return false;
        }
        return true;
    }
}
