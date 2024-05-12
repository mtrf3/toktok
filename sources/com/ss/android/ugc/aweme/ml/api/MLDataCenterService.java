package com.ss.android.ugc.aweme.ml.api;

import X.C47322Ihi;
import X.C48562J4c;
import X.C48563J4d;
import X.C48585J4z;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;

/* loaded from: classes9.dex */
public abstract class MLDataCenterService implements IMLDataCenterService {
    public static final C48562J4c Companion = new C48562J4c();
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public abstract /* synthetic */ void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public abstract /* synthetic */ void checkAndInit();

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public abstract /* synthetic */ boolean fillInputFeatures(InputFeaturesConfig inputFeaturesConfig, C47322Ihi c47322Ihi);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public abstract /* synthetic */ boolean fillInputFeatures(InputFeaturesConfig inputFeaturesConfig, C47322Ihi c47322Ihi, boolean z);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public abstract /* synthetic */ C48585J4z getFeedTrackRangeInfo(String str, int i, boolean z);

    public abstract /* synthetic */ void trackPlayPrepare(String str, Aweme aweme, String str2);

    public abstract /* synthetic */ void trackPlaytime(String str, long j, Aweme aweme, String str2);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final IMLDataCenterService instance() {
        Companion.getClass();
        return C48563J4d.LIZ;
    }
}
