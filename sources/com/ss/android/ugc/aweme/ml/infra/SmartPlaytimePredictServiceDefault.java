package com.ss.android.ugc.aweme.ml.infra;

import X.IFF;
import X.InterfaceC48512J2e;
import X.InterfaceC48513J2f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import java.util.Map;

/* loaded from: classes9.dex */
public final class SmartPlaytimePredictServiceDefault extends SmartPlaytimePredictService {
    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public void configOneNewService(OnePlaytimePredictConfig onePlaytimePredictConfig) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public boolean enable(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public void ensureEnvAvailable(String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public boolean isEnvReady(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public float lastPredictFloatResult(String str, float f) {
        return f;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public String lastPredictResultLabel(String str, String str2) {
        return str2;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public Map<String, Float> lastPredictResultScoreMap(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public void predict(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48512J2e interfaceC48512J2e) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public void predictWithAweme(String str, Aweme aweme, InterfaceC48512J2e interfaceC48512J2e) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public void predictWithAweme(String str, Aweme aweme, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48512J2e interfaceC48512J2e) {
    }
}
