package com.ss.android.ugc.aweme.ml.api;

import X.C48566J4g;
import X.C48571J4l;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class SmartPreloadCommentV2Service implements ISmartPreloadCommentV2Service {
    public static final C48571J4l Companion = new C48571J4l();
    public static final boolean debug = false;

    public abstract /* synthetic */ boolean enable();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public abstract /* synthetic */ boolean ensureEvaluatorAvailable();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public abstract /* synthetic */ float smartJudge(Aweme aweme, Map<String, Object> map, Map<String, Object> map2);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartPreloadCommentV2Service instance() {
        Companion.getClass();
        return C48566J4g.LIZ;
    }
}
