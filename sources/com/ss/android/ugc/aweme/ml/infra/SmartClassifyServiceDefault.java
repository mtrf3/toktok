package com.ss.android.ugc.aweme.ml.infra;

import X.IFF;
import X.InterfaceC48513J2f;
import X.J4H;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* loaded from: classes9.dex */
public final class SmartClassifyServiceDefault extends SmartClassifyService {
    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public void classify(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, J4H j4h) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService
    public void classifyWithAweme(String str, Aweme aweme, InterfaceC48513J2f interfaceC48513J2f, J4H j4h) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService
    public void classifyWithAweme(String str, Aweme aweme, J4H j4h) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public void configSceneModel(String str, SmartClassifySceneConfig smartClassifySceneConfig) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public boolean enable(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public void ensureEnvAvailable(String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public boolean isEnvReady(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService
    public String lastPredictResultLabel(String str, String str2) {
        return str2;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService
    public Map<String, Float> lastPredictResultScoreMap(String str) {
        return null;
    }
}
