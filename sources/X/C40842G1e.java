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

/* renamed from: X.G1e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40842G1e extends G0C<C36239EKd> {
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;

    public final void LJ() {
        ActivityC45651qj LIZ = ((InterfaceC40755Fz5) this.LIZ.LJLILLLLZI).LIZ();
        ICloudTokenLoginService createICloudTokenLoginServicebyMonsterPlugin = CloudTokenLoginService.createICloudTokenLoginServicebyMonsterPlugin(false);
        if (createICloudTokenLoginServicebyMonsterPlugin.shouldShowOneClickLoginPanel()) {
            createICloudTokenLoginServicebyMonsterPlugin.tryStartMandatoryOneClickLogin(LIZ, new Bundle(), C40856G1s.LJLIL, new AqS156S0100000_6(this, 7));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("launchAgeGate activity:");
        LIZ2.append(LIZ);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ2));
        GuestModeServiceImpl.LJIIJJI().LIZLLL();
        EOO.LIZIZ = true;
        HashMap hashMap = new HashMap();
        hashMap.put("is_in_personalized_nuj", String.valueOf(EOO.LIZIZ()));
        hashMap.put("registration_flow", "nujComponent");
        IRegistrationAgeGateService ageGateService = (IRegistrationAgeGateService) this.LJ.getValue();
        C40845G1h c40845G1h = new C40845G1h(this);
        AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow = AgeGateSdkRegistrationFlow.NEW_COMPONENT;
        o.LJIIIIZZ(ageGateService, "ageGateService");
        IRegistrationAgeGateService.DefaultImpls.verifyAgeForRegistrationSDK$default(ageGateService, LIZ, hashMap, null, ageGateSdkRegistrationFlow, c40845G1h, true, null, 68, null);
    }

    @Override // X.G0C
    public final void LIZLLL() {
        super.LIZLLL();
        ((IRegistrationAgeGateService) this.LJ.getValue()).dismiss();
        AccountService.LJIJ().LJFF().removeUserChangeListener((InterfaceC252619vl) this.LIZLLL.getValue());
    }

    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_AGE_GATE_ID;
    }

    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        C36239EKd c36239EKd = (C36239EKd) c35656Dz2;
        if (t1.LJI()) {
            return false;
        }
        G1T g1t = (G1T) this.LIZ.LIZ(G1T.class);
        if ((g1t != null && g1t.yX()) || c36239EKd == null || !c36239EKd.LIZIZ) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40842G1e(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
        this.LIZLLL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 8));
        this.LJ = C221108m2.LIZIZ(C40849G1l.LJLIL);
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
