package com.ss.android.ugc.aweme.ml.infra;

import X.C48044ItM;
import X.C48514J2g;
import X.IFF;
import X.InterfaceC48513J2f;
import X.J42;
import X.J4H;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* loaded from: classes9.dex */
public final class SmartClassifyServiceImpl extends SmartClassifyService {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public final boolean enable(String str) {
        SmartMLSceneService.Companion.getClass();
        return C48514J2g.LIZ.enable(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public final void ensureEnvAvailable(String str) {
        SmartMLSceneService.Companion.getClass();
        C48514J2g.LIZ.ensureEnvAvailable(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public final boolean isEnvReady(String str) {
        SmartMLSceneService.Companion.getClass();
        return C48514J2g.LIZ.isEnvReady(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService
    public final Map<String, Float> lastPredictResultScoreMap(String str) {
        SmartMLSceneService.Companion.getClass();
        C48044ItM lastSuccessRunResult = C48514J2g.LIZ.lastSuccessRunResult(str);
        if (lastSuccessRunResult != null) {
            return lastSuccessRunResult.LIZIZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public final void configSceneModel(String str, SmartClassifySceneConfig smartClassifySceneConfig) {
        if (str == null || str.length() == 0 || smartClassifySceneConfig == null || !TextUtils.equals(smartClassifySceneConfig.outType, "classify") || !TextUtils.equals(str, smartClassifySceneConfig.getScene())) {
            SmartClassifyService.Companion.getClass();
        } else {
            SmartMLSceneService.Companion.getClass();
            C48514J2g.LIZ.configSceneModel(str, smartClassifySceneConfig);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService
    public final String lastPredictResultLabel(String str, String str2) {
        String str3;
        SmartMLSceneService.Companion.getClass();
        C48044ItM lastSuccessRunResult = C48514J2g.LIZ.lastSuccessRunResult(str);
        if (lastSuccessRunResult == null || (str3 = lastSuccessRunResult.LIZ) == null) {
            return str2;
        }
        return str3;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService
    public final void classifyWithAweme(String str, Aweme aweme, J4H j4h) {
        classifyWithAweme(str, aweme, null, j4h);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public final void classify(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, J4H j4h) {
        SmartMLSceneService.Companion.getClass();
        C48514J2g.LIZ.run(str, iff, null, new J42(j4h));
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService
    public final void classifyWithAweme(String str, Aweme aweme, InterfaceC48513J2f interfaceC48513J2f, J4H j4h) {
        IFF iff = new IFF();
        iff.LJIIIIZZ = aweme;
        classify(str, iff, null, j4h);
    }
}
