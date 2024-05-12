package com.ss.android.ugc.aweme.ml.api;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* loaded from: classes9.dex */
public interface ISmartPreloadCommentV2Service {
    boolean ensureEvaluatorAvailable();

    float smartJudge(Aweme aweme, Map<String, Object> map, Map<String, Object> map2);
}
