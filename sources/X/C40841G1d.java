package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.ICloudTokenLoginService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;
import com.ss.android.ugc.aweme.services.CloudTokenLoginService;
import com.ss.android.ugc.aweme.services.IRegistrationAgeGateService;
import defpackage.t1;
import java.util.HashMap;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.G1d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40841G1d extends G0C<C40783FzX> {
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;

    public final void LJ() {
        ActivityC45651qj LIZ = ((InterfaceC40755Fz5) this.LIZ.LJLILLLLZI).LIZ();
        ICloudTokenLoginService createICloudTokenLoginServicebyMonsterPlugin = CloudTokenLoginService.createICloudTokenLoginServicebyMonsterPlugin(false);
        if (createICloudTokenLoginServicebyMonsterPlugin.shouldShowOneClickLoginPanel()) {
            createICloudTokenLoginServicebyMonsterPlugin.tryStartMandatoryOneClickLogin(LIZ, new Bundle(), C40857G1t.LJLIL, new AqS156S0100000_6(this, 9));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("launchAgeGate activity:");
        LIZ2.append(LIZ);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ2));
        GuestModeServiceImpl.LJIIJJI().LIZLLL();
        EOO.LIZIZ = true;
        HashMap LIZ3 = C45243HpH.LIZ("is_in_personalized_nuj", "1", "registration_flow", "NUJ_component_ad_compliance_provider");
        IRegistrationAgeGateService ageGateService = (IRegistrationAgeGateService) this.LJ.getValue();
        C40846G1i c40846G1i = new C40846G1i(this);
        AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow = AgeGateSdkRegistrationFlow.NEW_COMPONENT;
        o.LJIIIIZZ(ageGateService, "ageGateService");
        IRegistrationAgeGateService.DefaultImpls.verifyAgeForRegistrationSDK$default(ageGateService, LIZ, LIZ3, null, ageGateSdkRegistrationFlow, c40846G1i, true, null, 68, null);
    }

    @Override // X.G0C
    public final void LIZLLL() {
        super.LIZLLL();
        ((IRegistrationAgeGateService) this.LJ.getValue()).dismiss();
        AccountService.LJIJ().LJFF().removeUserChangeListener((InterfaceC252619vl) this.LIZLLL.getValue());
    }

    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_AD_SUBSCRIPTION_AGE_GATE_ID;
    }

    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        String str;
        C40783FzX c40783FzX = (C40783FzX) c35656Dz2;
        if (c40783FzX != null) {
            str = c40783FzX.LIZJ;
        } else {
            str = null;
        }
        FH5.LIZIZ().getClass();
        FH5.LIZ(str);
        if (EOO.LIZIZ || t1.LJI() || c40783FzX == null) {
            return false;
        }
        return o.LJ(c40783FzX.LIZIZ, Boolean.TRUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40841G1d(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
        this.LIZLLL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 10));
        this.LJ = C221108m2.LIZIZ(C40850G1m.LJLIL);
    }

    @Override // X.G0C, X.G04
    public final void LIZ(G0D context, C35656Dz2 c35656Dz2, InterfaceC88472Yns interfaceC88472Yns) {
        G2J g2j;
        o.LJIIIZ(context, "context");
        super.LIZ(context, c35656Dz2, interfaceC88472Yns);
        AccountService.LJIJ().LJFF().addUserChangeListener((InterfaceC252619vl) this.LIZLLL.getValue());
        EnumC40761FzB enumC40761FzB = EnumC40761FzB.JOURNEY_AGE_GATE_ID;
        G2I LIZ = G2E.LIZ(enumC40761FzB);
        G2J g2j2 = null;
        if (LIZ != null) {
            g2j = LIZ.LJLJI;
        } else {
            g2j = null;
        }
        G2E.LIZJ(g2j);
        LJ();
        G2I LIZ2 = G2E.LIZ(enumC40761FzB);
        if (LIZ2 != null) {
            g2j2 = LIZ2.LJLJI;
        }
        G2E.LIZIZ(g2j2);
    }
}
