package com.ss.android.ugc.aweme.ml.impl;

import X.C47545IlJ;
import X.C48569J4j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SmartPreloadCommentV2ServiceImpl extends SmartPreloadCommentV2Service {
    public static final /* synthetic */ int LIZIZ = 0;
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service
    public final boolean enable() {
        if (C48569J4j.LIZ.LIZIZ != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service, com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public final boolean ensureEvaluatorAvailable() {
        boolean z = true;
        if (!this.LIZ) {
            C47545IlJ c47545IlJ = C48569J4j.LIZ.LIZ;
            if (c47545IlJ == null || !c47545IlJ.LIZLLL()) {
                z = false;
            }
            this.LIZ = z;
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service, com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public final float smartJudge(Aweme aweme, Map<String, Object> inputMap, Map<String, Object> outputMap) {
        o.LJIIIZ(inputMap, "inputMap");
        o.LJIIIZ(outputMap, "outputMap");
        if (aweme == null) {
            return -1.0f;
        }
        SmartPreloadCommentV2Service.Companion.getClass();
        if (enable()) {
            try {
                boolean z = SmartPreloadCommentV2Service.debug;
                if (z) {
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                }
                C48569J4j.LIZ.LIZ(inputMap, outputMap);
                if (z) {
                    System.currentTimeMillis();
                }
                if (outputMap.containsKey("label")) {
                    if (z) {
                        System.currentTimeMillis();
                    }
                    Object obj = outputMap.get("label");
                    o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
                    Object obj2 = outputMap.get("probability");
                    if (z) {
                        System.currentTimeMillis();
                    }
                    if (!(obj2 instanceof Float)) {
                        return -1.0f;
                    }
                    return ((Number) obj2).floatValue();
                }
                if (z) {
                    System.currentTimeMillis();
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }
}
