package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.ActivityC45651qj;
import X.C38985FRt;
import X.C38986FRu;
import X.C39257Fav;
import X.C39263Fb1;
import X.C39264Fb2;
import X.C40433Ftt;
import X.C58096Mr6;
import X.E1J;
import X.E1L;
import X.EAW;
import X.EnumC39259Fax;
import X.HG3;
import X.InterfaceC39262Fb0;
import X.M78;
import X.RBX;
import android.app.Activity;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AutobackupService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFComplianceAssem;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class TpcConsentServiceImpl implements ITpcConsentService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void LIZ() {
        M78 stateWrapper;
        C39263Fb1 LIZJ = C39257Fav.LIZJ();
        C40433Ftt c40433Ftt = LIZJ.LIZLLL;
        if (c40433Ftt != null && (stateWrapper = c40433Ftt.getStateWrapper()) != null) {
            stateWrapper.LIZ();
        }
        LIZJ.LIZLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void LIZLLL() {
        C39257Fav.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void LJFF() {
        C39263Fb1 LIZJ = C39257Fav.LIZJ();
        if (LIZJ.LIZJ == -1) {
            LIZJ.LIZJ = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void LJI() {
        if (((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        if (C39257Fav.LIZLLL() != EnumC39259Fax.US && C39257Fav.LIZLLL() != EnumC39259Fax.EU) {
            return;
        }
        Keva keva = C39263Fb1.LJIIIIZZ;
        keva.storeBoolean("have_passed_consent", false);
        keva.storeInt("consent_reason", 9);
        Iterator<? extends InterfaceC39262Fb0> it = C39263Fb1.LJIIIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void LJIIIIZZ() {
        C39257Fav.LIZJ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void LJIIL() {
        C39257Fav.LIZJ().LIZIZ(false);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final boolean LJIILJJIL() {
        return C39257Fav.LJII();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final boolean LJIILL() {
        return C39257Fav.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final boolean LJIILLIIL() {
        boolean z = AutobackupService.LIZJ().LIZIZ().getBoolean("consent_acceptance_from_backup", false);
        String str = C39263Fb1.LJII;
        boolean z2 = Keva.getRepo(str).getBoolean("is_consent_accepted", false);
        boolean contains = Keva.getRepo(str).contains("ug_should_show");
        if (!z2 && ((!z || !contains) && EAW.LIZ())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final EnumC39259Fax getRegion() {
        return C39257Fav.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void initialize() {
        C39263Fb1 LIZJ = C39257Fav.LIZJ();
        LIZJ.getClass();
        ((IPNSDeviceConsentService) C39263Fb1.LJI.getValue()).LJ((C39264Fb2) LIZJ.LJ.getValue());
    }

    public static ITpcConsentService LJIIZILJ() {
        Object LIZ = C58096Mr6.LIZ(ITpcConsentService.class, false);
        if (LIZ != null) {
            return (ITpcConsentService) LIZ;
        }
        if (C58096Mr6.LLZLLIL == null) {
            synchronized (ITpcConsentService.class) {
                if (C58096Mr6.LLZLLIL == null) {
                    C58096Mr6.LLZLLIL = new TpcConsentServiceImpl();
                }
            }
        }
        return C58096Mr6.LLZLLIL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void LIZJ() {
        C39263Fb1.LJIIIIZZ.storeBoolean("user_logged_in_atleast_once", true);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void LIZIZ(int i) {
        C39257Fav.LJI(i);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final boolean LJ(MFComplianceAssem mFComplianceAssem) {
        C39257Fav.LIZJ().LIZIZ = mFComplianceAssem;
        return C39257Fav.LJII();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final boolean LJIIJJI(String str) {
        boolean z;
        if (str == null || s.LJJJLZIJ(str, "terms-of-use", false) || s.LJJJLZIJ(str, "terms-of-service", false) || s.LJJJLZIJ(str, "privacy-policy", false) || s.LJJJLZIJ(str, "cookie-policy-eu", false) || s.LJJJLZIJ(str, "feedback.tiktokv.com", false)) {
            z = true;
        } else {
            z = false;
        }
        C39257Fav.LIZJ().LIZIZ = null;
        if (C39257Fav.LJII() && !z) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void LJIILIIL(int i) {
        Keva keva = C39263Fb1.LJIIIIZZ;
        keva.storeBoolean("have_passed_consent", false);
        keva.storeInt("consent_reason", i);
        Iterator<? extends InterfaceC39262Fb0> it = C39263Fb1.LJIIIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final boolean LJII(ActivityC45651qj activityC45651qj, String str) {
        C39263Fb1 LIZJ = C39257Fav.LIZJ();
        LIZJ.getClass();
        if ((E1J.LIZ() || E1L.LIZ()) && !C38986FRu.LIZ().LIZ && activityC45651qj.getIntent().getBooleanExtra(C38985FRt.LIZIZ.LJIIIZ(), false)) {
            return false;
        }
        LIZJ.LIZLLL(activityC45651qj, str, true);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void LJIIIZ(ActivityC45651qj activityC45651qj, String str) {
        C39257Fav.LIZJ().LIZLLL(activityC45651qj, str, false);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void LJIIJ(Activity activity, String str) {
        o.LJIIIZ(activity, "activity");
        C39257Fav.LIZJ().LIZLLL(activity, str, true);
    }
}
