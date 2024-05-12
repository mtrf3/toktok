package com.ss.android.ugc.aweme.ml.infra;

import X.IFF;
import X.InterfaceC48513J2f;
import X.InterfaceC48558J3y;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public final class SmartRegressCalculateServiceDefault extends SmartRegressCalculateService {
    @Override // com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService
    public void calculate(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48558J3y interfaceC48558J3y) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService
    public void calculateWithAweme(String str, Aweme aweme, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48558J3y interfaceC48558J3y) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService
    public void calculateWithAweme(String str, Aweme aweme, InterfaceC48558J3y interfaceC48558J3y) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService
    public void configSceneModel(String str, SmartRegressionSceneConfig smartRegressionSceneConfig) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService
    public boolean enable(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService
    public void ensureEnvAvailable(String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService
    public boolean isEnvReady(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService
    public float lastCalculateResult(String str, float f) {
        return f;
    }
}
