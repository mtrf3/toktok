package com.ss.android.ugc.aweme.ml.infra;

import X.IFF;
import X.InterfaceC48513J2f;
import X.J4H;

/* loaded from: classes9.dex */
public interface ISmartClassifyService {
    void classify(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, J4H j4h);

    void configSceneModel(String str, SmartClassifySceneConfig smartClassifySceneConfig);

    boolean enable(String str);

    void ensureEnvAvailable(String str);

    boolean isEnvReady(String str);
}
