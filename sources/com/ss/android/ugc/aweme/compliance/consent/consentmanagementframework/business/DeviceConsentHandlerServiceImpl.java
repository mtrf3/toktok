package com.ss.android.ugc.aweme.compliance.consent.consentmanagementframework.business;

import X.C221108m2;
import X.C47261Igj;
import X.C58196Msi;
import X.C62822Ol8;
import X.C62985Onl;
import X.C77275UUl;
import X.EnumC61652OHo;
import com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DeviceConsentHandlerServiceImpl implements IPNSConsentHandlerService {
    public final List<String> LIZ = C47261Igj.LJJIJ("device_consent");
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 153));
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C58196Msi.LJLIL);
    public final EnumC61652OHo LIZLLL = EnumC61652OHo.DEVICE_CONSENT;
    public final Set<String> LJ = C77275UUl.LJIIIIZZ("AT", "BE", "BG", "CH", "CY", "CZ", "DE", "DK", "EE", "EL", "ES", "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IS", "IT", "LI", "LT", "LU", "LV", "MT", "NL", "NO", "PL", "PT", "RO", "SE", "SI", "SK");

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService
    public final void LJ() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService
    public final void LJJLIIJ() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService
    public final void onDismiss() {
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService
    public final C62985Onl LIZIZ() {
        return (C62985Onl) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService
    public final EnumC61652OHo getPriority() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService
    public final boolean LIZ(String consentKey) {
        o.LJIIIZ(consentKey, "consentKey");
        return this.LIZ.contains(consentKey);
    }
}
