package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.ICloudTokenLoginService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;
import com.ss.android.ugc.aweme.services.CloudTokenLoginService;
import com.ss.android.ugc.aweme.services.IRegistrationAgeGateService;
import java.util.HashMap;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.G1c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40840G1c extends G0N<C76800UCe, InterfaceC40803Fzr> {
    public ActivityC45651qj LIZ;
    public InterfaceC65784Pro<C76800UCe> LIZIZ;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 156));
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C40851G1n.LJLIL);

    public final void LJIIIIZZ() {
        ((IRegistrationAgeGateService) this.LIZLLL.getValue()).dismiss();
        AccountService.LJIJ().LJFF().removeUserChangeListener((InterfaceC252619vl) this.LIZJ.getValue());
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        } else {
            o.LJIJI("nextStepRunnable");
            throw null;
        }
    }

    @Override // X.InterfaceC40768FzI
    public final Object LIZLLL(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    @Override // X.InterfaceC40768FzI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(com.ss.android.ugc.aweme.journey.step.ComponentDependencies r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40840G1c.LJ(com.ss.android.ugc.aweme.journey.step.ComponentDependencies):boolean");
    }

    @Override // X.InterfaceC40768FzI
    /* renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final void LIZIZ(InterfaceC40803Fzr dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        this.LIZIZ = dependencies.LJJJJI();
        ICloudTokenLoginService createICloudTokenLoginServicebyMonsterPlugin = CloudTokenLoginService.createICloudTokenLoginServicebyMonsterPlugin(false);
        if (createICloudTokenLoginServicebyMonsterPlugin.shouldShowOneClickLoginPanel()) {
            ActivityC45651qj activityC45651qj = this.LIZ;
            if (activityC45651qj != null) {
                createICloudTokenLoginServicebyMonsterPlugin.tryStartMandatoryOneClickLogin(activityC45651qj, new Bundle(), C40854G1q.LJLIL, new AqS153S0200000_6(this, dependencies, 31));
                return;
            } else {
                o.LJIJI("fragmentActivity");
                throw null;
            }
        }
        AccountService.LJIJ().LJFF().addUserChangeListener((InterfaceC252619vl) this.LIZJ.getValue());
        GuestModeServiceImpl.LJIIJJI().LIZLLL();
        EOO.LIZIZ = true;
        HashMap hashMap = new HashMap();
        hashMap.put("is_in_personalized_nuj", String.valueOf(EOO.LIZIZ()));
        hashMap.put("registration_flow", "componentProvider");
        IRegistrationAgeGateService ageGateService = (IRegistrationAgeGateService) this.LIZLLL.getValue();
        ActivityC45651qj activityC45651qj2 = this.LIZ;
        if (activityC45651qj2 != null) {
            C40847G1j c40847G1j = new C40847G1j(this);
            AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow = AgeGateSdkRegistrationFlow.COMPONENT_PROVIDER;
            o.LJIIIIZZ(ageGateService, "ageGateService");
            IRegistrationAgeGateService.DefaultImpls.verifyAgeForRegistrationSDK$default(ageGateService, activityC45651qj2, hashMap, null, ageGateSdkRegistrationFlow, c40847G1j, true, null, 68, null);
            return;
        }
        o.LJIJI("fragmentActivity");
        throw null;
    }
}
