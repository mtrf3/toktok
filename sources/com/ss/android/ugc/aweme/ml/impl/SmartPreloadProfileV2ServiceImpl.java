package com.ss.android.ugc.aweme.ml.impl;

import X.C47546IlK;
import X.C48570J4k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SmartPreloadProfileV2ServiceImpl extends SmartPreloadProfileV2Service {
    public static final /* synthetic */ int LIZIZ = 0;
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service
    public final boolean enable() {
        if (C48570J4k.LIZ.LIZIZ != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service, com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service
    public final boolean ensureEvaluatorAvailable() {
        boolean z = true;
        if (!this.LIZ) {
            C47546IlK c47546IlK = C48570J4k.LIZ.LIZ;
            if (c47546IlK == null || !c47546IlK.LIZLLL()) {
                z = false;
            }
            this.LIZ = z;
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service, com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service
    public final float smartJudge(Aweme aweme, Map<String, Object> inputMap, Map<String, Object> outputMap) {
        o.LJIIIZ(inputMap, "inputMap");
        o.LJIIIZ(outputMap, "outputMap");
        if (aweme == null) {
            return -1.0f;
        }
        SmartPreloadProfileV2Service.Companion.getClass();
        if (enable()) {
            try {
                boolean z = SmartPreloadProfileV2Service.debug;
                if (z) {
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                }
                C48570J4k.LIZ.LIZ(inputMap, outputMap);
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
