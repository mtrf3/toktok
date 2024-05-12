package com.ss.android.ugc.aweme.ml.infra;

import X.C48044ItM;
import X.C48514J2g;
import X.C48556J3w;
import X.IFF;
import X.InterfaceC48513J2f;
import X.InterfaceC48558J3y;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public final class SmartRegressCalculateServiceImpl extends SmartRegressCalculateService {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService
    public final boolean enable(String str) {
        SmartMLSceneService.Companion.getClass();
        return C48514J2g.LIZ.enable(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService
    public final void ensureEnvAvailable(String str) {
        SmartMLSceneService.Companion.getClass();
        C48514J2g.LIZ.ensureEnvAvailable(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService
    public final boolean isEnvReady(String str) {
        SmartMLSceneService.Companion.getClass();
        return C48514J2g.LIZ.isEnvReady(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService
    public final void configSceneModel(String str, SmartRegressionSceneConfig smartRegressionSceneConfig) {
        if (str == null || str.length() == 0 || smartRegressionSceneConfig == null || !TextUtils.equals(smartRegressionSceneConfig.outType, "regression") || !TextUtils.equals(str, smartRegressionSceneConfig.getScene())) {
            SmartRegressCalculateService.Companion.getClass();
        } else {
            SmartMLSceneService.Companion.getClass();
            C48514J2g.LIZ.configSceneModel(str, smartRegressionSceneConfig);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService
    public final float lastCalculateResult(String str, float f) {
        Float f2;
        SmartMLSceneService.Companion.getClass();
        C48044ItM lastSuccessRunResult = C48514J2g.LIZ.lastSuccessRunResult(str);
        if (lastSuccessRunResult != null && (f2 = lastSuccessRunResult.LIZJ) != null) {
            return f2.floatValue();
        }
        return f;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService
    public final void calculateWithAweme(String str, Aweme aweme, InterfaceC48558J3y interfaceC48558J3y) {
        calculateWithAweme(str, aweme, null, null);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService
    public final void calculate(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48558J3y interfaceC48558J3y) {
        SmartMLSceneService.Companion.getClass();
        C48514J2g.LIZ.run(str, iff, null, new C48556J3w());
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateService
    public final void calculateWithAweme(String str, Aweme aweme, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48558J3y interfaceC48558J3y) {
        IFF iff = new IFF();
        iff.LJIIIIZZ = aweme;
        calculate(str, iff, null, null);
    }
}
