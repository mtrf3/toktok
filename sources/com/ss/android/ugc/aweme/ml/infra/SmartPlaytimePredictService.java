package com.ss.android.ugc.aweme.ml.infra;

import X.C48553J3t;
import X.C48554J3u;
import X.IFF;
import X.InterfaceC48512J2e;
import X.InterfaceC48513J2f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class SmartPlaytimePredictService implements ISmartPlaytimePredictService {
    public static final C48554J3u Companion = new C48554J3u();
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public abstract /* synthetic */ void checkAndInit();

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public abstract /* synthetic */ void configOneNewService(OnePlaytimePredictConfig onePlaytimePredictConfig);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public abstract /* synthetic */ boolean enable(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public abstract /* synthetic */ void ensureEnvAvailable(String str);

    public abstract /* synthetic */ boolean isEnvReady(String str);

    public abstract /* synthetic */ float lastPredictFloatResult(String str, float f);

    public abstract /* synthetic */ String lastPredictResultLabel(String str, String str2);

    public abstract /* synthetic */ Map<String, Float> lastPredictResultScoreMap(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public abstract /* synthetic */ void predict(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48512J2e interfaceC48512J2e);

    public abstract /* synthetic */ void predictWithAweme(String str, Aweme aweme, InterfaceC48512J2e interfaceC48512J2e);

    public abstract /* synthetic */ void predictWithAweme(String str, Aweme aweme, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48512J2e interfaceC48512J2e);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartPlaytimePredictService instance() {
        Companion.getClass();
        return C48553J3t.LIZ;
    }
}
