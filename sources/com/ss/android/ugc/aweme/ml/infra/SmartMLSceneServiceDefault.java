package com.ss.android.ugc.aweme.ml.infra;

import X.AbstractC48521J2n;
import X.C48044ItM;
import X.IFF;
import X.InterfaceC48512J2e;
import X.InterfaceC48513J2f;
import java.util.Map;

/* loaded from: classes9.dex */
public final class SmartMLSceneServiceDefault extends SmartMLSceneService {
    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public void configSceneModel(String str, SmartSceneConfig smartSceneConfig) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public boolean enable(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public void ensureEnvAvailable(String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService
    public AbstractC48521J2n getSmartRunner(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public boolean isEnvReady(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public int lastRunErrorCode(String str) {
        return -100;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public C48044ItM lastSuccessRunResult(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public void run(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48512J2e interfaceC48512J2e) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public void runDelay(String str, long j, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48512J2e interfaceC48512J2e) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService
    public Map<String, Object> runSync(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f) {
        return null;
    }
}
