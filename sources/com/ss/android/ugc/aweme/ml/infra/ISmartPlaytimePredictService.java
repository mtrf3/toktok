package com.ss.android.ugc.aweme.ml.infra;

import X.IFF;
import X.InterfaceC48512J2e;
import X.InterfaceC48513J2f;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;

/* loaded from: classes9.dex */
public interface ISmartPlaytimePredictService {
    void checkAndInit();

    void configOneNewService(OnePlaytimePredictConfig onePlaytimePredictConfig);

    boolean enable(String str);

    void ensureEnvAvailable(String str);

    void predict(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48512J2e interfaceC48512J2e);
}
