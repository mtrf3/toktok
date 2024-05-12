package com.ss.android.ugc.aweme.ml.api;

import X.C47322Ihi;
import X.C48585J4z;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;

/* loaded from: classes9.dex */
public final class MLDataCenterServiceDefault extends MLDataCenterService {
    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public boolean fillInputFeatures(InputFeaturesConfig inputFeaturesConfig, C47322Ihi c47322Ihi) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public boolean fillInputFeatures(InputFeaturesConfig inputFeaturesConfig, C47322Ihi c47322Ihi, boolean z) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService, com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public C48585J4z getFeedTrackRangeInfo(String str, int i, boolean z) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService
    public void trackPlayPrepare(String str, Aweme aweme, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLDataCenterService
    public void trackPlaytime(String str, long j, Aweme aweme, String str2) {
    }
}
