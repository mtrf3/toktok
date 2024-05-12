package com.ss.android.ugc.aweme.ml.infra;

import X.C48044ItM;
import X.C48514J2g;
import X.IFF;
import X.InterfaceC48513J2f;
import X.InterfaceC48561J4b;
import X.J40;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SmartCommonPreloadServiceImpl extends SmartCommonPreloadService {
    public static final /* synthetic */ int LIZIZ = 0;
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService, com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService
    public final void checkAndInit() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final void configOneNewService(SmartClassifySceneConfig smartClassifySceneConfig) {
        SmartCommonPreloadService.Companion.getClass();
        if (smartClassifySceneConfig != null) {
            SmartMLSceneService.Companion.getClass();
            C48514J2g.LIZ.configSceneModel(smartClassifySceneConfig.getScene(), smartClassifySceneConfig);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final boolean enable(String str) {
        SmartMLSceneService.Companion.getClass();
        return C48514J2g.LIZ.enable(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final void ensureEnvAvailable(String str) {
        SmartMLSceneService.Companion.getClass();
        C48514J2g.LIZ.ensureEnvAvailable(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final boolean isEnvReady(String str) {
        SmartMLSceneService.Companion.getClass();
        return C48514J2g.LIZ.isEnvReady(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final boolean lastResult(String str, boolean z) {
        String str2;
        SmartMLSceneService.Companion.getClass();
        C48044ItM lastSuccessRunResult = C48514J2g.LIZ.lastSuccessRunResult(str);
        if (lastSuccessRunResult == null || (str2 = lastSuccessRunResult.LIZ) == null) {
            return z;
        }
        String lowerCase = str2.toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        return o.LJ(lowerCase, "true");
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final float lastResultScore(String str, float f) {
        Float LIZIZ2;
        SmartMLSceneService.Companion.getClass();
        C48044ItM lastSuccessRunResult = C48514J2g.LIZ.lastSuccessRunResult(str);
        if (lastSuccessRunResult != null && (LIZIZ2 = lastSuccessRunResult.LIZIZ()) != null) {
            return LIZIZ2.floatValue();
        }
        return f;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final void smartJudgeWithAweme(String str, Aweme aweme, InterfaceC48561J4b interfaceC48561J4b) {
        smartJudgeWithAweme(str, aweme, null, null);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final void smartJudge(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48561J4b interfaceC48561J4b) {
        SmartMLSceneService.Companion.getClass();
        C48514J2g.LIZ.run(str, iff, null, new J40());
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final void smartJudgeWithAweme(String str, Aweme aweme, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48561J4b interfaceC48561J4b) {
        IFF iff = new IFF();
        iff.LJIIIIZZ = aweme;
        smartJudge(str, iff, null, null);
    }
}
