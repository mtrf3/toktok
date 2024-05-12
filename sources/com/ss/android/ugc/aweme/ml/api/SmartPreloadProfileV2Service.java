package com.ss.android.ugc.aweme.ml.api;

import X.C48567J4h;
import X.C48572J4m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class SmartPreloadProfileV2Service implements ISmartPreloadProfileV2Service {
    public static final C48572J4m Companion = new C48572J4m();
    public static final boolean debug = false;

    public abstract /* synthetic */ boolean enable();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service
    public abstract /* synthetic */ boolean ensureEvaluatorAvailable();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service
    public abstract /* synthetic */ float smartJudge(Aweme aweme, Map<String, Object> map, Map<String, Object> map2);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartPreloadProfileV2Service instance() {
        Companion.getClass();
        return C48567J4h.LIZ;
    }
}
