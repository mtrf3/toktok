package com.ss.android.ugc.aweme.ml.api;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SmartPreloadCommentV2ServiceDefault extends SmartPreloadCommentV2Service {
    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service
    public boolean enable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service, com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public boolean ensureEvaluatorAvailable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service, com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public float smartJudge(Aweme aweme, Map<String, Object> inputMap, Map<String, Object> outputMap) {
        o.LJIIIZ(inputMap, "inputMap");
        o.LJIIIZ(outputMap, "outputMap");
        return -1.0f;
    }
}
