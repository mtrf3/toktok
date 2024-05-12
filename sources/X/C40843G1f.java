package X;

import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.ICloudTokenLoginService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.account.main.LoginAndConsentAssem;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;
import com.ss.android.ugc.aweme.services.CloudTokenLoginService;
import com.ss.android.ugc.aweme.services.IRegistrationAgeGateService;
import com.ss.android.ugc.aweme.services.SmartLockEventHelper;
import defpackage.t1;
import java.util.HashMap;
import kotlin.jvm.internal.AqS63S0110000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.G1f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40843G1f implements E5J {
    public final /* synthetic */ LoginAndConsentAssem LIZ;
    public final /* synthetic */ C34K LIZIZ;
    public final /* synthetic */ C34K LIZJ;
    public final /* synthetic */ C68322mC<String> LIZLLL;
    public final /* synthetic */ C68322mC<String> LJ;
    public final /* synthetic */ boolean LJFF;

    @Override // X.E5J
    public final void LIZ() {
        if (EOO.LJIIIIZZ() && !t1.LJI()) {
            C38985FRt c38985FRt = C38985FRt.LIZIZ;
            if (!c38985FRt.LJIIL().LIZLLL() && !c38985FRt.LJIIL().LIZ()) {
                this.LIZ.getClass();
                boolean z = Keva.getRepo("quick_login_repo").getBoolean("has_smart_lock_info", false);
                SmartLockEventHelper.INSTANCE.onCheckSmartLockInfo$account_awemeaccount_release(z);
                if (!z) {
                    ICloudTokenLoginService createICloudTokenLoginServicebyMonsterPlugin = CloudTokenLoginService.createICloudTokenLoginServicebyMonsterPlugin(false);
                    if (createICloudTokenLoginServicebyMonsterPlugin.shouldShowOneClickLoginPanel()) {
                        ActivityC45651qj activityC45651qj = this.LIZ.LJLIL;
                        if (activityC45651qj != null) {
                            createICloudTokenLoginServicebyMonsterPlugin.tryStartMandatoryOneClickLogin(activityC45651qj, new Bundle(), C40855G1r.LJLIL, new AqS63S0110000_6(this.LIZ, this.LJFF, 0));
                            return;
                        } else {
                            o.LJIJI("activity");
                            throw null;
                        }
                    }
                    GuestModeServiceImpl.LJIIJJI().LIZLLL();
                    AccountService.LJIJ().LJFF().addUserChangeListener((InterfaceC252619vl) this.LIZ.LJLJJL.getValue());
                    this.LIZ.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("is_in_personalized_nuj", String.valueOf(EOO.LIZIZ()));
                    hashMap.put("registration_flow", "loginConsent");
                    IRegistrationAgeGateService ageGateService = (IRegistrationAgeGateService) this.LIZ.LJLJJI.getValue();
                    LoginAndConsentAssem loginAndConsentAssem = this.LIZ;
                    ActivityC45651qj activityC45651qj2 = loginAndConsentAssem.LJLIL;
                    if (activityC45651qj2 != null) {
                        C40844G1g c40844G1g = new C40844G1g(loginAndConsentAssem);
                        AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow = AgeGateSdkRegistrationFlow.LOGIN_CONSENT;
                        o.LJIIIIZZ(ageGateService, "ageGateService");
                        IRegistrationAgeGateService.DefaultImpls.verifyAgeForRegistrationSDK$default(ageGateService, activityC45651qj2, hashMap, null, ageGateSdkRegistrationFlow, c40844G1g, true, null, 68, null);
                        return;
                    }
                    o.LJIJI("activity");
                    throw null;
                }
            }
        }
        if (!this.LIZIZ.element) {
            return;
        }
        LoginAndConsentAssem loginAndConsentAssem2 = this.LIZ;
        boolean z2 = this.LIZJ.element;
        String str = this.LIZLLL.element;
        String str2 = this.LJ.element;
        ActivityC45651qj activityC45651qj3 = loginAndConsentAssem2.LJLIL;
        if (activityC45651qj3 != null) {
            activityC45651qj3.runOnUiThread(new G20(loginAndConsentAssem2, z2, str, str2));
        } else {
            o.LJIJI("activity");
            throw null;
        }
    }

    public C40843G1f(LoginAndConsentAssem loginAndConsentAssem, C34K c34k, C34K c34k2, C68322mC<String> c68322mC, C68322mC<String> c68322mC2, boolean z) {
        this.LIZ = loginAndConsentAssem;
        this.LIZIZ = c34k;
        this.LIZJ = c34k2;
        this.LIZLLL = c68322mC;
        this.LJ = c68322mC2;
        this.LJFF = z;
    }
}
