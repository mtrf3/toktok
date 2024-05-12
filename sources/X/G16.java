package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import defpackage.t1;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G16 extends G0C<C36240EKe> {
    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_LOGIN_ID;
    }

    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        G1T g1t;
        boolean z = false;
        if (!t1.LJI() && (((g1t = (G1T) this.LIZ.LIZ(G1T.class)) == null || !g1t.fz()) && !GuestModeServiceImpl.LJIIJJI().LJIIJ())) {
            boolean z2 = ((InterfaceC40755Fz5) this.LIZ.LJLILLLLZI).LJFF().LIZ;
            boolean shouldShowForcedLogin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowForcedLogin(true);
            boolean LJ = GuestModeServiceImpl.LJIIJJI().LJ();
            if (z2 || shouldShowForcedLogin || LJ) {
                z = true;
            }
            StringBuilder LIZLLL = C00F.LIZLLL("shouldHandle requireLogin:", z2, ",shouldShowForcedLogin:", shouldShowForcedLogin, ",isUSFTC:");
            LIZLLL.append(LJ);
            C40741Fyr.LIZ(X1D.LIZIZ(LIZLLL));
        }
        return z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G16(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
    }

    @Override // X.G0C, X.G04
    public final void LIZ(G0D context, C35656Dz2 c35656Dz2, InterfaceC88472Yns interfaceC88472Yns) {
        Boolean bool;
        Boolean bool2;
        G2J g2j;
        C36240EKe c36240EKe = (C36240EKe) c35656Dz2;
        o.LJIIIZ(context, "context");
        super.LIZ(context, c36240EKe, interfaceC88472Yns);
        G2J g2j2 = null;
        if (c36240EKe != null) {
            bool = Boolean.valueOf(c36240EKe.LIZIZ);
        } else {
            bool = null;
        }
        G1T g1t = (G1T) this.LIZ.LIZ(G1T.class);
        if (g1t != null) {
            bool2 = Boolean.valueOf(g1t.Vu());
        } else {
            bool2 = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hasMultipleSmartLockAccount:");
        LIZ.append(bool2);
        LIZ.append(",shouldTrySmartLock:");
        LIZ.append(bool);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        boolean z = true;
        if (GuestModeServiceImpl.LJIIJJI().LJ()) {
            AccountService.LJIJ().LJI().showFTCCreateAccountView(((InterfaceC40755Fz5) context.LJLILLLLZI).LIZ(), true);
            return;
        }
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_LOGIN_ID;
        G2I LIZ2 = G2E.LIZ(enumC40761FzB);
        if (LIZ2 != null) {
            g2j = LIZ2.LJLJI;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        Boolean bool3 = Boolean.TRUE;
        if (!o.LJ(bool, bool3) || !o.LJ(bool2, bool3)) {
            z = false;
        }
        C35604DyC.LIZ(new RunnableC40863G1z(MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false), z, this));
        G2I LIZ3 = G2E.LIZ(enumC40761FzB);
        if (LIZ3 != null) {
            g2j2 = LIZ3.LJLJI;
        }
        G2E.LIZIZ(g2j2);
    }
}
