package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OU8 implements IAgeGateService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean LIZ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LIZIZ(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final Class<Object> LIZJ() {
        return Object.class;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final String LJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean LJFF(int i, String str, String str2, String str3) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean LJII() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIIIZ(Activity activity, InterfaceC62968OnU interfaceC62968OnU) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIIJ(String str) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIIL(Activity activity, InterfaceC62969OnV interfaceC62969OnV, String enterMethod) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterMethod, "enterMethod");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final int LJIILIIL() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final Class<Object> LJIILJJIL() {
        return Object.class;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final String LJIILL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean LJIILLIIL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final String LJIIZILJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIJ() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final String LJIJI() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIJJ(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIJJLI(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, C25853ACr c25853ACr, String str, int i, String str2, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void LJIL(String str) {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean isFtcForRegistration() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final IPNSAgeGateService LJIIIIZZ() {
        return new C62961OnN();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final EnumC62956OnI LJI() {
        return EnumC62956OnI.PASS;
    }
}
