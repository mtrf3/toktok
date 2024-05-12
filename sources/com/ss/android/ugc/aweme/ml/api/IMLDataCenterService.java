package com.ss.android.ugc.aweme.ml.api;

import X.C47322Ihi;
import X.C48585J4z;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;

/* loaded from: classes9.dex */
public interface IMLDataCenterService {
    void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig);

    void checkAndInit();

    boolean fillInputFeatures(InputFeaturesConfig inputFeaturesConfig, C47322Ihi c47322Ihi);

    boolean fillInputFeatures(InputFeaturesConfig inputFeaturesConfig, C47322Ihi c47322Ihi, boolean z);

    C48585J4z getFeedTrackRangeInfo(String str, int i, boolean z);
}
