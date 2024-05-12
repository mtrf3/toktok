package com.ss.android.ugc.aweme.publish.service;

import X.C52250Kf0;
import com.ss.android.ugc.aweme.services.publish.FixedCaptionsExperimentService;

/* loaded from: classes10.dex */
public final class FixedCaptionsExperimentServiceImpl implements FixedCaptionsExperimentService {
    @Override // com.ss.android.ugc.aweme.services.publish.FixedCaptionsExperimentService
    public final boolean isControl() {
        return C52250Kf0.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.publish.FixedCaptionsExperimentService
    public final boolean isTest() {
        return C52250Kf0.LIZIZ();
    }
}
