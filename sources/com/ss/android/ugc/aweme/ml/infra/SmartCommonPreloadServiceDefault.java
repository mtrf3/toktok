package com.ss.android.ugc.aweme.ml.infra;

import X.IFF;
import X.InterfaceC48513J2f;
import X.InterfaceC48561J4b;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public final class SmartCommonPreloadServiceDefault extends SmartCommonPreloadService {
    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService, com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService
    public void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public void configOneNewService(SmartClassifySceneConfig smartClassifySceneConfig) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public boolean enable(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public void ensureEnvAvailable(String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public boolean isEnvReady(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public boolean lastResult(String str, boolean z) {
        return z;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public float lastResultScore(String str, float f) {
        return f;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public void smartJudge(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48561J4b interfaceC48561J4b) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public void smartJudgeWithAweme(String str, Aweme aweme, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48561J4b interfaceC48561J4b) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public void smartJudgeWithAweme(String str, Aweme aweme, InterfaceC48561J4b interfaceC48561J4b) {
    }
}
