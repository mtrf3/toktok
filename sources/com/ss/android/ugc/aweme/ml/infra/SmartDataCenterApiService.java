package com.ss.android.ugc.aweme.ml.infra;

import X.C47322Ihi;
import X.C48568J4i;
import X.C48573J4n;

/* loaded from: classes9.dex */
public abstract class SmartDataCenterApiService implements ISmartDataCenterApiService {
    public static final C48573J4n Companion = new C48573J4n();
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService
    public abstract /* synthetic */ void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig);

    public abstract /* synthetic */ boolean fillInputFeatures(InputFeaturesConfig inputFeaturesConfig, C47322Ihi c47322Ihi);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService
    public abstract /* synthetic */ boolean fillInputFeatures(InputFeaturesConfig inputFeaturesConfig, C47322Ihi c47322Ihi, boolean z);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartDataCenterApiService instance() {
        Companion.getClass();
        return C48568J4i.LIZ;
    }
}
