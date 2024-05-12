package com.ss.android.ugc.aweme.feature.pitaya.producer;

import X.C46249IDd;
import X.C46434IKg;
import X.C47322Ihi;
import X.C48563J4d;
import X.C48583J4x;
import X.IED;
import com.bytedance.pitaya.api.feature.store.PTYFeatureProducer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IESBasicFeaturePTYProducer extends PTYFeatureProducer {
    public static final IESBasicFeaturePTYProducer INSTANCE = new IESBasicFeaturePTYProducer();
    public static final ConcurrentHashMap<String, InputFeaturesConfig> cache = new ConcurrentHashMap<>();

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public String getGroupName() {
        return "ies_basic";
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public float getNumericFeature(String featureName, JSONObject jSONObject) {
        o.LJIIIZ(featureName, "featureName");
        return 0.0f;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public JSONArray getSeqFeature(String featureName, JSONObject jSONObject) {
        o.LJIIIZ(featureName, "featureName");
        return null;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public String getStringFeature(String featureName, JSONObject jSONObject) {
        o.LJIIIZ(featureName, "featureName");
        return null;
    }

    public final ConcurrentHashMap<String, InputFeaturesConfig> getCache() {
        return cache;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public JSONObject getDictFeature(String featureName, JSONObject jSONObject) {
        String optString;
        Aweme aweme;
        o.LJIIIZ(featureName, "featureName");
        if (o.LJ(featureName, "batch_feature")) {
            if (jSONObject != null) {
                try {
                    optString = jSONObject.optString("serviceName");
                } catch (Exception unused) {
                }
            } else {
                optString = null;
            }
            if (optString == null) {
                return null;
            }
            InputFeaturesConfig inputFeaturesConfig = cache.get(optString);
            if (inputFeaturesConfig == null) {
                JSONObject optJSONObject = jSONObject.optJSONObject("features");
                if (optJSONObject == null) {
                    return null;
                }
                String jSONObject2 = optJSONObject.toString();
                o.LJIIIIZZ(jSONObject2, "featureConfigJson.toString()");
                inputFeaturesConfig = (InputFeaturesConfig) C48583J4x.LIZ(jSONObject2, InputFeaturesConfig.class);
                MLDataCenterService.Companion.getClass();
                C48563J4d.LIZ.addSceneModelConfig(inputFeaturesConfig);
            }
            String optString2 = jSONObject.optString("awemeId");
            if (optString2 == null) {
                optString2 = null;
            }
            String optString3 = jSONObject.optString("enterType");
            if (optString3 == null) {
                optString3 = null;
            }
            String optString4 = jSONObject.optString("runKey");
            if (optString4 == null) {
                optString4 = null;
            }
            boolean optBoolean = jSONObject.optBoolean("forTrack");
            C47322Ihi c47322Ihi = new C47322Ihi(0);
            if (optString2 != null) {
                MLCommonService.Companion.getClass();
                IED awemeAdapter = C46434IKg.LIZ.getAwemeAdapter();
                if (awemeAdapter != null) {
                    aweme = C46249IDd.LIZ(optString2);
                } else {
                    aweme = null;
                }
                c47322Ihi.LJI = aweme;
            }
            c47322Ihi.LIZIZ = optString3;
            c47322Ihi.LIZ = optString4;
            MLDataCenterService.Companion.getClass();
            C48563J4d.LIZ.fillInputFeatures(inputFeaturesConfig, c47322Ihi, optBoolean);
            return new JSONObject(c47322Ihi.LIZ());
        }
        return null;
    }
}
