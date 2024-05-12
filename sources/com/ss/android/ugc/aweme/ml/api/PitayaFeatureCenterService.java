package com.ss.android.ugc.aweme.ml.api;

import X.J4D;
import X.J5T;

/* loaded from: classes9.dex */
public abstract class PitayaFeatureCenterService implements IPitayaFeatureCenterService {
    public static final J4D Companion = new J4D();

    @Override // com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService
    public abstract /* synthetic */ void checkAndInit();

    @Override // com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService
    public abstract /* synthetic */ void onSlideSpeedUpdate(Float f, Float f2, Float f3);

    public static final IPitayaFeatureCenterService instance() {
        Companion.getClass();
        return J5T.LIZ;
    }
}
