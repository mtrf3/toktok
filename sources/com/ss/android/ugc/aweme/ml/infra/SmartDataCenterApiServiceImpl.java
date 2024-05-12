package com.ss.android.ugc.aweme.ml.infra;

import X.C47322Ihi;
import X.C48563J4d;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;

/* loaded from: classes9.dex */
public final class SmartDataCenterApiServiceImpl extends SmartDataCenterApiService {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiService, com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService
    public final void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig) {
        MLDataCenterService.Companion.getClass();
        C48563J4d.LIZ.addSceneModelConfig(inputFeaturesConfig);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiService
    public final boolean fillInputFeatures(InputFeaturesConfig inputFeaturesConfig, C47322Ihi c47322Ihi) {
        MLDataCenterService.Companion.getClass();
        return C48563J4d.LIZ.fillInputFeatures(inputFeaturesConfig, c47322Ihi);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiService, com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService
    public final boolean fillInputFeatures(InputFeaturesConfig inputFeaturesConfig, C47322Ihi c47322Ihi, boolean z) {
        MLDataCenterService.Companion.getClass();
        return C48563J4d.LIZ.fillInputFeatures(inputFeaturesConfig, c47322Ihi, z);
    }
}
