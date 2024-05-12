package com.ss.android.ugc.aweme.ml.infra;

import X.AbstractC48521J2n;
import X.C48044ItM;
import X.C48514J2g;
import X.C48515J2h;
import X.IFF;
import X.InterfaceC48512J2e;
import X.InterfaceC48513J2f;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class SmartMLSceneService implements ISmartMLSceneService {
    public static final C48515J2h Companion = new C48515J2h();

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public abstract /* synthetic */ void configSceneModel(String str, SmartSceneConfig smartSceneConfig);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public abstract /* synthetic */ boolean enable(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public abstract /* synthetic */ void ensureEnvAvailable(String str);

    public abstract /* synthetic */ AbstractC48521J2n getSmartRunner(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public abstract /* synthetic */ boolean isEnvReady(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public abstract /* synthetic */ int lastRunErrorCode(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public abstract /* synthetic */ C48044ItM lastSuccessRunResult(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public abstract /* synthetic */ void run(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48512J2e interfaceC48512J2e);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public abstract /* synthetic */ void runDelay(String str, long j, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48512J2e interfaceC48512J2e);

    public abstract /* synthetic */ Map<String, Object> runSync(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f);

    public static final ISmartMLSceneService instance() {
        Companion.getClass();
        return C48514J2g.LIZ;
    }
}
