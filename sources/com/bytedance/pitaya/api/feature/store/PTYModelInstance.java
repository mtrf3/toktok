package com.bytedance.pitaya.api.feature.store;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class PTYModelInstance implements ReflectionCall {
    public JSONObject features;
    public final String instanceID;
    public final Map<String, Float> labels;
    public final Map<String, Float> predicts;

    private final String getFeatureStr() {
        String jSONObject = this.features.toString();
        o.LJFF(jSONObject, "features.toString()");
        return jSONObject;
    }

    private final String getLabelsStr() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Float> entry : this.labels.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        String jSONObject2 = jSONObject.toString();
        o.LJFF(jSONObject2, "json.toString()");
        return jSONObject2;
    }

    private final String getPredictsStr() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Float> entry : this.predicts.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        String jSONObject2 = jSONObject.toString();
        o.LJFF(jSONObject2, "json.toString()");
        return jSONObject2;
    }

    public final JSONObject getFeatures() {
        return this.features;
    }

    public final String getInstanceID() {
        return this.instanceID;
    }

    public final Object getFeature(String featureName) {
        o.LJIIJ(featureName, "featureName");
        return this.features.opt(featureName);
    }

    public final void updateFeatures$pitayacore_release(JSONObject json) {
        o.LJIIJ(json, "json");
        this.features = json;
    }

    public PTYModelInstance(String instanceID, String featureStr) {
        o.LJIIJ(instanceID, "instanceID");
        o.LJIIJ(featureStr, "featureStr");
        this.instanceID = instanceID;
        this.features = new JSONObject(featureStr);
        this.labels = new LinkedHashMap();
        this.predicts = new LinkedHashMap();
    }

    public final void addLabel(String name, float f) {
        o.LJIIJ(name, "name");
        this.labels.put(name, Float.valueOf(f));
    }

    public final void addPredict(String name, float f) {
        o.LJIIJ(name, "name");
        this.predicts.put(name, Float.valueOf(f));
    }

    public final void upload(float f, String business, int i, String tag) {
        o.LJIIJ(business, "business");
        o.LJIIJ(tag, "tag");
        IFeatureStore featureStore = PTYFeatureStoreInstance.INSTANCE.getFeatureStore();
        if (featureStore != null) {
            featureStore.upload(this, f, business, i, tag);
        }
    }

    public static /* synthetic */ void upload$default(PTYModelInstance pTYModelInstance, float f, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            str2 = "";
        }
        pTYModelInstance.upload(f, str, i, str2);
    }
}
