package com.ss.android.ugc.aweme.internal;

import X.C52707KmN;
import X.C58096Mr6;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.publish.FixedCaptionsExperimentService;

/* loaded from: classes10.dex */
public final class CrossLanguageUserExperiment implements ICrossLanguageUserService {
    public static ICrossLanguageUserService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ICrossLanguageUserService.class, false);
        if (LIZ != null) {
            return (ICrossLanguageUserService) LIZ;
        }
        if (C58096Mr6.B1 == null) {
            synchronized (ICrossLanguageUserService.class) {
                if (C58096Mr6.B1 == null) {
                    C58096Mr6.B1 = new CrossLanguageUserExperiment();
                }
            }
        }
        return C58096Mr6.B1;
    }

    @Override // com.ss.android.ugc.aweme.internal.ICrossLanguageUserService
    public final boolean LIZ() {
        if (((Number) C52707KmN.LIZ.getValue()).intValue() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.internal.ICrossLanguageUserService
    public final boolean LIZIZ() {
        FixedCaptionsExperimentService fixedCaptionsExperimentService;
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager == null || (fixedCaptionsExperimentService = (FixedCaptionsExperimentService) serviceManager.getService(FixedCaptionsExperimentService.class)) == null || !fixedCaptionsExperimentService.isTest()) {
            return false;
        }
        return true;
    }
}
