package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.C39257Fav;
import X.C39263Fb1;
import X.C58096Mr6;
import X.C61901ORd;
import X.C62913Omb;
import X.C67612l3;
import X.InterfaceC39262Fb0;
import X.ORZ;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo;
import com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class TermsConsentServiceImpl implements ITermsConsentService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final boolean LIZ() {
        return C39257Fav.LJ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final void LJ() {
        C67612l3.LIZ(C39257Fav.LJ());
        C39263Fb1.LJIIIZ = ORZ.LLIIJI(new C61901ORd(), C39263Fb1.LJIIIZ);
    }

    public static ITermsConsentService LJII() {
        Object LIZ = C58096Mr6.LIZ(ITermsConsentService.class, false);
        if (LIZ != null) {
            return (ITermsConsentService) LIZ;
        }
        if (C58096Mr6.LLZLL == null) {
            synchronized (ITermsConsentService.class) {
                if (C58096Mr6.LLZLL == null) {
                    C58096Mr6.LLZLL = new TermsConsentServiceImpl();
                }
            }
        }
        return C58096Mr6.LLZLL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final TermsConsentInfo LIZJ() {
        ComplianceSetting LIZ = C62913Omb.LIZIZ.LIZ();
        if (LIZ != null) {
            return LIZ.getTermsConsentInfo();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final TermsConsentInfo LIZLLL() {
        ComplianceSetting LIZ = C62913Omb.LIZIZ.LIZ();
        if (LIZ != null) {
            return LIZ.getTermConsentInfoNewUsers();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final boolean LJFF() {
        Boolean addTermsConsentForRegister;
        ComplianceSetting LIZ = C62913Omb.LIZIZ.LIZ();
        if (LIZ != null && (addTermsConsentForRegister = LIZ.getAddTermsConsentForRegister()) != null) {
            return addTermsConsentForRegister.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final void LIZIZ(InterfaceC39262Fb0 interfaceC39262Fb0) {
        C39263Fb1.LJIIIZ = ORZ.LLIIJI(interfaceC39262Fb0, C39263Fb1.LJIIIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final void LJI(InterfaceC39262Fb0 listener) {
        o.LJIIIZ(listener, "listener");
        C39263Fb1.LJIIIZ = ORZ.LLIIIJ(listener, C39263Fb1.LJIIIZ);
    }
}
