package com.ss.android.ugc.aweme.compliance.business.agecontrol;

import X.AV1;
import X.C188727au;
import X.C221108m2;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C73969T1h;
import X.C84763XOl;
import X.FMX;
import X.LE6;
import X.LE8;
import Y.AfS61S0100000_9;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.api.services.agecontrol.IPNSAgeControlService;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class PNSAgeControlService implements IPNSAgeControlService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 79));

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agecontrol.IPNSAgeControlService
    public final void init() {
        boolean z = false;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("pns_age_control_for_kids", false);
        } catch (Throwable unused) {
        }
        if (!z) {
            return;
        }
        C84763XOl.LIZLLL().LJIILIIL().LJJIFFI(new LE6(this)).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS61S0100000_9(this, 1));
    }

    public static IPNSAgeControlService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IPNSAgeControlService.class, false);
        if (LIZ != null) {
            return (IPNSAgeControlService) LIZ;
        }
        if (C58096Mr6.LLLZIIL == null) {
            synchronized (IPNSAgeControlService.class) {
                if (C58096Mr6.LLLZIIL == null) {
                    C58096Mr6.LLLZIIL = new PNSAgeControlService();
                }
            }
        }
        return C58096Mr6.LLLZIIL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agecontrol.IPNSAgeControlService
    public final boolean LIZ(String str) {
        boolean z = false;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("pns_age_control_for_kids", false);
        } catch (Throwable unused) {
        }
        boolean z2 = true;
        if (!z) {
            return true;
        }
        if (AV1.LJIIJJI() && !(z2 = LE8.LIZ.contains(str))) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "age_control_kids");
            c188727au.LJIIIZ("description", str);
            FMX.LJIIL("pns_analysis_event", c188727au.LIZ);
        }
        return z2;
    }
}
