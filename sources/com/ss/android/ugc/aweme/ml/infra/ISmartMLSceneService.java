package com.ss.android.ugc.aweme.ml.infra;

import X.C48044ItM;
import X.IFF;
import X.InterfaceC48512J2e;
import X.InterfaceC48513J2f;

/* loaded from: classes9.dex */
public interface ISmartMLSceneService {
    void configSceneModel(String str, SmartSceneConfig smartSceneConfig);

    boolean enable(String str);

    void ensureEnvAvailable(String str);

    boolean isEnvReady(String str);

    int lastRunErrorCode(String str);

    C48044ItM lastSuccessRunResult(String str);

    void run(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48512J2e interfaceC48512J2e);

    void runDelay(String str, long j, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48512J2e interfaceC48512J2e);
}
