package com.ss.android.ugc.aweme.feature.pitaya.producer;

import X.C48537J3d;
import com.bytedance.pitaya.api.feature.store.PTYFeatureProducer;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class PortraitFeaturePTYProducer extends PTYFeatureProducer {
    public static final PortraitFeaturePTYProducer INSTANCE = new PortraitFeaturePTYProducer();

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public String getGroupName() {
        return "portrait";
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public JSONArray getSeqFeature(String featureName, JSONObject jSONObject) {
        o.LJIIIZ(featureName, "featureName");
        return null;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public JSONObject getDictFeature(String featureName, JSONObject jSONObject) {
        JSONArray optJSONArray;
        o.LJIIIZ(featureName, "featureName");
        if (!o.LJ(featureName, "batch_feature") || jSONObject == null || (optJSONArray = jSONObject.optJSONArray("keys")) == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString = optJSONArray.optString(i);
            jSONObject2.put(optString, C48537J3d.LIZ().LIZJ(optString));
        }
        return jSONObject2;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public float getNumericFeature(String featureName, JSONObject jSONObject) {
        o.LJIIIZ(featureName, "featureName");
        return C48537J3d.LIZ().LIZLLL(featureName);
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
    public String getStringFeature(String featureName, JSONObject jSONObject) {
        o.LJIIIZ(featureName, "featureName");
        return C48537J3d.LIZ().LIZJ(featureName);
    }
}
